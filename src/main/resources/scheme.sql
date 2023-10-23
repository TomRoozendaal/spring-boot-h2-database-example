    DROP TABLE IF EXISTS CURRENCY;  
    CREATE TABLE CURRENCY (  
    currency_ticker CHAR(3) PRIMARY KEY,  
    currency_name VARCHAR(50) NOT NULL,  
    currency_value INT NOT NULL,
    currency_market_cap INT NOT NULL  
    );  