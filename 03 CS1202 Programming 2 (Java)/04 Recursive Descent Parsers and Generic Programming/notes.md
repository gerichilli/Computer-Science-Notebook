## A Simple Recursive Descent Parser (Trình phân tích cú pháp đệ quy)

### Backus-Naur Form (BNF)

- For programming languages, syntax rules are often expressed in BNF
- BNF does express the basic structure of the language, and it plays a central role in the design of compilers.

```
<sentence>  ::=  <noun-phrase> <verb-phrase>
```

- `::=`: can be: The sentence can be a `<noun-phrase>` followed by a `<verb-phrase>`

```
<verb-phrase>  ::=  <intransitive-verb>  |
                    ( <transitive-verb> <noun-phrase> )
```

- `|`: or
- `()`: used for grouping

```
<noun-phrase>  ::=  <common-noun> [ "that" <verb-phrase> ]  |
                    <common-noun> [ <prepositional-phrase> ]...
```

- `[]`: optional

```
<while-loop>  ::=  "while" "(" <condition> ")" <statement>
```

```
<if-statement>  ::=
             "if" "(" <condition> ")" <statement>
             [ "else" "if" "(" <condition> ")" <statement> ]...
             [ "else" <statement> ]
```

### Recursive Descent Parsing

- A parser is a program that determines the grammatical structure of a phrase in the language. (translating it into machine language)
- While parsing a phrase, it must be possible to tell what syntactic category is coming up next just by looking at the next item in the input

```
<expression>  ::=  <number>  |
                   "(" <expression> <operator> <expression> ")"

<operator>  ::=  "+" | "-" | "*" | "/"
```

- [Code](./examples/src/SimpleParser1.java)

```
<expression>  ::=  [ "-" ] <term> [ ( "+" | "-" ) <term> ]...
<term>  ::=  <factor> [ ( "*" | "/" ) <factor> ]...
<factor>  ::=  <number>  |  "(" <expression> ")"
```

- [Code](./examples/src/SimpleParser2.java)

### Building an Expression Tree

- [Code](./examples/src/SimpleParser3.java)

## Generic Programming

> GENERIC PROGRAMMING refers to writing code that will work for many types of data

### Generic Programming in Smalltalk

- variables in Smalltalk are typeless
- all data values are objects, and all operations on objects are defined by methods in a class

=> Put these two features together and you have a language where data structures and algorithms will work for any type of data

### Generic Programming in C++

- Using subroutine templates

```c++
template<class ItemType>
void sort( ItemType A[], int count ) {
      // Sort items in the array, A, into increasing order.
      // The items in positions 0, 1, 2, ..., (count-1) are sorted.
      // The algorithm that is used here is selection sort.
   for (int i = count-1; i > 0; i--) {
      int position_of_max = 0;
      for (int j = 1; j <= i ; j++)
         if ( A[j] > A[position_of_max] )
            position_of_max = j;
      ItemType temp = A[i];
      A[i] = A[position_of_max];
      A[position_of_max] = temp;
   }
}
```

### Generic Programming in Java

#### ArrayList

- The type parameter—String or Integer—just tells the compiler to limit the type of object that can be stored in the data structure.
- The type parameter has no effect at run time and is not even known at run time
- The type information is said to be "erased" at run time
- Example: the word "String" is optional in the constructor in the following statement, because the ArrayList that is created must be an ArrayList<String> to match the type of the variable

```java
ArrayList<String> words = new ArrayList<>();
```

### The Java Collection Framework

#### Java Collection Framework(JCF)

The generic data structures in the Java Collection Framework can be divided into two categories

```java
Collection<T>
Map<T,S>
```

- Collection: a collection of object, it has two types
  - Lists: a collection in which the objects are arranged in a linear sequence `List<T>`
  - Sets: `Set<T>`
    - no object can occur more than once in a set
    - the elements of a set are not necessarily thought of as being in any particular order
- Map: associates objects in one set with objects in another set in the way that a dictionary associates definitions with words

> **Here, `T` and `S` stand for any type except for the primitive types**

##### Some collection build in methods

- [CollectionMethods.java](./examples/src/CollectionMethods.java)

### Iterators and for-each Loops

- If coll is a collection, then `coll.iterator()` returns an iterator that can be used to traverse the collection
- Iterators are defined by a parameterized interface named `Iterator<T>`
- The interface `Iterator<T>` defines just three methods
  - `iter.next()`
    - returns the next item, and advances the iterator
    - If this method is called when no items remain, it will throw a `NoSuchElementException`.
  - `iter.hasNext()`
    - returns a boolean value telling you whether there are more items to be processed
    - should test this before calling iter.next()
  - `iter.remove()`
    - removes the item that was most recently returned by `iter.next()`
    - if the collection does not support removal of items, it might produce an `UnsupportedOperationException`
- It's possible to avoid the use of iterators for this purpose by using a for-each loop

```java
for ( T x : coll ) { // "for each object x, of type T, in coll"
   //  process x
}
```

- [Iterators Example](./examples/src/IteratorExample.java)

### Equality and Comparison

#### Equality

- method `obj1.equals(obj2)`: using to testing quality of 2 objects
  - However, for many sub-classes of Object, this definition is not reasonable, and it should be overridden
  - [Example of using built-in equals method does not give expected result](./examples/src/EqualsNotCorrect.java)
  - [Example of overriding equals method to make it gives expected result](./examples/src/EqualsCorrect.java)

#### Comparison

- Objects that are meant to be compared should implement the interface `java.lang.Comparable`
- `Comparable` is defined as a parameterized interface, `Comparable<T>`
- [`compareTo` example](./examples/src/FullName.java)
- There is another way to allow for comparison of objects in Java, and that is to provide a separate object that is capable of making the comparison. `public int compare( T obj1, T obj2 )`

### Generics and Wrapper Classes

- generic data structures can only hold objects, does not apply to the primitive types, but Wrapper Classes makes it possible
