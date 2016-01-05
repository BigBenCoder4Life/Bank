--This query is going to show the percent that will show how a school's sol pass rate has either
--increased or decreased.

SELECT s1.sch_name, (s1.pass_rate - s2.pass_rate) AS percent 
FROM sol_test_data as s1 
INNER JOIN sol_test_data AS s2 ON s1.pass_rate = s2.pass_rate
AND s1.school_year = s2.school_year
WHERE s1.pass_rate IS NOT NULL
  AND s2.pass_rate IS NOT NULL
  AND s1.sch_name = 'Harrisonburg High'
  AND s2.sch_name = 'Harrisonburg High'
  AND s1.sch_name IS NOT NULL
  AND s1.gender IS NULL
  AND s1.federal_race_code IS NULL
  AND s1.disability_flag IS NULL
  AND s1.lep_flag IS NULL
  AND s1.disadvantaged_flag IS NULL
  AND s2.sch_name IS NOT NULL
  AND s2.gender IS NULL
  AND s2.federal_race_code IS NULL
  AND s2.disability_flag IS NULL
  AND s2.lep_flag IS NULL
  AND s2.disadvantaged_flag IS NULL
  AND s1.school_year = '2013'
  AND s2.school_year = '2006'
LIMIT 10;


