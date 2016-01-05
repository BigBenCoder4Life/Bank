--
--Selects a schools accreditation status for a given year and also its average pass & fail rate for test subjects. 
--
--TEST SUBJECTS:
-----------------
--"English Reading"
--"History"
--"Mathematics"
--"Science"
--"VA Studies"
--"Writing"
--
-- Parameters: sch_name, school_year

SELECT acc.sch_name, sch_accred AS sch_accred_status, CAST(AVG(pass_rate) AS DECIMAL(10,2)) AS pass_rate, CAST(avg(fail_rate) AS DECIMAL(10,2)) AS fail_rate, test
FROM accreditation AS acc
JOIN sol_test_data AS sol ON sol.sch_name = acc.sch_name
WHERE acc.sch_name = 'Accawmacke Elementary'
  AND acc.school_year = '2008-2009'
GROUP BY acc.sch_name, sch_accred_status, test
ORDER BY test
