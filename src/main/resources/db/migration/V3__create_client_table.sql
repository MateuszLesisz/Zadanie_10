create table client
(
    id          bigint not null primary key AUTO_INCREMENT,
    name        varchar(100) not null,
    book_id     bigint not null,
        CONSTRAINT `fk_client_book_id`
            FOREIGN KEY (book_id)
                REFERENCES `library`.`book` (id)
);