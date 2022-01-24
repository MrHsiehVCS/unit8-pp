# Unit 8 Programming Project

## Part A: `Reservation` Class

An airline flight reservation system stores information about reservations for each seat on a flight. The `Reservation` class stores the name of the passenger and whether the passenger is a frequent flyer. Your `Reservation` class should include:

- A constructor that takes the `name` of the passenger and the `frequentFlyer` status as parameters
- An accessor method named `getPassengerName()` that returns the passenger's name on the `Reservation`
- An accessor method named `isFrequentFlyer()` that returns `true` if this passenger is a frequent flyer and `false` otherwise

You may include any other variables and methods you want. The following must also be followed:

- Encapsulation of instance variables
- JavaDoc all methods and classes

## Part B: `Flight` Class

The `Flight` class stores all `Reservation`s for a `Flight`. Each `Flight` represents an airplane with a certain amount of seats. Your `Flight` class should include the following:

- A two-dimensional array of `Reservation`s with empty seats represented by `null`
- A constructor method that takes two `int`s in the following order:
  - the number of rows on the flight
  - the number of seats per row
    - If the number of seats per row is even, you should add a blank seat in the middle to represent an aisle
    - If the number of seats is odd, you should add a blank seat toward the "right side" of the plane to represent the aisle
    - Aisles should be represented by a bunch of `Reservation`s that have a passenger name of `"AISLE"`
- An accessor method `getFrequentFlyers()` that returns an `ArrayList<String>` with the names of all the frequent flyers on the `Flight`. If there are no frequent flyers, should return an empty `ArrayList`
- A mutator method called `reserveNextAvailableSeat(String name, boolean freqFlyer)` that reserves the next open seat for that passenger
  - Returns `true` if a seat was reserved and `false` otherwise
  - This should not change any current `Reservation`s in the `Flight`
  - The aisle is not a valid seat to place people in
  - Next is defined Top to Bottom, Left to Right
- A mutator method called `reserveAdjacentSeats(String passengerName, boolean firstFrequentFlyer, String passengerNameTwo, boolean secondFrequentFlyer)` that reserves the next pair of adjacent seats
  - If at least 1 pair of empty adjacent seats exist, the method reserves the next pair of empty adjacent seats and returns `true`
  - If no pair of empty adjacent seats exists, the method does not make any reservations and returns `false`
    - Two seats are adjacent if they are in the same row and have consecutive column numbers.
    - This should not change any current `Reservation`s in the `Flight`
    - The aisle is not a valid seat to place people in
    - Next is defined Top to Bottom, Left to Right
- The method `reserveWindowSeat(String name, boolean freqFlyer)` attempts to reserve a window seat for the passenger whose name is taken as a parameter.
  - If at least 1 empty window seat exists, the method reserves the next window seat and returns `true`
  - If no empty window seat exists, the method does not make any reservation and returns `false`
    - Method `reserveWindowSeat` does not modify existing `Reservation`s
    - A seat is a window seat if it is the first or last seat in any row
      - Empty seats are represented by `null`
      - Next is defined Top to Bottom, Left to Right
- The method `reserveAisleSeat(String name, boolean freqFlyer)` attempts to reserve an aisle seat for the passenger whose name is taken as a parameter
  - If at least 1 empty aisle seat exists, the method reserves the next aisle seat and returns `true`
    - Method `reserveAisleSeat` does not modify existing `Reservation`s
    - A seat is an aisle seat if it is the index before or after the aisle's index in a row
      - Empty seats are represented by `null`
      - Next is defined Top to Bottom, Left to Right
- The method `getIsolatedPassengers()` returns an `ArrayList<String>` of the names of all passengers with no adjacent `Reservation`s
  - A  passenger has no adjacent reservations if each seat adjacent to the  passenger’s seat is empty, or is an aisle
  - The object references in the returned list  may appear in any order
  - If there are no passengers with no adjacent reservations, the method returns an empty list
  - Two seats are adjacent if they are in the same row and have consecutive column numbers
  - Empty seats are represented by `null`
- The method `toString()` that returns a `String` to represent the `Reservation`s on the `Flight`
  - The aisle should be represented as `AISLE`
  - Empty seats (or `null` entries) should be represented as `EMPTY`
  - `Reservation`s that have a passenger should be represented by the passenger's name
  - There should be a single space between each seat. There should be no spaces along the edges of the plane
  - Rows should be separated by a new line
- The method `getSeats()` that returns the two-dimensional array of seats. This is used for testing purposes, and normally would not be necessary in your program.

## Part C: TicTacToe Win checker
You will implement functionality to check if there is a win in `TicTacToeBoard.java`. 
- A tic-tac-toe board is a 2d array of `String`s, indicating `" "`, `"X"`, or `"O"`. 
- Tic-tac-toe boards may be of any size (2 or greater), and will always be sqaure (same number of rows and columns, all rows are the same length).
- A win is defined as a row, column, or diagonal containing all `"X"`'s or all `"O"`'s. Diagonals must span from one corner of the board to the opposite corner. 

You will implement `hasHorizontalWin()`, `hasVerticalWin()`, and `hasDiagonalWin()`. Each of these methods are public, returns a boolean, and has no parameters. 
You are encouraged to create helper function(s). 

## Grading

- Attempted All Code: 25 points
- All Code Properly JavaDoc'ed: 25 points
- Passes All Test Cases: 50 points
