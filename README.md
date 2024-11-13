# Description :->
The Quiz-Application is a Java-based application designed to manage quizzes,Questions with multiple-choice questions. 
The project is built using Spring Boot and follows a microservices architecture. 
It integrates a load balancer to manage traffic efficiently across services, enhancing the application's scalability and availability.

# Features :->
1) Microservices Architecture: Ensures modularity and scalability of the application.
2) Load Balancer: Distributes incoming requests across multiple instances of microservices to ensure efficient resource utilization and reduce downtime.
3) Quiz Management: Supports creation, retrieval, updating, and deletion of quizzes and questions.
4) User Management: Manages user data for quiz participation and performance tracking.
5) Scalable Architecture: Built using microservices, making it easy to scale specific components as needed.
   
# RESTful API :->
Exposes endpoints for various operations like creating quizzes, adding questions, and getting quiz results.

# Technologies Used :->
Spring Boot: Core framework for building and deploying the application.
Spring Cloud Load Balancer: Balances incoming requests across services.
MySQL: Database for storing quiz data and user details.
Java: Primary programming language.
Docker (Optional): Used for containerization to simplify deployment.

# Prerequisites :->
To run this project, you’ll need
Java 17
Maven
MySQL server
Spring Cloud dependencies for load balancing

# Database Congiguration :->
Create a MySQL database (e.g., quiz_db).
Update the application.properties with your database credentials:
spring.datasource.url=jdbc:mysql://localhost:3306/quiz_db
spring.datasource.username=yourUsername
spring.datasource.password=yourPassword

# Build and Run the Application: ->
mvn clean install
mvn spring-boot:run
Load Balancer Configuration:

# NOTE - If you’re deploying multiple instances of microservices, configure the load balancer properties in application.properties.
For example:
spring.cloud.loadbalancer.ribbon.enabled=true

# API Endpoints :->
Create Quiz: POST /api/quiz
Add Question: POST /api/quiz/{quizId}/questions
Get Quiz by ID: GET /api/quiz/{quizId}
Update Quiz: PUT /api/quiz/{quizId}
Delete Quiz: DELETE /api/quiz/{quizId}
List Quizzes: GET /api/quiz

# Testing API end point :->
Once the application is running, you can use Postman or any API client to test the endpoints. 
For distributed environments, the load balancer will automatically manage traffic across instances of each microservice.
