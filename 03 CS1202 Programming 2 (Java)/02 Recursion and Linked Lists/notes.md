# Recursion and Linked Lists

## Recursion

- Recursive defination: thing that is being defined as part of the defination
- Recursive method: A method that call itself
- Important rules
  - base case:
    - conditional statement that has a return
    - can be handled without a recursion
  - must be applied to smaller problem, that is, each time the recursion is applied, the size of problem is getting smaller until it get to the base case
- Pros:
  - compact, elegent code
  - easier to understand
- Cons:
  - Use computer memory (with open stack)
  - Violate the rules lead to wrong output, infinite recursion => run out of memory

### The tower of Hanoi

- Reference Video: [Tower of Hanoi | GeeksforGeeks](https://www.youtube.com/watch?v=YstLjLCGmgg)

### QuickSort

- Idea
  - **Pivot**: Given a list of items, select any item from the list
  - Move all the items that are smaller than the pivot to the beginning of the list
  - Move all the items that are larger than the pivot to the end of the list
  - Put the pivot between two groups of items
- Reference Video: [Java: Explain QuickSort](https://www.youtube.com/watch?v=Fiot5yuwPAg)

## Linked Data Structures

### Recursive linking

- A linked list consists of a chain of objects of the same type, linked together by pointers from one object to the next

### Linked Lists

#### Node

- The term node is often used to refer to one of the objects in a linked data structure
- Each node holds a String and a pointer to the next node in the list

```
class Node {
   String item;
   Node next;
}
```

- program needs a variable that refers to the first node in the list (head)
