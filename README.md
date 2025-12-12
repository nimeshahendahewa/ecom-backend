## Ecommerce — Backend

This is a Spring Boot-based backend for an e-commerce application, providing RESTful APIs for user management, product catalog, order processing, and category management.
Tech stack: Java 17, Spring Boot 3.5.0, Spring Data JPA,Spring Security, MySQL, Lombok, Maven

Frontend: The frontend for this project is in a separate repository: https://github.com/nimeshahendahewa/ecom-frontend.git

Application config is in src/main/resources/application.properties.

# Database Setup:

CREATE DATABASE ecommerce_db;

Update application.properties

spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce_db
spring.datasource.username=your_username
spring.datasource.password=your_password

# CORS Configuration

The backend is configured to accept requests from http://localhost:3000 for frontend integration.

Adjust these values for your environment or use environment-specific overrides.

# Build & Run

Clone the backend repository
git clone <your-backend-repo-url>
cd backend

Build the project
mvn clean install

Run the application
mvn spring-boot:run

After Setup Frontend

# API Summary Base path: /api

Authentication

POST /api/users/register - Register new user
POST /api/users/login - User login

Products

GET /api/products - Get all products
GET /api/products/{id} - Get product by ID
GET /api/products/category/{category} - Get products by category
POST /api/products - Create new product

Categories

GET /api/categories - Get all categories
POST /api/categories - Create new category

Orders

POST /api/orders - Create new order
GET /api/orders - Get all orders (ADMIN)
GET /api/orders/customer/{email} - Get orders by customer email
GET /api/orders/{id} - Get order by ID

# Default Admin Credentials

Email: admin@gmail.com
Password: admin123

Backend Server: http://localhost:8080

Frontend URL: http://localhost:3000

Database: MySQL on localhost:3306
