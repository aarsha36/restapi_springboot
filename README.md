🚀 Spring Boot Student CRUD API
📌 Project Description
This project is a Spring Boot REST API that performs complete CRUD operations (Create, Read, Update, Delete) for managing student data using Spring Boot, Spring Data JPA, and MySQL.

The API allows users to:

Add a new student
View all students
View a student by ID
Update student details
Delete a student
🛠 Technologies Used
Java
Spring Boot
Spring Data JPA
MySQL
Maven
Eclipse IDE
REST API
Postman
📁 Project Structure
exp-8
│
├── controller
│   └── StudentController.java
│
├── model
│   └── Student.java
│
├── repository
│   └── StudentRepository.java
│
├── service
│   └── StudentService.java
│
├── Exp7Application.java
└── application.properties
⚙️ Database Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/spring_hibernate_db
spring.datasource.username=root
spring.datasource.password=University@12
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
server.port=8080
