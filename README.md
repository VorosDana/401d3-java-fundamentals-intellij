# 401d3 Java Fundamentals


## Lab 01: basics ( [Link](./src/main/java/basics/Main.java) )

### Pluralize

#### Task
Make a function that takes in a string and a number, adds an 's' to that string if the count is 0 or greater than 1, then returns that string.

#### Tests

- [x] 0
- [x] 1
- [x] 2


### Coin Flips

#### Task
Make a function that takes in an int, then simulate flipping coins until the number of heads in a row is equal to the input number. Each flip, print heads or tails as appropriate, when finished, print out how many flips it took to get the requisite consecutive heads.

#### Tests

- [x] 2
- [x] 4

### Command Line Clock

#### Task

Make a function that displays the current time in the terminal, when the time to display changes, print it again. Continue until a break command is issued by the user.

#### Tests

- [x] Run

## Lab 02: basiclibrary ( [Code](./src/main/java/basiclibrary/Lab02.java) ) ( [Tests](./src/test/java/basiclibrary/Lab02Test.java))

### Roll

#### Task

Make a function that takes in an int n and returns an array of n length of six sided dice rolls.

#### Tests 

- [x] roll 20, confirm that all are within range
- [x] roll 15, confirm that all are within range

### Contains Duplicates

#### Task

Make a function that takes in an array, and returns true if it contains duplicate values, false if not.

#### Tests

- [x] Array that contains duplicates
- [x] Array that does not contain duplicates
- [x] Bad input: empty array

### Array Average

#### Task

Make a function that takes in an array of ints, and returns the average of its values.

#### Tests

- [x] Valid input value
- [x] Bad input: empty array. Returns int default value of 0

### Array of Arrays

#### Task

Make a function that takes in a two dimensional array of ints, and returns the array with the smallest average value

#### Tests

- [x] Several arrays of ints, returns proper array
- [x] Include an empty array in input, returns empty array if its average of 0 is the smallest
- [x] Empty input, returns empty array