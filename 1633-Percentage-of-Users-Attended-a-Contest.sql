# Write your MySQL query statement below
SELECT r.contest_id , ROUND((COUNT(r.user_id)*100.0/(SELECT COUNT(*) from Users)),2) AS percentage 
FROM  Register r join Users u on  r.user_id = u.user_id
GROUP BY r.contest_id
ORDER BY 
    percentage DESC, 
    r.contest_id ASC;