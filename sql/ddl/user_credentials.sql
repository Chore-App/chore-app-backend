create table if not exists user_credentials
(
    user_id         integer not null
        constraint user_credentials_pk
            primary key
        constraint user_credentials_users_id_fk
            references users
            on delete restrict,
    password_hashed varchar not null
);