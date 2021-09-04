select O.product_name from ORDERS O
LEFT JOIN CUSTOMERS C on O.customer_id = C.id
where C.name = :name;