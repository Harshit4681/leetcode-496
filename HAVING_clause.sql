-- Examples of SQL HAVING clause

-- Example 1: Using HAVING with GROUP BY to filter groups
SELECT department, COUNT(*) AS employee_count
FROM employees
GROUP BY department
HAVING COUNT(*) > 10;

-- Example 2: Using HAVING to filter on aggregation functions
SELECT product_id, SUM(sales) AS total_sales
FROM sales_data
GROUP BY product_id
HAVING SUM(sales) > 1000;

-- Example 3: Combining HAVING with WHERE
SELECT customer_id, COUNT(*) AS order_count
FROM orders
WHERE order_date >= '2023-01-01'
GROUP BY customer_id
HAVING COUNT(*) > 5;
