-- Create Bank table
CREATE TABLE Bank (
    B_id INT PRIMARY KEY,
    B_name VARCHAR(100),
    B_address VARCHAR(255)
);

-- Create Branch table
CREATE TABLE Branch (
    Br_id INT PRIMARY KEY,
    Br_name VARCHAR(100),
    Br_address VARCHAR(255),
    State VARCHAR(50),
    Country VARCHAR(50),
    Pin VARCHAR(10),
    B_id INT,
    FOREIGN KEY (B_id) REFERENCES Bank(B_id)
);

-- Create ATM table (now linked to Branch)
CREATE TABLE ATM (
    ATM_id INT PRIMARY KEY,
    Location VARCHAR(100),
    Cash_limit DECIMAL(15,2),
    Br_id INT,
    FOREIGN KEY (Br_id) REFERENCES Branch(Br_id)
);

-- Create Customer table
CREATE TABLE Customer (
    Cust_id INT PRIMARY KEY,
    Cust_name VARCHAR(100),
    Cust_address VARCHAR(255),
    State VARCHAR(50),
    Country VARCHAR(50),
    Pin VARCHAR(10),
    Phone_number VARCHAR(15),
    ATM_entry_pin VARCHAR(10)
);

-- Create Account table (linked to Customer)
CREATE TABLE Account (
    Acc_no INT PRIMARY KEY,
    Acc_type VARCHAR(50),
    Balance DECIMAL(15,2),
    Cust_id INT,
    FOREIGN KEY (Cust_id) REFERENCES Customer(Cust_id)
);

-- Create CustomerTransaction table (linked to Account instead of Customer)
CREATE TABLE CustomerTransaction (
    Tr_id INT PRIMARY KEY,
    Tr_type VARCHAR(50),
    Tr_amount DECIMAL(15,2),
    Tr_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    Acc_no INT,
    FOREIGN KEY (Acc_no) REFERENCES Account(Acc_no)
);

-- Create Operates relationship: ATM ↔ Customer
CREATE TABLE Operates (
    ATM_id INT,
    Cust_id INT,
    PRIMARY KEY (ATM_id, Cust_id),
    FOREIGN KEY (ATM_id) REFERENCES ATM(ATM_id),
    FOREIGN KEY (Cust_id) REFERENCES Customer(Cust_id)
);
