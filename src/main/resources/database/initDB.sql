CREATE TABLE IF NOT EXISTS customers(
    id bigint AUTO_INCREMENT PRIMARY KEY,
    first_name varchar(50) NOT NULL ,
    last_name varchar(100) NOT NULL ,
    address varchar(1000) NOT NULL ,
    budget decimal NOT NULL


);

