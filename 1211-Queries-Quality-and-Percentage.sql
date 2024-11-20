# Write your MySQL query statement below
SELECT 
    q.query_name ,
    ROUND(AVG(q.rating/q.position),2) AS quality ,
    ROUND(AVG(Case when q.rating < 3 then 1 ELSE 0 END  )*100,2) AS poor_query_percentage
FROM
    Queries q
WHERE
    q.query_name is not null
GROUP BY
    q.query_name 