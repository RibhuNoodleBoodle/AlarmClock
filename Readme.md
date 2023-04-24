# Alarm Clock Application

This is a Spring Boot application that provides an alarm clock service with REST API support.
## Prerequisites

To build and run this application, you need to have the following tools installed:
- JDK 20 or later
- Maven 3.6 or later
- Docker (optional)
## Getting Started

To build and run the application locally, follow these steps:
1. Clone the repository to your local machine:

```bash

git clone https://github.com/your-username/alarm-clock.git
```


1. Navigate to the project root directory:

```bash

cd alarm-clock
```


1. Build the application using Maven:

```go

mvn package
```



This will compile the source code, run the unit tests, and create an executable JAR file in the `target/` directory.
1. (Optional) If you have Docker installed, you can build a Docker image of the application:

```lua

docker build -t alarm-clock .
```



This will create a Docker image with the tag `alarm-clock`.
1. Run the application:

```bash

java -jar target/alarm-clock-1.0.0.jar
```



This will start the application on port 8080. You can access the API endpoints using a web browser or a tool like `curl` or `Postman`.
1. (Optional) If you have Docker installed, you can run the Docker image instead:

```arduino

docker run -p 8080:8080 alarm-clock
```



This will start a Docker container with the application running inside.
## API Endpoints

The following API endpoints are available: 
- `GET /alarms` - retrieves a list of all alarms 
- `GET /alarms/{id}` - retrieves an alarm by ID 
- `POST /alarms` - creates a new alarm 
- `PUT /alarms/{id}` - updates an existing alarm by ID 
- `DELETE /alarms/{id}` - deletes an alarm by ID
## Configuration

The application can be configured by editing the `application.properties` file in the `src/main/resources` directory. The following settings are available: 
- `server.port` - the port number that the application listens on (default: 8080) 
- `spring.datasource.url` - the URL of the MySQL database (default: jdbc:mysql://localhost:3306/alarm_clock) 
- `spring.datasource.username` - the username to use when connecting to the MySQL database (default: root) 
- `spring.datasource.password` - the password to use when connecting to the MySQL database (default: password)
## Testing

To run the unit tests for the application, use the following command:

```bash

mvn test
```



This will compile the test classes and run them using JUnit. The test results will be displayed in the console.
## Deployment

To deploy the application to a production environment, you can use any standard Java web server, such as Tomcat or Jetty. Simply copy the executable JAR file to the server and start it using the `java -jar` command.

Alternatively, you can deploy the application to a cloud platform, such as Heroku or AWS Elastic Beanstalk, using the Docker image. Simply upload the Docker image to the platform and configure the platform to run the container on port 8080.
