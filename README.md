# Whack-a-Mole Game 🎯

A Java-based Whack-a-Mole game developed using Swing GUI, Object-Oriented Programming principles, multithreading, serialization, and custom exception handling.

## Project Overview

Whack-a-Mole is an interactive arcade-style game where players score points by clicking on moles that randomly appear on the game board while avoiding bombs. The game demonstrates the practical implementation of Java concepts such as inheritance, polymorphism, multithreading, file handling, serialization, and GUI development.

## Features

* Interactive Swing-based graphical user interface
* 3×3 game board layout
* Random spawning of:

  * Mole (+100 points)
  * Bonus Mole (+1000 points)
  * Bomb (-500 points)
* Real-time score tracking
* Countdown timer
* Multithreaded game engine
* High score persistence using serialization
* Custom exception handling
* Object-Oriented Design using inheritance and polymorphism

## Technologies Used

* Java
* Java Swing
* Multithreading
* Serialization
* File Handling
* Object-Oriented Programming (OOP)

## Project Structure

WHACK-A-MOLE
│
├── Main
│   ├── Main.java
│   ├── GameFrame.java
│   ├── GamePanel.java
│   └── GameEngine.java
│
├── model
│   ├── HoleOccupant.java
│   ├── Mole.java
│   ├── Bomb.java
│   ├── BonusMole.java
│   └── PlayerScore.java
│
├── manager
│   └── HighScoreManager.java
│
├── exception
│   ├── HighScoreException.java
│   └── InvalidGameStateException.java
│
└── images
    ├── mole.png
    ├── bomb.png
    └── bonus.png


## OOP Concepts Implemented

### Inheritance

`Mole`, `Bomb`, and `BonusMole` inherit from the abstract `HoleOccupant` class.

### Polymorphism

The game treats all game objects as `HoleOccupant` references while executing different behaviors through method overriding.

### Abstraction

The abstract class `HoleOccupant` defines common behavior shared among all game entities.

### Encapsulation

Game data such as scores and player information are managed through classes with controlled access methods.

## High Score System

The game stores player scores using Java serialization. High scores are saved and loaded through the `HighScoreManager` class.


### Compile

javac Main/*.java model/*.java manager/*.java exception/*.java


### Run

java Main.Main


## Learning Outcomes

This project helped in understanding:

* Java GUI development using Swing
* Event-driven programming
* Multithreading in Java
* Serialization and file handling
* Custom exception creation and handling
* Software design using OOP principles
* Git and GitHub version control

## Author
**Tanvi Pandey**

Developed as an academic project to demonstrate Java programming and software engineering concepts.
