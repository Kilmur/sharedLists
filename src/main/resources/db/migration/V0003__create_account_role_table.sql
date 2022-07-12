SET SEARCH_PATH TO main;

CREATE TABLE account_role (
  account_id BIGSERIAL NOT NULL REFERENCES account,
  role_name TEXT NOT NULL
);