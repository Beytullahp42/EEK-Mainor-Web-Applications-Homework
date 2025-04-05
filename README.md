# Docker image link:
https://hub.docker.com/repository/docker/beytullahpaytar/eek-mainor-web-applications-homework-spring-app/general

# Number Guessing Game

This app is a Spring Boot API game developed for the SE-016 Web Applications course assignment at Estonian Entrepreneurship University of Applied Sciences, during 2024-2025 spring semester.

This API starts a number guessing game and lets users guess a number between 0 and 100. It responds with hints like “Try bigger number” or “Try smaller number” until the correct guess is made. The app keeps track of how many guesses it took to win.

This version features:
- **Dockerfile** for containerization.
- **Docker Compose** setup with PostgreSQL integration.
- **Game state persistence** using a PostgreSQL database.
- A built `.jar` file is available in the repository for convenience, but you can generate your own `.jar` file using this command:
```./gradlew build```

## Endpoints
```GET /game```

Starts a new game and returns a game ID.

```GET /game/{id}/guess/{number}```

Sends a guess for the game with that ID. Returns feedback.

## How to Run the App

1. Start the PostgreSQL database (using Docker Compose or another method).
2. You can:
   - Run the app locally with IntelliJ IDEA or the `./gradlew bootRun` command.
   - Use the Docker image shared on Docker Hub.
   - Build and run the Docker app yourself.

Feel free to choose the method that works best for you.
