echo COPY sol_test_data FROM vlds
psql -c "COPY (
  SELECT school_year, level_code, div_num, div_name,
         sch_num, sch_name, federal_race_code, gender,
         disability_flag, lep_flag, disadvantaged_flag,
         subject, test, test_level, avg_sol_scale_score,
         pass_advanced_rate, pass_prof_rate, pass_rate, fail_rate
  FROM sol_test_data
  ) TO STDOUT;" vlds | \
  psql -c "COPY sol_test_data FROM STDIN;" bank
