create table if not exists CUSTOMERS (
	id int primary key auto_increment,
	name varchar(255),
	surname varchar(255),
	age int,
	phone_number varchar(255)
);

create table if not exists ORDERS (
    id int primary key auto_increment,
    date timestamp not null,
    customer_id int,
    product_name varchar(255),
    amount decimal(19,2),
    FOREIGN KEY (customer_id) REFERENCES CUSTOMERS(id)
);