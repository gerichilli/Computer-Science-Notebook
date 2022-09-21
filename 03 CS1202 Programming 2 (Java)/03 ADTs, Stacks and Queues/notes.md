## Stacks, Queues, and ADTs

- ADT: Stand for **abstract data type**
- Refers to a set of possible values and a set of operations on those values, without any specification of how the values are to be represented or how the operations are to be implemented
- Example: ordered list of strings -> an abstract data type
  - Any sequence of Strings that is arranged in increasing order is a possible value
  - The operations on the data type include inserting a new string, deleting a string, and finding a string in the list
    => No matter how the "ordered list of strings" ADT is implemented (linked list or array or arraylist), a program only depends on the abstract definition of the ADT
- The implementation of the ADT can be changed without affecting the program
- This can make the program easier to debug and maintain

### Stacks

- one of common ADTs
- LIFO policy: Last In, First Out
- A stack consists of a sequence of items as piled one on top of the other
- Only the top item on the stack is accessible at any given time
- Methods
  - `void push(newItem)`: add new item to the top of the stack
  - `int pop()`: remove the top item and return it
  - `boolean isEmpty()`: return true if the stack is empty

### Queues

- one of common ADTs
- FIFO policy: First In, First Out
- Similar to stacks, a queue consists of a sequence of items and there are restrictions about how items can be added to and removed from the list
- A queue has two ends: the front and the back
  - `enqueue`: add item at the back of the queue
  - `dequeue`: remove item at the front of the queue
- Methods
  - `void enqueue(newItem)`
  - `int dequeue()`
  - `boolean isEmpty`

### Postfix Expressions

- Infix expression: an operator (+,-,\*,/) comes in between its two operands
- Postfix expression:
  - an operator comes after its operands
  - postfix expressions don't require parentheses or precedence rules
