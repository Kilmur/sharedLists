CREATE TABLE main.confirm_reg_account (
  id BIGSERIAL NOT NULL PRIMARY KEY,
  login TEXT NOT NULL,
  password TEXT NOT NULL,
  code TEXT NOT NULL,
  created_date TIMESTAMP NOT NULL
);

CREATE UNIQUE INDEX confirm_reg_account_login_uidx on main.confirm_reg_account (login);