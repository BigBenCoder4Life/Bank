GROUP NAME: The Bank
Ben Shahroze Logan :)

DESCRIPTION:

Our application enables policy makers, teachers, and parents to view and 
update data relevant to Virginia public school system. The data is based
on VLDS Annual High School Graduates and Completers.


STEPS TO CREATE DATABASE

1.Group became familiar with subversion and commands.

2.Created table statements in file create.sql
	A. Created general relations of data to sub-divide later for specific queries. 
        B. Selected NOT NULL atributes and followed up with DR. Mayfield about correct implementation
	C. Followed up with Dr. Mayfield about correct design of similiar/non-similiar  structures.
	D. Brainstormed on how to create more detailed relations that are query specific.

3. Run create.sql to create tables without constraints.

4. Run copy.sh on db.cs.jmu.edu to copy data from VLDS.

5. Run alter.sql to add constraints and analyze tables.

6. Added accreditation table for Virginia schools.

7. Created new quiries and setup a new table for sol_data from vlds.
