# More Generic Programming

## Lists and Sets

### ArrayList and LinkedList

- Two obvious ways to represent a list

```java
ArrayList <T>
LinkedList <T>
```

- LinkedList: more efficient in applications where items will often be added or removed at the beginning of the list or in the middle of the list
- ArrayList: more efficient when random access to items is required
- Both operations: efficiently when sorting and adding an item at the end of the list

#### Methods

- [Methods for List (LinkedList and ArrayList)](./examples/src/ListMethods.java)
- [Additional methods for LinkedList](./examples/src/LinkedListOnlyMethods.java)

#### Lists Iterator

```
ListIterator<T>
```

- Like Collectuon Iterator, return by `list.listIterator()` method
