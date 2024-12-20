SELECT 
    p.product_id, 
    ROUND(
        IFNULL(SUM(p.price * u.units) / NULLIF(SUM(u.units), 0), 0), 2
    ) AS average_price
FROM 
    Prices p
LEFT JOIN 
    UnitsSold u
ON 
    p.product_id = u.product_id 
    AND p.start_date <= u.purchase_date 
    AND u.purchase_date <= p.end_date
GROUP BY 
    p.product_id;
