package maksimstarikov.sharedlist.security;

import lombok.RequiredArgsConstructor;
import maksimstarikov.sharedlist.models.entities.Account;
import maksimstarikov.sharedlist.services.AccountService;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Component
@RequiredArgsConstructor
public class JwtFilter extends GenericFilterBean {

    private final JwtUtils jwtUtils;
    private final AccountService accountService;

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        String token = jwtUtils.getTokenFromRequest((HttpServletRequest) servletRequest);
        if (token != null && jwtUtils.isValidToken(token)) {
            String login = jwtUtils.getLoginFromToken(token);
            Account account = accountService.getByLoginWithRoles(login).orElseThrow();
            UsernamePasswordAuthenticationToken auth = new UsernamePasswordAuthenticationToken(account, null, account.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(auth);
        }
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
