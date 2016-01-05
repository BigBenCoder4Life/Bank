#!/bin/sh

echo COPY hs_graduate FROM vlds
psql -c "COPY (
  SELECT school_year, level_code, div_num, div_name,
         sch_num, sch_name, federal_race_code, gender,
         disability_flag, lep_flag, disadvantaged_flag,
         hs_completion_num, hs_completion_name, hs_completer_cnt 
  FROM hs_graduate
  ) TO STDOUT;" vlds | \
  psql -c "COPY hs_graduate FROM STDIN;" bank

echo COPY divisions FROM vlds
psql -c "COPY (
SELECT DISTINCT div_name, sch_name
FROM hs_graduate
WHERE div_name IS NOT NULL
) TO STDOUT;" vlds | \
psql -c "COPY divisions FROM STDIN;" bank

echo COPY schools FROM vlds
psql -c "COPY (
SELECT DISTINCT sch_name, sch_num, hs_completion_num, level_code
FROM hs_graduate
) TO STDOUT;" vlds | \
psql -c "COPY schools FROM STDIN;" bank

echo COPY students FROM vlds
psql -c "COPY (
SELECT gender, disability_flag, lep_flag, federal_race_code, hs_completion_name
FROM hs_graduate
) TO STDOUT;" vlds | \
psql -c "COPY students FROM STDIN;" bank




