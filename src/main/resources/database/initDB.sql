CREATE TABLE IF NOT EXISTS customers(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    fist_name VARCHAR(50) NOT NULL ,
    last_name VARCHAR(100) NOT NULL ,
    adress VARCHAR(1000) NOT NULL ,
    budget DECIMAL NOT NULL
);