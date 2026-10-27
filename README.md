# Guess the Number (Java)

[![Language](https://img.shields.io/badge/Language-Java-orange.svg)](https://www.java.com/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

A terminal-based number-guessing game. The program chooses a random integer from 1 through 100, asks the player to guess, and gives higher/lower hints until the correct number is found.

## Features

- Random target number from 1 to 100.
- Repeated guesses until the answer is found.
- Hints for guesses that are too high or too low.
- Attempt counter and an end-of-game message based on attempts.

## Project Structure

```text
guess-a-number/
└── MiniProject5.java
```

## Requirements

Use **JDK 17 or newer**, because the source calls `Random.nextInt(origin, bound)`.

## Compile and Run

```bash
javac MiniProject5.java
java MiniProject5
```

Enter guesses between 1 and 100 until the program reports a match.

## Concepts Practiced

- Random number generation.
- A `do/while` loop.
- Conditional logic.
- Attempt tracking and formatted output.

## Limitations and Improvements

Non-numeric input is not handled, and guesses outside 1–100 are not rejected. The “top 3%” and “top 5%” messages are hard-coded feedback, not real player statistics. Possible improvements include input validation, replay support, and difficulty settings.

## License

Licensed under the MIT License. See [LICENSE](LICENSE).
