# Control Structures

## Blocks, Loops, and Branches

### Block

- Purpose: Group a sequence of statements into a single statement
  ```java
  {
  	statements
  }
  ```
- **A variable declared inside a block is completely inaccessible and invisible from outside that block.**
- When the block ends, that memory is discarded (that is, made available for reuse) ⇒ Scope
- Scope of and identifier is the part of the program in which that identifier is valid

### While Loop

```java
while (boolean-expression) {
    statements
}
```

### The Basic If Statement

```java
if ( <boolean-expression> )
	<statement1>
else
	<statement2>
```

### Definite Assignment

💡 The value of a variable can only be used if the compiler can **verify that the variable will have been assigned a value at that point when the program is running.**

```java
public class DefiniteAssignment {

	public static void main(String[] args) {
		int y;
		int x = 2;
		if (x < 0) {
			y = 1;
		}

		if (x >= 0) {
			y = 2;
		}

		System.out.println(y);

	}
}
```

- OUTPUT
  Exception in thread "main" java.lang.Error: Unresolved compilation problem:
  The local variable y may not have been initialized
  at DefiniteAssignment.main(DefiniteAssignment.java:16)
  => _The computer can’t tell that the variable y has definitely been assigned a value because if statement has no else part_

## Algorithm Development

### Defination

- A program is an expression of an idea ⇒ Programmer starts with a general idea of a task for computer to perform ⇒ make that outline into a complete, unambiguous (rõ ràng), step-by-step procedure for carrying out the task ⇒ Algorithm

### Pseudocode and Stepwise Refinement (Mã giả và tinh chỉnh từng bước)

1. Write description of the task

```
Get the user’s input
Compute the value of the investment after 1 year
Display the value
Compute the value after 2 years
Display the value
Compute the value after 3 years
Display the value
Compute the value after 4 years
Display the value
Compute the value after 5 years
Display the value
```

2. Take that description as an outline of the algorithm

```
Get the user’s input
while there are more years to process:
	Compute the value after the next year
	Display the value
```

3. Refine and elaborate that description

```
Ask the user for the initial investment
Read the user’s response
Ask the user for the interest rate
Read the user’s response

while there are more years to process:
	Compute the interest
	Add the interest to the value
	Display the value
```

4. Gradually adding steps and detail

```
Ask the user for the initial investment
Read the user’s response
Ask the user for the interest rate
Read the user’s response

years = 0
while years < 5:
	years = years + 1
	Compute interest = value * interest rate
	Add the interest to the value
	Display the value
```

5. Have a complete algorithm that can be translated directly into programming language

```java
double principal, rate, interest;
int years;
System.out.print("Type initial investment: ");
principal = TextIO.getlnDouble();
System.out.print("Type interest rate: ");
rate = TextIO.getlnDouble();

years = 0;
while (years < 5) {
	years = years + 1;
	interest = principal * rate;
	principal = principal + interest;
	System.out.println(principal);
}
```

## The while and do..while Statements

### while statement

- body of the loop
- continuation condition / test of the loop
- sentinel value (giá trị lính gác): condition of termination
- priming the loop: Setting things up so that the test in a while loop makes sense the first time it is executed
- off-by-one errors: The sentinel is not part of the data (when the computer finally reads the sentinel value, the loop ends before the sentinel value is processed. It is not added to the sum, and it is not counted.)

### do.. while statement

- Test the continuation condition at the end of a loop

  - Execute body of the loop
  - Evaluate the boolean expression

💡 The body of a do loop os always executed at least one

### break and continue

#### `break`

- Breaking out the middle of the loop
- When computer executes a break statement in a loop, it will immediately jump out of the loop ⇒ continues on to whatever follows the loop in the program
- 💡 If you use a break statement inside a nested loop, it will only break out of that loop, not out of the loop that contains the nested loop ⇒ **labeled break**: allow you to specify which loop you want to break

#### `continue`

- Tell computer to skip the rest of the current iteration of the loop
- Instead of jumping out of the loop altogether, **it jumps back to the beginning of the loop and continue with the next iteration**
- Nested loop ⇒ same as break, continue the loop that directly contains it

## For loops

- For loops: The initialization, continuation condition, and updating have all been combined in the first line of the for loop

```
for ( <initialization>; <continuation-condition>; <update> ) {
	<statements>
}
```

## The if Statement

### The Dangling else Problem

⚠ When if else statement is not written inside {}, indentation to make nested if statement doesn’t mean anything => Force the computer to do right thing by {}

```java
if ( x > 0 )
	if (y > 0)
		System.out.println("First case");
	else
		System.out.println("Second case");
```

It is equivalent to

```java
if ( x > 0 )
	if (y > 0)
		System.out.println("First case");
	else
		System.out.println("Second case");

```

### Multiway Branching

```java
if (<boolean-expression-1>)
	<statement-1>
else if (<boolean-expression-2>)
	<statement-2>
else
	<statement-3>
```

1. if `<boolean-expression-1>` is `true` ⇒ executes `<statement-1>` ⇒ jumps all the way to the end the outer if statement, skipping the others
2. if `<boolean-expression-2>` is `true` ⇒ executes `<statement-2>` ⇒ jumps all the way to the end the outer if statement, skipping the rest
3. the rest ⇒ executes `<statement-3>` ⇒ jumps all the way to the end the outer if statement

💡 **This statement is called a multiway branch because one and only one of the statements will be executed**

## The switch Statement

### The Basic switch Statement

```
switch ( expression ) {
    case-label-or-default -> statement
    case-label-or-default -> statement
        .
        .
        .
    case-label-or-default -> statement
}
```

- Expression can be primitive integer types int, short, byte, char **but cannot be double or float**
- Expression can be enum or string
- The computer can evaluate one expression and jump directly to the correct case

#### Break

- Make computer jump past the end of the switch statement, skipping over all the remaining cases

### Definite Assignment and switch Statements

```java
String computerMove;
switch ( (int)(3*Math.random()) ) {
	case 0:
		computerMove = "Rock";
		break;
	case 1:
		computerMove = "Paper";
		break;
	case 2:
		computerMove = "Scissors";
		break;
}

System.out.println("The computer’s move is " + computerMove); // ERROR!
```

- Three cases in the `switch` cover all the possibilities ⇒ but compiler is not smart enough to figure that out
- The Java compiler must be able to determine that a variable has definitely been assigned a value before its value is used ⇒ **Should have `default` case**

### The Traditional switch Statement

```java
switch (expression) {
   case constant-1:
      statements-1
      break;
   case constant-2:
      statements-2
      break;
      .
      .   // (more cases)
      .
   case constant-N:
      statements-N
      break;
   default:  // optional default case
      statements-(N+1)
} // end of switch statement
```
