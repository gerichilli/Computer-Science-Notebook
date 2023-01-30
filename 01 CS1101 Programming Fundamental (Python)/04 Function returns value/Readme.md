# FRUITFUL FUNCTION

## 1. Return values

- Void function

  - no return value = return value is None

- Fruitful function
  ```python
  def area(radius):
    a = math.pi \* radius\*\*2
    return a
  ```
  - Return immediately from this function
  - Use a as return value
  - As soon as return statement runs => function terminates, the other place can never reach => dead code

## 2. Incremental development

- scaffolding
  - Start with working programe => makes small change => check errors
  - Use variables => check errors
  - Working => remove some of the scaffolding

## 3. Composition

- Call 1 function from within another

## 4. Boolean functions

## 5. More recursion

## 6. Leap of faith

- When come to a function call => assume that function works correctly and return right

## 7. Checking types

## 8. Debugging

- Breaking a large program => smaller functions => creates natural checkpoints for debugging. If a function is not working:

  - Something wrong with arguments, precondition is violated
  - Something wrong with the function, postcondition is violated
  - Something wrong with the return value/the way it is being used

- To find out something wrong
  - Add print statement at the beginning of the function => display value/type of parameters
  - Check the preconditions
  - Check return value
  - Check the result by hand
  - Call function with values that make it easy to check the result
  - Look at function call
  - Add print statements at the beginning and end of the function

## 9. Grossary

- temporaty variable: store an intermediate value in a complex calculation
- dead code: part of program that can never run (often because it is after return statement)
- incremental development: program development plan: avoid debugging = adding and testing only a small amount of code at a time
- scaffolding: code used during program development but not in final version
- guardian: use conditional statement => check for and handle cases that might cause an error
