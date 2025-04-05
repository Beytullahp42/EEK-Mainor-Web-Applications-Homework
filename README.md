# Number Guessing Game

This app is a Spring Boot API game developed for the SE-016 Web Applications course assignment at Estonian Entrepreneurship University of Applied Sciences, during 2024-2025 spring semester.

This API starts a number guessing game and lets users guess a number between 0 and 100. It responds with hints like “Try bigger number” or “Try smaller number” until the correct guess is made. The app keeps track of how many guesses it took to win.

## Endpoints
```GET /game```

Starts a new game and returns a game ID.

```GET /game/{id}/guess/{number}```

Sends a guess for the game with that ID. Returns feedback.

## Updated version

An updated version of this project, which includes a Dockerfile, Docker Compose setup with PostgreSQL integration, and game state persistence, can be found in the ```classroom-hw02``` branch of this repository:
**https://github.com/Beytullahp42/EEK-Mainor-Web-Applications-Homework/tree/classroom-hw02**
