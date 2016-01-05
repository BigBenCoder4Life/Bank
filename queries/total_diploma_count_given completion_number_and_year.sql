--
-- Looking at the total count for students awwarded a diploma/certificate for 
-- a specific school in a given year.
--
-- Parameters: school_year, hs_completion_number
--
--IMPORTANT INFO BELOW:
-- 1=Standard Diploma
-- 2=Advanced Studies Diploma
-- 3=Special Diploma
-- 4=Certificate of Program Completion
-- 5=General Educational Development (GED)
-- 7=Modified Standard Diploma
-- 9=General Achievement Diploma
-- Years avalable are 2006-2011

SELECT DISTINCT hs.sch_name, sch_accred, SUM(hs_completer_cnt) AS  total_students_awarded
FROM hs_graduate hs
JOIN accreditation ac ON ac.sch_num = hs.sch_num AND ac.sch_name = hs.sch_name
WHERE ac.school_year = '2011-2012'
  AND ac.sch_name LIKE 'Abingdon High'             
  AND hs.sch_name IS NOT NULL
  AND hs.school_year IS NOT NULL
  AND hs.div_name IS NOT NULL
  AND hs.div_num IS NOT NULL
  AND hs.sch_num IS NOT NULL
  AND gender IS  NOT NULL
  AND lep_flag IS NULL
  AND disability_flag IS NULL
  AND federal_race_code IS NULL
  AND disadvantaged_flag IS NULL
  AND disability_flag IS NULL
GROUP BY hs.sch_name, ac.sch_accred;
