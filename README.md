# Payroll Management System

This is a simple Payroll Management System built with Spring Boot. It provides a RESTful API for managing employee data.

## Features

- Add a new employee
- Update an existing employee's information
- Retrieve an employee's details by their ID
- Get a list of all employees

## Technologies Used

- Java 17
- Spring Boot 3.3.2
- Spring Web: For building RESTful APIs.
- Spring Data JPA: For data persistence.
- H2 Database: In-memory database for development and testing.
- MySQL Connector/J: For connecting to a MySQL database.
- Lombok: To reduce boilerplate code.
- Maven: For dependency management and building the project.

## How to Run

1. **Clone the repository:**
   ```bash
   git clone https://github.com/your-username/payroll-management.git
   ```
2. **Navigate to the project directory:**
    ```bash
    cd payroll-management
    ```
3. **Run the application using Maven:**
    ```bash
    ./mvnw spring-boot:run
    ```
The application will start on `http://localhost:8080`.

## API Endpoints

The following endpoints are available:

| Method | Endpoint              | Description                  |
|--------|-----------------------|------------------------------|
| `POST`   | `/api/employees`      | Add a new employee           |
| `PUT`    | `/api/employees/{id}` | Update an existing employee  |
| `GET`    | `/api/employees/{id}` | Get an employee by ID        |
| `GET`    | `/api/employees`      | Get all employees            |

### Employee JSON Object

```json
{
  "name": "John Doe",
  "age": 30,
  "designation": "Software Engineer",
  "rating": 5,
  "salary": 80000.0
}
```
