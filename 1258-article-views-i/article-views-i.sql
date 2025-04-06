# Write your MySQL query statement below
Select Distinct author_id AS id
From views
where author_id = viewer_id
order by id;