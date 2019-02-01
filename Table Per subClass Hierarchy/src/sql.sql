CREATE TABLE person(
    person_id INT(20) 
    firstname VARCHAR(50) 
    lastname VARCHAR(50)
)

CREATE TABLE employee (
    person_id INT(10) ,
    firstname VARCHAR(50) ,
    lastname VARCHAR(50) ,
    joining_date DATE ,
    department_name VARCHAR(50)
)
 
CREATE TABLE OWNER (
    person_id INT(20) ,
    firstname VARCHAR(50) ,
    lastname VARCHAR(50) ,
    stocks BIGINT(11) ,
    partnership_stake INT(11)
    
)