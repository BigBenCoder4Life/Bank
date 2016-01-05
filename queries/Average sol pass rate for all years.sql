--This query is going to show the AVG SOL pass rate for a school from 2006 to 2013
--
--Schema: sch_name, pass_rate

SELECT sch_name, CAST((AVG(pass_rate)) AS DECIMAL(10,2)) AS pass_rate
FROM sol_test_data
WHERE pass_rate IS NOT NULL
  AND sch_name = 'Harrisonburg High'
  AND sch_name IS NOT NULL
  AND gender IS NULL
  AND federal_race_code IS NULL
  AND disability_flag IS NULL
  AND lep_flag IS NULL
  AND disadvantaged_flag IS NULL
GROUP BY sch_name;

--DONE 2-25-2013


--Query take 35 seconds
