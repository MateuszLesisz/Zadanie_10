create table book
(
    id        bigint       not null primary key AUTO_INCREMENT,
    title     varchar(100) not null,
    category  varchar(100) not null,
    pages     int          not null,
    for_kids  varchar(3)   not null,
    author_id bigint       not null,
    client_id bigint               ,
    CONSTRAINT `fk_book_author_id`
        FOREIGN KEY (author_id)
            REFERENCES `library`.`author` (id),
    CONSTRAINT `fk_book_client_id`
        FOREIGN KEY (client_id)
            REFERENCES `library`.`client` (id)
);