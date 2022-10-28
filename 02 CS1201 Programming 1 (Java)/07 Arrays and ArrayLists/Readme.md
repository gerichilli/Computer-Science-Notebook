# Arrays and ArrayList

## 1. Array Details

## 2. Array Processing

### Some Processing Examples

- [Add array element](./example/src/AddArrayElementReview.java)
- [Delete array element](./example/src/DeleteArrayElementReview.java)

### Some Standard Array Methods

- `Arrays.copyOf( list, lengthOfCopy )`
- `Arrays.fill( array, value )`
- `Arrays.fill( array, fromIndex, toIndex, value )`
- `Arrays.toString( array ) `
- `Arrays.sort( array )`
- `Arrays.sort( array, fromIndex, toIndex )`
- `Arrays.binarySearch( array, value )`

### Dynamic Arrays

- [Example](./example/src/DynamicArrayReview.java)

## 3. ArrayList

### ArrayList and Parameterized Types

- [Example](./example/src/ArrayListBuiltInMethod.java)

### Wrapper Classes

- Parameterized types don't work with the primitive types. There are no `ArrayList<int>`
- Auto boxing
- Unboxing
- [Example](./example/src/ArrayListWrapper.java)

## 4. Records

## 5. Searching and Sorting

### Binary Search

- [Binary Search](./example/src/BinarySearchReview.java)

### Association Lists

- [PhoneDirectory](./example/src/PhoneDirectory.java)

### Insertion Sort

- Moving each of the bigger items up one space to make room for the new item.

=> Sorting method: Take all the items out of an unsorted array => insert them back into the array one by one

- [Reference Video](https://www.youtube.com/watch?v=lCDZ0IprFw4&t=19s)
- [InsertionSort Example](./example/src/InsertionSort.java)

### Selection Sort

- Finding the biggest (or the smallest) item in the list => moving it to the end (or the start)
- Apply the same idea to the remainning items
