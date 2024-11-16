# Write your MySQL query statement below
SELECT
    e1.name
FROM
    Employee e1 
JOIN 
    Employee e2
ON
    e1.id = e2.managerId
group by e1.id
HAVING COUNT(e1.id) >= 5;