SET SEARCH_PATH TO main;

CREATE TABLE list_item (
  id BIGSERIAL NOT NULL PRIMARY KEY,
  uuid UUID NOT NULL,
  account_list_id BIGINT NOT NULL REFERENCES account_list ON DELETE CASCADE,
  name TEXT NOT NULL,
  created TIMESTAMP NOT NULL
);

CREATE UNIQUE INDEX list_item_uuid_uidx on list_item (uuid);
CREATE INDEX list_item_account_list_id_idx on list_item (account_list_id);