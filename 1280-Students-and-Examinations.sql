# Write your MySQL query statement below
SELECT
    s.student_id ,s.student_name ,su.subject_name ,COUNT(ex.subject_name) As  attended_exams 
FROM
    (Students s join Subjects su) left join Examinations ex 
on 
    s.student_id = ex.student_id and su.subject_name = ex.subject_name 
group by
    s.student_id , su.subject_name
order by 
    s.student_id , su.subject_name