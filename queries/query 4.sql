--
-- Find the total high school completion count with all not null combinations of
-- disabled and disadvantaged students.
--
-- Parameters: disability_flag, disadvantaged_flag, SUM(hs_completer_cnt)
--

SELECT disability_flag, disadvantaged_flag, SUM(hs_completer_cnt) AS hs_completer_cnt
FROM hs_graduate	
WHERE school_year = '2011-2012'
  AND disadvantaged_flag IS NOT NULL
  AND disability_flag IS NOT NULL
GROUP BY disability_flag, disadvantaged_flag;

