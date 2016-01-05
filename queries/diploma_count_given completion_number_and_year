--
-- Looking at the total count for specific diploma/certificates for 
-- a school in a given year.
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

SELECT sch_name, SUM(hs_completer_cnt) AS  total_students_awarded
FROM hs_graduate
WHERE school_year = '2011-2012'
AND hs_completion_num = 1                       
  AND sch_name IS NOT NULL
  AND school_year IS NOT NULL
  AND div_name IS NOT NULL
  AND div_num IS NOT NULL
  AND sch_num IS NOT NULL
  AND gender IS  NOT NULL
  AND lep_flag IS NULL
  AND disability_flag IS NULL
  AND federal_race_code IS NULL
  AND disadvantaged_flag IS NULL
  AND disability_flag IS NULL
GROUP BY  sch_name, hs_completion_name
;
