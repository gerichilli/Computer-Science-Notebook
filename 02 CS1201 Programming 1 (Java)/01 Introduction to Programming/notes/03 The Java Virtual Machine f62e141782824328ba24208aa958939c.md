# The Java Virtual Machine

## Compiler

- A compiler takes a high-level-language program and translates it into an executable machine-language program
- Once the translation is done, the machine-language program can be run any number of times
- **It can only be run on one type of computer** (since each type of computer has its own individual machine language). If the program is to run on another type of computer it has to be re-translated, using a different compiler, into the appropriate machine language.

## Interpreter

- Translates it instruction-by-instruction, as necessary
- The interpreter runs in a loop in which it repeatedly reads one instruction from the program, decides what is necessary to carry out that instruction, and then performs the appropriate machine-language commands to do so
- Interpreters have another purpose: **They can let you use a machine-language program meant for one type of computer on a completely different type of computer**.
- Programs written in Java are compiled into **Java Virtual Machine**. The machine language for the Java Virtual Machine is called **Java bytecode** ⇒ **can actually be used on any computer. All that the computer needs is an interpreter for Java bytecode**

## The designers of Java

- Combination of compiling and interpreting

![Untitled](The%20Java%20Virtual%20Machine%20f62e141782824328ba24208aa958939c/Untitled.png)

### Advantages of Java bytecode

- Small, simple program
- The bytecode interpreter acts as a buffer between you and the program you download. You are really running the interpreter, which runs the downloaded program indirectly. The interpreter can protect you from potentially dangerous actions on the part of that program.
- Just-in-time compiler can significantly speed up the overall execution time.