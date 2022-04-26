SET SEARCH_PATH TO main;

CREATE TABLE account (
  id BIGSERIAL NOT NULL PRIMARY KEY,
  unique_id TEXT NOT NULL,
  login TEXT NOT NULL,
  password TEXT NOT NULL,
  first_name TEXT,
  last_name TEXT
);

CREATE UNIQUE INDEX account_login_uidx on account (login);
CREATE UNIQUE INDEX account_unique_id_uidx on account (unique_id);