-- Another query can be used to check throughout a course of years and see how each school has 
-- improved their SOL pass rate 
--
-- Maybe the top five most improved schools?
--
-- Schema: year, sch_name, pass_rate
--  Order: sch_name, div_num

--The school_year is going to help my somehow with checking pass_rates for different years, not sure how
--sch_name is going to help specify the hard-coded value 
SELECT school_year, sch_name 
FROM sol_test_data as s
 JOIN sol_test_data
WHERE school_year IS NOT NULL  
  AND sch_name IS NOT NULL
  --Set my flags to null to help keep the value for all students
  AND gender IS NULL
  AND federal_race_code IS NULL
  AND disability_flag IS NULL
  AND lep_flag IS NULL
  AND disadvantaged_flag IS NULL
ORDER BY sch_name, school_year
GROUP BY sch_name, school_year
LIMIT 5;

--I'd like to use this query to expand the search among many different tables. 
--If we could also add correlation data into it then that would be good as well.
