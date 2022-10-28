# How Objects Behave: Methods Use Instance Variables

- A class describes what an object knows and what an object does => A class is the blueprint for an object
  - Things an object knows is _instance variables_(state)
  - Things an object does is _instance methods_(behavior)
- Method takes parameters, a caller passes arugments

## Encapsulation

- Exposing our data:
  - Be able to use dot operator to change object instance variable
  - We must force everybody to call a setter method, so we can protect the object instance variable from upacceptable change
- Hide the data:
  - Mark your instance variables private
  - Provide public getter and setter or mutator method
- **Instance varialbes always get a default value, even if you don't explicitly assign a value to an instance variable or don't call setter method**
- **Local variable DO NOT get a default value**

## Comparing variables (primitives or references)

- Primitives: using `==`
- References: using `equals()`
