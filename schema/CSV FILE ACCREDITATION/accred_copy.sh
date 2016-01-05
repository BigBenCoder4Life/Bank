echo COPY acreditation FROM csv
psql -c "\copy accreditation FROM accreditation_2006.csv WITH CSV HEADER" bank

echo COPY acreditation FROM csv
psql -c "\copy accreditation FROM accreditation_2007.csv WITH CSV HEADER" bank

echo COPY acreditation FROM csv
psql -c "\copy accreditation FROM accreditation_2008.csv WITH CSV HEADER" bank

echo COPY acreditation FROM csv
psql -c "\copy accreditation FROM accreditation_2009.csv WITH CSV HEADER" bank

echo COPY acreditation FROM csv
psql -c "\copy accreditation FROM accreditation_2010.csv WITH CSV HEADER" bank

echo COPY acreditation FROM csv
psql -c "\copy accreditation FROM accreditation_2011.csv WITH CSV HEADER" bank

echo COPY acreditation FROM csv
psql -c "\copy accreditation FROM accreditation_2012.csv WITH CSV HEADER" bank

echo COPY acreditation FROM csv
psql -c "\copy accreditation FROM accreditation_2013.csv WITH CSV HEADER" bank

echo COPY virginia_sch_cnt FROM csv
psql -c "\copy virginia_sch_cnt FROM local_sch_cnt.csv WITH CSV HEADER" bank
