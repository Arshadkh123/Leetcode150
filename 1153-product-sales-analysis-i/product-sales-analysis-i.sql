# Write your MySQL query statement below
Select p.product_name , s.year , s.price
From Sales s
Left join Product p
ON s.product_id = p.product_id