-- In 2011-2012, which schools had the highest passing number of students and
-- also the highest number of LEP students.
--
-- Schema: div_num text, sch_name text
--  Order: sch_name, div_num

SELECT div_num, sch_name
FROM fall_membership
WHERE school_year = '2011-2012'
  AND div_name IS NOT NULL
  AND sch_name IS NOT NULL
  AND fall_membership_cnt > 1000
  AND gender IS NULL
  AND federal_race_code IS NULL
  AND disability_flag IS NULL
  AND lep_flag IS NOT NULL
  AND disadvantaged_flag IS NULL
GROUP BY div_num, sch_name
  
INTERSECT

SELECT div_num, sch_name
FROM hs_graduate
WHERE school_year = '2011-2012'  
  AND div_num IS NOT NULL
  AND sch_name IS NOT NULL
  AND gender IS NULL
  AND federal_race_code IS NULL
  AND disability_flag IS NULL
  AND lep_flag IS NOT NULL
  AND disadvantaged_flag IS NULL
  AND hs_completer_cnt > 400
ORDER BY sch_name, div_num
LIMIT 10;

--I'd like to use this query to expand the search among many different tables. 
--If we could also add correlation data into it then that would be good as well.

--DONE 2/25/2013
