# Alarm Clock App

This is an alarm clock application built using Angular, Spring Boot, RabbitMQ, MongoDB, MySQL, Docker, and Neo4j. The application allows users to create and manage alarms, with support for scheduling, editing, and deleting alarms.
## Requirements

To run this application, you'll need to have the following software installed on your system:
- Java 20 or later
- Angular CLI
- RabbitMQ
- MongoDB
- MySQL
- Docker
- Neo4j
## Getting Started

To get started with this application, follow these steps:
1. Clone this repository to your local machine. 
2. Start RabbitMQ, MongoDB, MySQL, and Neo4j using the Docker Compose file provided in the `docker/` directory:

```

docker-compose up -d
``` 
3. Open a terminal window and navigate to the `backend/` directory. 
4. Start the Spring Boot application:

```bash

./gradlew bootRun
``` 
5. Open another terminal window and navigate to the `frontend/` directory. 
6. Install the Node.js dependencies:

```

npm install
``` 
7. Start the Angular development server:

```

ng serve
``` 
8. Open a web browser and navigate to `http://localhost:4200` to view the application.
## Features

The alarm clock application includes the following features:
- Create new alarms with a title, time, and repeat interval.
- Edit existing alarms.
- Delete alarms.
- View a list of all alarms.
- Sort alarms by time or title.
- Filter alarms by title.
- Schedule alarms to trigger at the specified time.
- Automatically reschedule repeating alarms.
- Display a notification when an alarm triggers.
## Architecture

The alarm clock application is built using a microservices architecture, with the following components:
- A Spring Boot backend that provides REST APIs for managing alarms and scheduling notifications.
- A RabbitMQ message broker that handles message passing between the backend and frontend.
- A MongoDB database that stores alarm data.
- A MySQL database that stores notification data.
- A Neo4j database that stores user data and relationships between alarms and users.
- An Angular frontend that provides a user interface for managing alarms.
## Contributing

If you'd like to contribute to this project, please fork the repository and submit a pull request.
