# Write your MySQL query statement below
SELECT  e1.employee_id,e1.name,Count(e2.reports_to) as reports_count,Round(avg(e2.age),0) as average_age from 
Employees e1 
join 
Employees e2 
on e1.employee_id=e2.reports_to
group by  e1.employee_id
order by e1.employee_id;