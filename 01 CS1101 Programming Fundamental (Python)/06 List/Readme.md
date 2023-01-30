# LIST

## 1. A list is a sequence

- List is a sequence of values
- In a list, values can be any type
- The values in a list are called element or item

## 2. Lists are mutable

- index: integer expression
- if you try to read or write an element that does not exist => get an `IndexError`
- index < 0 => count backward
- `in` operator

## 3. Traversing a list

- read: for loop
- modify: for loop with range and len

## 4. List operations

- `+` operator: concate
- `*` operator: repeat

## 5. List slices

- `list[start:end]` (end is not included)

  - omit first index => slice from begining
  - omit last index => slide to the end
  - omit both => copy whole list

- slice operator on the left side of an assignment => can update multiple elements

## 6. List method

- append
- extend
- sort

## 7. Map, filter, reduce

- REDUCE: combine a sequence of elements into a single value
- MAP: traverse 1 list => building new list
- FILTER: selects some of the elements and filters out the others

## 8. Deleting elements

- pop: list.pop(index_of_element) => return the element that was removed
- del: list.del(index_of_element) / list.del(start,end) (end is not included)
- remove: list.remove(element) => return None

## 9. Lists and strings

- LIST: Convert string to list => converted_list = list(string) => break in to letter
- SPLIT: converted_list = string.split() => break in to words
- JOIN: concate elements

## 10. Objects and values

- equivalent: have the same elements
- identical: same object

## 11. Aliasing

- reference: The association of a variable with an object
- aliased object: an object with >1 reference and >1 name

## 12. List arguments

- Operations that modifies the list
- Operations that create a new list

## 13. Debugging

- Most list methods modify the argument and return None
- Pick an idiom and stick with it.
- Make copies to avoid aliasing
  - sorted: return a new sorted list (unlike sort: modify list)

## 14. Glossary

- list
- element
- nested list
- accumulator
- augmented assigment: +=
- reduce
- map
- filter
- object
- equivalent: having same value
- identical: being the same object
- reference
- aliasing
- delimiter
