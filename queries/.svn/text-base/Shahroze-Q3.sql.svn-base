-- Another query can be used to check throughout a course of years and see the declining rate of 
-- their SOL passing rate
--
-- Maybe the bottom five schools?
--
-- Schema: year, sch_name, pass_rate
--  Order: sch_name, div_num

SELECT year, sch_name, 
FROM sol_test_data
WHERE school_year IS NOT NULL  
  AND sch_name IS NOT NULL
  AND gender IS NULL
  AND federal_race_code IS NULL
  AND disability_flag IS NULL
  AND lep_flag IS NULL
  AND disadvantaged_flag IS NULL
  AND hs_completer_cnt > 400
ORDER BY sch_name, year
LIMIT 5;

--I'd like to use this query to expand the search among many different tables. 
--If we could also add correlation data into it then that would be good as well.
