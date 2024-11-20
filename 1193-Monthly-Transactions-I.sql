# Write your MySQL query statement below
SELECT
    DATE_FORMAT(t.trans_date  , '%Y-%m') AS month , -- Use '%m' for numerical month
    t.country ,
    COUNT(t.state) AS trans_count  ,
    SUM(CASE WHEN t.state = 'approved' THEN 1 ELSE 0 END) AS approved_count  ,
    SUM(t.amount) AS trans_total_amount ,
    SUM(CASE WHEN t.state = 'approved'  THEN t.amount ELSE 0 END) AS approved_total_amount  
FROM
    Transactions t
WHERE
    t.id is not null
GROUP BY
    t.country , DATE_FORMAT(t.trans_date  , '%Y-%M')

