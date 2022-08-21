SET SEARCH_PATH TO main;

CREATE TABLE account_list (
  id BIGSERIAL NOT NULL PRIMARY KEY,
  uuid UUID NOT NULL,
  account_id BIGINT NOT NULL REFERENCES account,
  name TEXT NOT NULL,
  description TEXT,
  color TEXT NOT NULL,
  created TIMESTAMP NOT NULL
);

CREATE UNIQUE INDEX account_list_uuid_uidx on account_list (uuid);
CREATE INDEX account_list_account_id_idx on account_list (account_id);