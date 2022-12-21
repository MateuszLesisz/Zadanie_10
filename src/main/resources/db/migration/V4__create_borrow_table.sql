create table borrow
(
    id          bigint not null primary key AUTO_INCREMENT,
    client_id   bigint not null,
    book_id     bigint not null,
    CONSTRAINT `fk_client_borrow_id`
        FOREIGN KEY (client_id)
            REFERENCES `library`.`client` (id),
    CONSTRAINT `fk_book_borrow_id`
        FOREIGN KEY (book_id)
            REFERENCES `library`.`book` (id)
);