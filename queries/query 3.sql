--
-- Find the total high school completion count for different counties.
-- Also shows how lep_flag relates to hs completion
--
-- Parameters: div_name, sch_name, lep_flag, SUM(hs_completer_cnt)
--

SELECT div_name, sch_name, lep_flag, SUM(hs_completer_cnt) AS hs_completer_cnt
FROM hs_graduate	
WHERE school_year = '2011-2012'
  AND div_name IS NOT NULL
  AND sch_name IS NOT NULL
  AND lep_flag IS NOT NULL
GROUP BY div_name, sch_name, lep_flag;

