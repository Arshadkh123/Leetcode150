# Write your MySQL query statement below
Select w1.id
FROM Weather w1
INNER JOIN Weather w2
where DATEDIFF(w1.recordDate, w2.recordDate) = 1
AND w1.temperature > w2.temperature