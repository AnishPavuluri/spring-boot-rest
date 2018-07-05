# spring-boot-rest
spring boot rest, data with mysql 
/*DDL Information For - test.event*/
------------------------------------

Table   Create Table                                              
------  ----------------------------------------------------------
event   CREATE TABLE `event` (                                    
          `EVENT_ID` int(5) NOT NULL auto_increment,              
          `EVENT_CODE` varchar(50) default NULL,                  
          `EVENT_NAME` varchar(50) default NULL,                  
          `DESCRIPTION` varchar(50) default NULL,                 
          `START_DATE` varchar(50) default NULL,                  
          `END_DATE` varchar(50) default NULL,                    
          `FEES` double default NULL,                             
          `SEATS_FILLED` bigint(5) default NULL,                  
          `LOGO` varchar(50) default NULL,                        
          PRIMARY KEY  (`EVENT_ID`)                               
        ) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1  
