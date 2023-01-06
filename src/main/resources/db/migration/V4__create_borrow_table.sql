create table borrow
(
    id        bigint       not null primary key AUTO_INCREMENT,
    book_id bigint         not null,
    client_id bigint       not null,
    CONSTRAINT `fk_borrow_book_id`
        FOREIGN KEY (book_id)
            REFERENCES `library`.`book` (id),
    CONSTRAINT `fk_borrow_client_id`
        FOREIGN KEY (client_id)
            REFERENCES `library`.`client` (id)
);