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

-- Create ATM table 
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

-- Create Account table 
CREATE TABLE Account (
    Acc_no INT PRIMARY KEY,
    Acc_type VARCHAR(50),
    Balance DECIMAL(15,2),
    Cust_id INT,
    FOREIGN KEY (Cust_id) REFERENCES Customer(Cust_id)
);

-- Create CustomerTransaction table
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

-- 1. Bank 
INSERT INTO Bank (B_id, B_name, B_address) VALUES
(1, 'National Bank', '123 Main Street, Dhaka'),
(2, 'City Bank', '45 Park Avenue, Chattogram'),
(3, 'Trust Bank', '56 Green Road, Dhaka'),
(4, 'Dutch-Bangla Bank', '12 Motijheel, Dhaka'),
(5, 'Prime Bank', '88 Banani Road, Dhaka'),
(6, 'Islami Bank', '14 Agrabad, Chattogram'),
(7, 'AB Bank', '67 Kemal Ataturk Ave, Dhaka'),
(8, 'United Commercial Bank', '21 Khatunganj, Chattogram'),
(9, 'Southeast Bank', '10 Dhanmondi, Dhaka'),
(10, 'Mutual Trust Bank', '25 Gulshan-2, Dhaka'),
(11, 'IFIC Bank', '33 Uttara, Dhaka'),
(12, 'Shahjalal Islami Bank', '19 Banani, Dhaka'),
(13, 'Standard Bank', '71 Motijheel, Dhaka'),
(14, 'Jamuna Bank', '4 Gulshan Ave, Dhaka'),
(15, 'Mercantile Bank', '15 Dhanmondi, Dhaka'),
(16, 'One Bank', '5 Banani, Dhaka'),
(17, 'NRB Bank', '7 Motijheel, Dhaka'),
(18, 'EXIM Bank', '11 Dhanmondi, Dhaka'),
(19, 'Bank Asia', '9 Gulshan-1, Dhaka'),
(20, 'Modhumoti Bank', '16 Banani, Dhaka');

-- 2. Branch 
INSERT INTO Branch (Br_id, Br_name, Br_address, State, Country, Pin, B_id) VALUES
(1, 'Dhaka Central', '12 Gulshan Ave', 'Dhaka', 'Bangladesh', '1212', 1),
(2, 'Chattogram South', '88 Agrabad', 'Chattogram', 'Bangladesh', '4100', 2),
(3, 'Dhaka North', '45 Banani Road', 'Dhaka', 'Bangladesh', '1213', 3),
(4, 'Motijheel Main', '34 Motijheel', 'Dhaka', 'Bangladesh', '1000', 4),
(5, 'Banani East', '23 Banani', 'Dhaka', 'Bangladesh', '1213', 5),
(6, 'Agrabad North', '77 Agrabad', 'Chattogram', 'Bangladesh', '4101', 6),
(7, 'Uttara Sector-3', '12 Uttara', 'Dhaka', 'Bangladesh', '1230', 7),
(8, 'Khatunganj West', '33 Khatunganj', 'Chattogram', 'Bangladesh', '4102', 8),
(9, 'Dhanmondi Branch', '10 Dhanmondi', 'Dhaka', 'Bangladesh', '1209', 9),
(10, 'Gulshan-2 Branch', '25 Gulshan-2', 'Dhaka', 'Bangladesh', '1212', 10),
(11, 'Uttara Sector-4', '19 Uttara', 'Dhaka', 'Bangladesh', '1230', 11),
(12, 'Banani West', '15 Banani', 'Dhaka', 'Bangladesh', '1213', 12),
(13, 'Motijheel South', '71 Motijheel', 'Dhaka', 'Bangladesh', '1000', 13),
(14, 'Gulshan-1 Branch', '4 Gulshan Ave', 'Dhaka', 'Bangladesh', '1212', 14),
(15, 'Dhanmondi South', '15 Dhanmondi', 'Dhaka', 'Bangladesh', '1209', 15),
(16, 'Banani North', '5 Banani', 'Dhaka', 'Bangladesh', '1213', 16),
(17, 'Motijheel West', '7 Motijheel', 'Dhaka', 'Bangladesh', '1000', 17),
(18, 'Dhanmondi North', '11 Dhanmondi', 'Dhaka', 'Bangladesh', '1209', 18),
(19, 'Gulshan Central', '9 Gulshan-1', 'Dhaka', 'Bangladesh', '1212', 19),
(20, 'Banani Central', '16 Banani', 'Dhaka', 'Bangladesh', '1213', 20);

-- 3. ATM 
INSERT INTO ATM (ATM_id, Location, Cash_limit, Br_id) VALUES
(1, 'Gulshan-1', 200000.00, 1),
(2, 'Agrabad Circle', 150000.00, 2),
(3, 'Banani-11', 180000.00, 3),
(4, 'Motijheel-1', 250000.00, 4),
(5, 'Banani-Block-B', 170000.00, 5),
(6, 'Agrabad-2', 160000.00, 6),
(7, 'Uttara-3', 140000.00, 7),
(8, 'Khatunganj-1', 130000.00, 8),
(9, 'Dhanmondi-27', 150000.00, 9),
(10, 'Gulshan-2 Circle', 200000.00, 10),
(11, 'Uttara-4', 155000.00, 11),
(12, 'Banani-Block-C', 175000.00, 12),
(13, 'Motijheel-2', 240000.00, 13),
(14, 'Gulshan-1B', 210000.00, 14),
(15, 'Dhanmondi-15', 150000.00, 15),
(16, 'Banani-Block-A', 180000.00, 16),
(17, 'Motijheel-3', 230000.00, 17),
(18, 'Dhanmondi-32', 190000.00, 18),
(19, 'Gulshan-1C', 200000.00, 19),
(20, 'Banani-Block-D', 185000.00, 20);

-- 4. Customer 
INSERT INTO Customer (Cust_id, Cust_name, Cust_address, State, Country, Pin, Phone_number, ATM_entry_pin) VALUES
(1, 'Rahim Uddin', '23 Lake Road', 'Dhaka', 'Bangladesh', '1207', '01711111111', '1234'),
(2, 'Karim Ahmed', '56 Agrabad', 'Chattogram', 'Bangladesh', '4100', '01822222222', '2345'),
(3, 'Ayesha Akter', '78 Banani', 'Dhaka', 'Bangladesh', '1213', '01933333333', '3456'),
(4, 'Mehedi Hasan', '14 Uttara', 'Dhaka', 'Bangladesh', '1230', '01644444444', '4567'),
(5, 'Sadia Rahman', '22 Gulshan', 'Dhaka', 'Bangladesh', '1212', '01555555555', '5678'),
(6, 'Nusrat Jahan', '9 Motijheel', 'Dhaka', 'Bangladesh', '1000', '01766666666', '6789'),
(7, 'Imran Khan', '45 Agrabad', 'Chattogram', 'Bangladesh', '4101', '01877777777', '7890'),
(8, 'Fahim Alam', '12 Dhanmondi', 'Dhaka', 'Bangladesh', '1209', '01988888888', '8901'),
(9, 'Shakil Hossain', '55 Gulshan-2', 'Dhaka', 'Bangladesh', '1212', '01799999999', '9012'),
(10, 'Tania Sultana', '67 Banani', 'Dhaka', 'Bangladesh', '1213', '01600000000', '0123'),
(11, 'Rakibul Islam', '88 Motijheel', 'Dhaka', 'Bangladesh', '1000', '01510101010', '1357'),
(12, 'Mahmudul Hasan', '11 Banani', 'Dhaka', 'Bangladesh', '1213', '01720202020', '2468'),
(13, 'Parvin Akter', '5 Gulshan-1', 'Dhaka', 'Bangladesh', '1212', '01830303030', '3579'),
(14, 'Rafiq Chowdhury', '23 Agrabad', 'Chattogram', 'Bangladesh', '4102', '01940404040', '4680'),
(15, 'Sumi Akter', '2 Dhanmondi', 'Dhaka', 'Bangladesh', '1209', '01750505050', '5791'),
(16, 'Anisur Rahman', '18 Banani', 'Dhaka', 'Bangladesh', '1213', '01660606060', '6802'),
(17, 'Shamim Reza', '7 Gulshan-2', 'Dhaka', 'Bangladesh', '1212', '01570707070', '7913'),
(18, 'Jannat Ara', '90 Banani', 'Dhaka', 'Bangladesh', '1213', '01780808080', '8024'),
(19, 'Faruk Hossain', '11 Motijheel', 'Dhaka', 'Bangladesh', '1000', '01890909090', '9135'),
(20, 'Rehana Begum', '6 Gulshan-1', 'Dhaka', 'Bangladesh', '1212', '01900000001', '0246');

-- 5. Account 
INSERT INTO Account (Acc_no, Acc_type, Balance, Cust_id) VALUES
(1001, 'Savings', 50000.00, 1),
(1002, 'Current', 25000.00, 2),
(1003, 'Savings', 80000.00, 3),
(1004, 'Current', 30000.00, 4),
(1005, 'Savings', 60000.00, 5),
(1006, 'Current', 45000.00, 6),
(1007, 'Savings', 75000.00, 7),
(1008, 'Current', 35000.00, 8),
(1009, 'Savings', 90000.00, 9),
(1010, 'Current', 40000.00, 10),
(1011, 'Savings', 55000.00, 11),
(1012, 'Current', 27000.00, 12),
(1013, 'Savings', 88000.00, 13),
(1014, 'Current', 42000.00, 14),
(1015, 'Savings', 64000.00, 15),
(1016, 'Current', 36000.00, 16),
(1017, 'Savings', 72000.00, 17),
(1018, 'Current', 39000.00, 18),
(1019, 'Savings', 81000.00, 19),
(1020, 'Current', 41000.00, 20);

-- 6. CustomerTransaction 
INSERT INTO CustomerTransaction (Tr_id, Tr_type, Tr_amount, Acc_no) VALUES
(1, 'Deposit', 10000.00, 1001),
(2, 'Withdrawal', 5000.00, 1002),
(3, 'Deposit', 20000.00, 1003),
(4, 'Withdrawal', 8000.00, 1004),
(5, 'Deposit', 15000.00, 1005),
(6, 'Withdrawal', 7000.00, 1006),
(7, 'Deposit', 25000.00, 1007),
(8, 'Withdrawal', 5000.00, 1008),
(9, 'Deposit', 30000.00, 1009),
(10, 'Withdrawal', 6000.00, 1010),
(11, 'Deposit', 12000.00, 1011),
(12, 'Withdrawal', 4000.00, 1012),
(13, 'Deposit', 22000.00, 1013),
(14, 'Withdrawal', 9000.00, 1014),
(15, 'Deposit', 17000.00, 1015),
(16, 'Withdrawal', 8000.00, 1016),
(17, 'Deposit', 26000.00, 1017),
(18, 'Withdrawal', 5500.00, 1018),
(19, 'Deposit', 24000.00, 1019),
(20, 'Withdrawal', 7500.00, 1020);

-- 7. Operates 
INSERT INTO Operates (ATM_id, Cust_id) VALUES
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5),
(6, 6),
(7, 7),
(8, 8),
(9, 9),
(10, 10),
(11, 11),
(12, 12),
(13, 13),
(14, 14),
(15, 15),
(16, 16),
(17, 17),
(18, 18),
(19, 19),
(20, 20);
