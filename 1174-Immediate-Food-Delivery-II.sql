# Write your MySQL query statement below
SELECT 
    ROUND(
        AVG(
            IF(d.order_date = d.customer_pref_delivery_date ,1,0)*100
            )
        ,2) AS immediate_percentage 

FROM Delivery d
where (customer_id, order_date) in (
  Select customer_id, min(order_date) 
  from Delivery
  group by customer_id
)
