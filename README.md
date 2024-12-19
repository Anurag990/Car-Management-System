# Car-Management-System
System that allows users to manage car details, such as adding, updating, viewing, and deleting car information.

## Overview
The **Car Management System** is a RESTful web service built using **Spring Boot** that allows users to manage car details. It supports CRUD operations and includes features like searching, pagination, and sorting. The system also provides API documentation through **Swagger UI** for easy interaction with the endpoints.

## Features
- **CRUD Operations**: Create, Read, Update, and Delete car information.
- **Pagination & Sorting**: Retrieve car details with pagination and sorting options.
- **Search Functionality**: Search cars based on different attributes such as name, model, year, color, and fuel type.
- **Swagger UI**: API documentation available through Swagger for testing and exploring the API.

## Technologies Used
- **Spring Boot**: Backend framework for building the REST API.
- **Swagger UI**: For API documentation and interactive testing.
- **Spring Data JPA**: For database interaction.
- **MySQL Database**: Used for data persistence (configured in `application.properties`).

## Prerequisites
- Java 11 or higher
- Maven
- MySQL Database (or use the provided MySQL connection in `application.properties`)

## Setup Instructions

### 1. Clone the Repository
Clone the project repository to your local machine:

```bash
git clone https://github.com/Anurag990/CarManagementSystem.git
2. Setup MySQL Database
Ensure you have a MySQL database running, and create a database named carmanagementsystem.

You can use the following database credentials in application.properties:

**properties
Copy code
spring.datasource.url=jdbc:mysql://localhost:3306/carmanagementsystem
spring.datasource.username=root
spring.datasource.password=yourpassword
Alternatively, you can use the Aiven MySQL database connection details provided in the application.properties file.

3. Run the Application
Navigate to the project directory and run the Spring Boot application using Maven.

For Maven:

```bash
Copy code
mvn spring-boot:run
4. Access API Documentation
Once the application is running, you can access the Swagger UI to explore and test the API endpoints.

Swagger UI URL: http://localhost:8080/swagger-ui.html
The Swagger UI provides an interactive interface for testing the API methods.
