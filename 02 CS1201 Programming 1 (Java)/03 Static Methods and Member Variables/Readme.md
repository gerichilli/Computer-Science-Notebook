# Static Methods and Member Variables

## Black Boxes and Procedural Abstraction

### Blackbox

- A method is sometimes said to be a “black box” because you can’t see what’s inside it (you usually don’t want to see inside it)
- The inside of a black box is called its implementation
- It should be possible to change the implementation, as long as the behavior of the box, as seen from the outside, remains unchanged

### Interface

- allow some interaction between what’s inside the box and what’s outside
- you shouldn’t need to know anything about its implementation; all you need to know is its interface
- The implementor of a black box **should not need to know anything** about the larger systems in which the box will be used. The implementor just needs to make sure that the box performs its assigned task and interfaces correctly with the rest of the world

💡 Black box divides the worlds into two parts: **the inside (implementation) and the outside. The interface is at the boundary, connecting those two parts**

### Specification

- The interface also includes a specification of what the box does and how it can be controlled by using the elements of the physical interface
- syntactic specification (đặc tả cú pháp):
  - what you have to type in order to call the method → to write legal program
- semantic specification (đặc tả ngữ nghĩa)
  - what task the method will accomplish → to understand the purpose of the method and to use it effectively
