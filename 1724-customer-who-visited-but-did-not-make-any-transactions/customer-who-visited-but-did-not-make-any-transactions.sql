# Write your MySQL query statement below
Select v.customer_id ,COUNT(customer_id)AS 
count_no_trans
FROM Visits v
Left JOIN Transactions t
on v.visit_id = t.visit_id
where t.transaction_id is NULL
Group BY v.customer_id