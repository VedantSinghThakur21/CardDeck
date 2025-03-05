# Deck of Cards - Java Implementation

## Overview
This project implements a **Deck of Cards** using Java. It provides functionalities to create, shuffle, search, and compare playing cards. Users can interact with the program through a menu-driven console interface.

## Features
- **Create a deck of 52 standard playing cards**
- **Print the entire deck**
- **Find a specific card**
- **Shuffle the deck**
- **Deal 5 random cards**
- **Compare two cards** based on rank
- **Check if two cards belong to the same suit**

## Technologies Used
- **Java** (JDK 8 or above)
- **Object-Oriented Programming (OOP)** concepts
- **Collections Framework (ArrayList)**

## Installation & Usage
### Prerequisites
- Install **Java Development Kit (JDK)**
- Use any **Java IDE** (Eclipse, IntelliJ, or VS Code) or run via terminal

### Steps to Run
1. **Clone or download** the repository
2. **Compile the Java files**
   ```bash
   javac Main.java Deck.java Card.java
   ```
3. **Run the program**
   ```bash
   java Main
   ```
4. **Follow the on-screen menu** to interact with the deck

## Code Structure
### `Card.java`
- Represents a single playing card
- Contains attributes: `rank` and `suit`
- Includes methods to compare ranks and suits

### `Deck.java`
- Manages a collection of `Card` objects
- Implements methods for deck operations like shuffling, dealing, and searching

### `Main.java`
- Provides a **console-based menu** for user interaction
- Calls methods from `Deck` and `Card` classes to execute user commands

## Example Output
```
Card Deck Menu:
1. Print Deck
2. Find a Card
3. Deal 5 Random Cards
4. Shuffle Deck
5. Compare Two Cards (Same Rank)
6. Check if Two Cards Have the Same Suit
0. Exit
Enter your choice: 3

Dealing 5 random cards:
King of Hearts
5 of Spades
Ace of Diamonds
7 of Clubs
10 of Hearts
```


## Author
**Vedant Singh Thakur**  
[Batch: B3]  
[PRN: 23070126144]

## License
This project is licensed under the **MIT License**.

