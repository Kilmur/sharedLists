# shared lists
Easy backend for training creating android client.

### сборка и запуск
docker build -t shared-list:1 .
docker run -p 8001:8000 shared-list:1

### запуск нового контейнера
docker run --name pg -p 5432:5432 -e POSTGRES_USER=shl -e POSTGRES_PASSWORD=123 -e POSTGRES_DB=sharedlist -d postgres

### подключение к запущенному контейнеру
docker exec -it 1a56a355d37a bash

### переход в psql внутри контейнера
psql -U postgres

### пользователь, база, полномочия
create user shl with password '123';
create database sharedlist;
grant all privileges on database sharedlist to shl;

### сохранить образ
docker commit pg_with_sharedlist
### поставить тэг
docker tag 934f538c033a pg_with_sharedlist
