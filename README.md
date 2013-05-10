spring-jpa-embedded-db
======================

A simple template project that uses Spring, JPA, Hibernate and an embedded HSQLDB

The motivation of this project is to serve as a template for new projects using Spring and JPA.
Note that presentation tier is not available in this template btu you can easily extend it to meet your needs.

This project uses the following APIs:

 * Spring Framework 3.2.2
 * Hibernate 4.2.1
 * Hibernate Validator 5
 * Javax Inject 1
 * HSQLDB 2.2.9

IMPORTANT: Before change the Datasource set up in applicationContext.xml to anything else, remember to change 
the parameter hibernate.hbm2ddl.auto in persistence.xml to avoid problems with your database.

