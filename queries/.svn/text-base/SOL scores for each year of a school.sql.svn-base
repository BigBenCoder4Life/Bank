--This query is going to show the SOL scores for a school for each year of that school.
--
--Schema: school_year, sch_name, pass_rate\

SELECT school_year,sch_name, MAX(pass_rate) AS pass_rate
FROM sol_test_data
WHERE pass_rate IS NOT NULL
  AND sch_name = 'Harrisonburg High'
  AND sch_name IS NOT NULL
  AND gender IS NULL
  AND federal_race_code IS NULL
  AND disability_flag IS NULL
  AND lep_flag IS NULL
  AND disadvantaged_flag IS NULL
GROUP BY school_year, sch_name
ORDER BY school_year ASC
LIMIT 10;

--DONE 2/25/2014
