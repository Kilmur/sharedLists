package maksimstarikov.sharedlist.utils;

import lombok.RequiredArgsConstructor;
import maksimstarikov.sharedlist.services.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class UniqueIdGenerator {

    private final AccountService accountService;
    private final Random random = new Random();

    private static final List<Character> VOWELS = List.of('b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'x', 'z');
    private static final List<Character> CONSONANTS = List.of('a', 'е', 'i', 'о', 'u');
    private static final int CONSONANT_SIZE = CONSONANTS.size();
    private static final int VOWELS_SIZE = VOWELS.size();

    public String getNewUniqueId() {
        String uniqueId = null;
        do {
            uniqueId = generateUniqueId();
        } while (accountService.isExistByUniqueId(uniqueId));
        return uniqueId;
    }

    private String generateUniqueId() {
        return String.valueOf(VOWELS.get(random.nextInt(VOWELS_SIZE))) +
                CONSONANTS.get(random.nextInt(CONSONANT_SIZE)) +
                VOWELS.get(random.nextInt(VOWELS_SIZE)) +
                CONSONANTS.get(random.nextInt(CONSONANT_SIZE)) +
                random.nextInt(1000, 9999);
    }
}
