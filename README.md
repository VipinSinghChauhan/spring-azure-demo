# Spring CRUD App
This repository will help you to Deploy your spring boot CRUD application on Azure.
You can also do continuous deployment.


## Steps
* Step 1 : Create MySql Database on Azure
* Step 2 : Create Database name demo (Create database demo)
* Step 3 : Create Table Employee (create table employee(empId int primary key AUTO_INCREMENT, name varchar(35), address varchar(35), dob Date, salary int))
* Step 4 : Download this repository
* Step 5 : Open src/main/resources/application.properties file
* Step 5 : Fill all your database details on this file.
* Step 6 : Run this repository (mvn clean package , mvn spring-boot:run). It should work fine. Test api endpoints using PostMan or some other tools.
* Step 7 : Create a Github Repository.
* Step 8 : Push complete code to it.
* Step 9 : Go to Azure, open App services
* Step 10 : Choose runtime stack as Java8 , web server stack as Java SE(Embedded server) and app service plan according to you.
* Step 11 : Create the App
* Step 12 : Go to deployment center on left.
* Step 13 : Choose Source as Github , Authorize yourself, Choose you Repository
* Step 14 : And save it. It will deploy you application on Azure
* Step 15 : If you want to do any changes in API, Go to your IDE, make change, push it on Github. After some time it will start reflecting on your API.
