# Write your MySQL query statement below

select e.name, b.bonus
from Employee e
left join Bonus b
on e.empID=b.empID
where b.Bonus is NULL 
or b.Bonus <1000