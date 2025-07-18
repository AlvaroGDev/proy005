    drop table if exists motor cascade 
    drop sequence if exists motor_seq

    create sequence motor_seq start with 1 increment by 50
    create table motor (
        encendido boolean not null,
        potencia float(53) not null,
        id bigint not null,
        marca varchar(255),
        primary key (id)
    )