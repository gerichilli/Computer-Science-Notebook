# Variables and Types

## Declaring a variables

- Java cares about types
- Variable come in two flavors: primitive and reference
- Variables must always be declared with a name and a type

## Primitive variables vs reference variables

- With primitive variables, the value of the variable is...the value
- With reference variables, the value of the variable is...bits representing a way to get to a specific object on the heap.

## Primitive Types

- boolean and char
- numeric
  - integer
    - byte
    - sort
    - int
    - long
  - floating point
    - float
    - double

## Garbage collection heap

- If a reference is the only reference to a paticular object and then it is set to `null` => nobody can get to that object => its connect object is eligible for garbage collection
- In another words if object **unreachable** (it has no more references) => It is garbage collection

## Arrays

- Arrays are objects toos
