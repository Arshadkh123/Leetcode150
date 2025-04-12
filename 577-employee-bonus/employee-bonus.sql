# Write your MySQL query statement below
Select e.name, b.bonus
From Employee e
Left Join Bonus b
On e.empID = b.empID
WHERE b.bonus is NULL OR b.bonus <1000