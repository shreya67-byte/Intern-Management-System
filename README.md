# Intern Management System

This is a Java-based console application that allows managing intern records using JDBC and MySQL. It includes adding, viewing, updating, and deleting intern details like name, email, department, mentor, project title, and feedback.

---

## Features

- Add new intern records to the database  
- View all interns with details  
- Update feedback or project-related info  
- Delete intern entries  
- Uses MySQL database to store everything

---

## Tech Stack

- Java  
- JDBC  
- MySQL  
- MySQL Workbench (for DB setup)  
- VS Code or IntelliJ (for development)

---

## Database Info

**Database:** `intern_db`  
**Table:** `interns`

```sql
CREATE TABLE interns (
    internId INT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100),
    department VARCHAR(100),
    mentor VARCHAR(100),
    projectTitle VARCHAR(150),
    feedback TEXT
);
