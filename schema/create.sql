DROP TABLE IF EXISTS hs_graduate;
DROP TABLE IF EXISTS divisions;
DROP TABLE IF EXISTS schools;
DROP TABLE IF EXISTS students;
DROP TABLE IF EXISTS accreditation;
DROP TABLE IF EXISTS sol_test_data;
DROP TABLE IF EXISTS virginia_sch_cnt;

--Main Data Set
CREATE TABLE hs_graduate (
 school_year text NOT NULL,
 level_code text NOT NULL,
 div_num integer,
 div_name text,
 sch_num integer,
 sch_name text,
 federal_race_code integer,
 gender char,
 disability_flag char,
 lep_flag char,
 disadvantaged_flag char,
 hs_completion_num integer NOT NULL,
 hs_completion_name text NOT NULL,
 hs_completer_cnt integer NOT NULL
);

ALTER TABLE hs_graduate OWNER TO bank;

COMMENT ON TABLE hs_graduate IS 'Main Statistical Data for Virginia Schools';

--Schools
CREATE TABLE schools (
 school_name text,
 school_num integer,
 hs_completion_num integer,
 level_code text
);

ALTER TABLE schools OWNER TO bank;

COMMENT ON TABLE schools IS 'Statistical Data for Schools';

--Students
CREATE TABLE students (
 gender char,
 disability_flag char,
 lep_flag char,
 federal_race_code integer,
 hs_completion_name text
);

ALTER TABLE students OWNER TO bank;

COMMENT ON TABLE students IS 'Statistical Data for Virginia Students';

--Divisions
CREATE TABLE divisions (
 div_name text NOT NULL,
 sch_name text
);

ALTER TABLE divisions OWNER TO bank;

Comment ON TABLE divisions IS 'Statistical Data for Divisions'; 

--Accreditation
CREATE TABLE accreditation (
 school_year text NOT NULL,
 div_num integer,
 div_name text,
 sch_num integer,
 sch_name text,
 sch_accred text
);

ALTER TABLE accreditation OWNER TO bank;

COMMENT ON TABLE accreditation IS 'Accreditation Data for Virginia Schools';

--SOL test data
CREATE TABLE sol_test_data (
 school_year text NOT NULL,
 level_code text NOT NULL,
 div_num integer,
 div_name text,
 sch_num integer,
 sch_name text,
 federal_race_code integer,
 gender char,
 disability_flag char,
 lep_flag char,
 disadvantaged_flag char,
 subject text,
 test text,
 test_level text,
 avg_sol_scale_score integer,
 pass_advanced_rate real NOT NULL,
 pass_prof_rate real NOT NULL,
 pass_rate real NOT NULL,
 fail_rate real NOT NULL
);

ALTER TABLE sol_test_data OWNER TO bank;

COMMENT ON TABLE sol_test_data IS 'SOL test data';

--Virginia school counts for high, middle, elementary Schools.
CREATE Table virginia_sch_cnt (
sch_year text NOT NULL,
sch_cnt integer,
hs_cnt integer,
middle_cnt integer,
elem_cnt integer,
pre_cnt integer,
comb_cnt integer
);

ALTER TABLE virginia_sch_cnt OWNER TO bank;

COMMENT ON TABLE virginia_sch_cnt IS 'Virginia counts for active schools in Virginia';

 







