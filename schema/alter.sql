ALTER TABLE hs_graduate ADD PRIMARY KEY ( div_name, sch_name);

ALTER TABLE divisions ADD PRIMARY KEY (div_name, sch_name);

ALTER TABLE schools ADD PRIMARY KEY (school_num);

ALTER TABLE students ADD FOREIGN KEY (school_num) REFERENCES schools;

ALTER TABLE accreditation ADD PRIMARY KEY (sch_name, sch_num) REFERENCES schools;

ALTER TABLE sol_test_data ADD PRIMARY KEY (sch_name, sch_num);

ALTER TABLE virginia_sch_cnt ADD PRIMARY KEY (sch_year)

SELECT count(*) AS hs_cnt FROM hs_graduate;
ANALYZE VERBOSE hs_graduate;

SELECT count(*) AS div_cnt FROM division;
ANALYZE VERBOSE division;

SELECT count(*) AS sch_cnt FROM school;
ANALYZE VERBOSE school;

SELECT count(*) AS stu_cnt FROM students;
ANALYZE VERBOSE students;

SELECT count(*) AS accred_cnt FROM accreditation;
ANALYZE VERBOSE accreditation;

SELECT count(*) AS sol_cnt FROM sol_test_data;
ANALYZE VERBOSE sol_test_data;

SELECT count(*) AS virginia_sch_cnt FROM virginia_sch_cnt
ANALYZE VERBOSE virginia_sch_cnt;
