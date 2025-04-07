# Write your MySQL query statement below
Select eu.unique_id As unique_id, e.name AS name
from Employees e
left join EmployeeUNI eu
on e.id =eu.id