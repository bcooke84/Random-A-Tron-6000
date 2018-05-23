# Create the Random-A-Tron 6000

## MVP

You are required to create a Java Spark application to generate random names from a list, or generate random pairs of names from a list. The list of names should be pre-populated.

Create a class which holds a pre-populated ArrayList of Strings, for the names to be randomised. This class should have a method for each of the following:
 * to be able to return a random name from the ArrayList
 * to be able to get a pair of random names from the ArrayList and return those names using an ArrayList

Create a Spark application which uses the class you have create above. It should have the following routes:
`/one` - this should get a single random name from the list and display that name in the browser
`/two` - this should get a random pair of names from the list and display that pair in the browser.

You should display the results using Velocity Templates. You will need a different Velocity Template for each route.

## Extension
- Add a new student to a list
