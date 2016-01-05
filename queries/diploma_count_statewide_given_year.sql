--
-- Looking at total count of accreditation status in VIRGINIA for a given year.
--
-- Parameters: school_year
--

SELECT sch_accred, count(sch_accred) AS virginia_school_counts
FROM accreditation
WHERE school_year = '2008-2009'
  GROUP BY sch_accred;
