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

## Binary Trees

```
class TreeNode {
  int item; // The data in this node
  TreeNode left; // Pointer to the left subtree
  TreeNode right; // Pointer to the right subtree
}
```

- **parent**: the node that points to another => parent of that node
- **child**: the node the parent node points to
- **leaf**: the node that has no children
- A binary tree must have the following properties
  - **root**: There is exactly one node in the tree which has no parent
  - Every other node in the tree has exactly 1 parent
  - there can be no loops in a binary tree

### Tree Traversal

- [Example](./examples/src/BinaryTree.java)

#### Preorder Traversal

1. The root
2. Left subtree
3. Right subtree

#### Postorder Traversal

1. The left subtree
2. The right subtree
3. The root

#### Inorder Traversal

1. The left subtree
2. The root
3. The right subtree

### Binary Sort Trees

- A binary tree can be used to store an ordered list in a way that makes both searching and insertion efficient
- A binary sort tree is a binary tree with the following property
  - For every node in the tree, the item in that node is >= to every item in the left subtree of that node
  - and it is <= to all the items in the right subtree of that node
- An inorder traversal of the tree will process the items in increasing order
- Searching and inserting are efficient operations on a binary search tree, provided that the tree is close to being balanced
  - **balanced binary tree**: if for each node, the left subtree of that node contains approximately the same number of nodes as the right subtree
