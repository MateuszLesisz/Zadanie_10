create table returned
(
    id          bigint not null primary key AUTO_INCREMENT,
    borrow_id   bigint not null,
    CONSTRAINT `fk_borrow_return_id`
        FOREIGN KEY (borrow_id)
            REFERENCES `library`.`borrow` (id)
);