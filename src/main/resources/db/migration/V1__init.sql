create table roles
(
    id              bigserial PRIMARY KEY not null,
    name            varchar(255)
);

create table users
(
    id              bigserial PRIMARY KEY not null,
    name            varchar(255),
    password        varchar(255),
    created_at      timestamp default current_timestamp,
    updated_at      timestamp default current_timestamp
);

create table todo
(
    id              bigserial PRIMARY KEY not null,
    description     varchar(255),
    isCompleted     varchar(255),
    created_at      timestamp default current_timestamp,
    updated_at      timestamp default current_timestamp
);

create table users_roles
(
    user_id         bigint,
    role_id         bigint,
    primary key (user_id, role_id),
    foreign key (user_id) references users (id),
    foreign key (role_id) references roles (id)
);

insert into roles (name)
values ('ROLE_ADMIN'),
       ('ROLE_USER');

insert into users (name, password)
values ('admin', '$2a$04$Fx/SX9.BAvtPlMyIIqqFx.hLY2Xp8nnhpzvEEVINvVpwIPbA3v/.i'),
       ('User2', '$2a$04$Fx/SX9.BAvtPlMyIIqqFx.hLY2Xp8nnhpzvEEVINvVpwIPbA3v/.i'),
       ('User3', '$2a$04$Fx/SX9.BAvtPlMyIIqqFx.hLY2Xp8nnhpzvEEVINvVpwIPbA3v/.i');

insert into users_roles (user_id, role_id)
values (1, 1),
       (2, 2),
       (3, 2);