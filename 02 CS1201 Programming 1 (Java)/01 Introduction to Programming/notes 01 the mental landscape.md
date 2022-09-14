# The Mental Landscape

## The Fetch and Execute Cycle: Machine Language

### When the CPU executes a program

- Watch these video:
  - [Inside your computer - Bettina Bair](https://www.youtube.com/watch?v=AkFi90lZmXA)
  - [How does computer memory work? - Kanawat Senanan](https://www.youtube.com/watch?v=p3q5zWCw8J4)

### Arithmetic Logic Unit ALU (**Đơn vị logic số học)**

- Là một phần của bộ xử lý thực hiện các phép toán như cộng và trừ
- Nó cũng chứa một số lượng nhỏ các thanh ghi (registers), là các đơn vị bộ nhớ nhỏ có khả năng chứa một số duy nhất.
- Một CPU điển hình có thể có 16 hoặc 32 thanh ghi "mục đích chung", chứa các giá trị dữ liệu có thể truy cập ngay lập tức để xử lý và nhiều lệnh ngôn ngữ máy tham chiếu đến các thanh ghi này.
- Reference video: [How Computers Calculate - the ALU: Crash Course Computer Science #5](https://www.youtube.com/watch?v=1I5ZMmrOfnA&t=382s)

### Program counter (PC)

- The CPU uses the PC to keep track of where it is in the program it is executing.
- The PC simply stores the memory address of the next instruction that the CPU should execute.
- At the beginning of each fetch-and-execute cycle, the CPU checks the PC to see which instruction it should fetch
- During the course of the fetch-and-execute cycle, the number in the PC is updated to indicate the instruction that is to be executed in the next cycle
- Reference video: [Program Counter Basic](https://www.youtube.com/watch?v=ccf9ngGIb8c)

### Binary numbers

- Machine language instructions are expressed as binary numbers
- Each zero or one is called a bit
- Each memory location holds a byte, which is a sequence of eight bits.
- Một máy tính có thể làm việc trực tiếp với các số nhị phân vì các công tắc có thể dễ dàng biểu diễn các số như vậy: Bật công tắc để biểu diễn số 1; tắt nó đi biểu thị số 0
- Reference Video: [How exactly does binary code work? - José Américo N L F de Freitas](https://www.youtube.com/watch?v=wgbV6DLVezo)

## Asynchronous Events: Polling Loops and Interrupts

### Complete system

Contains other devices (than CPU and main memory) such as:

- A hard disk or solid state drive for storing programs and data files (Lưu ý rằng main memory chỉ chứa một lượng thông tin tương đối nhỏ và chỉ lưu giữ nó khi nguồn được bật. Đĩa cứng hoặc ổ trạng thái rắn được sử dụng để lưu trữ vĩnh viễn lượng thông tin lớn hơn, nhưng các chương trình phải được được tải từ đó vào main memory trước khi chúng thực sự có thể được thực thi.)
- A keyboard and mouse for user input.
- A monitor and printer which can be used to display the computer's output.
- An audio output device that allows the computer to play sounds.
- A network interface
- A scanner that converts images into coded binary numbers that can be stored and manipulated (thao tác) on the computer

<aside>
💡 Bằng cách nào đó CPU phải giao tiếp và điều khiển tất cả các thiết bị này
</aside>

### Polling Loops and Interrupts

#### Bus

- A bus is a set of electrical wires that carry a signal.
  - Data Bus: carry data bit
  - Address Bus: told computer where data is going
  - Control Bus: determine when data will be sent
- A computer system consisting of many devices is typically organized by connecting those devices to one or more busses.
- Reference Video: [Computer bus](https://www.youtube.com/watch?v=aBCaCrC3z0k)

#### Polling (Thăm dò)

- Các thiết bị như bàn phím, chuột và giao diện mạng có thể tạo ra đầu vào cần được xử lý bởi CPU ⇒ How does the CPU know that the data is there?
- Solution: Let CPU to keep checking for incoming data over and over. Whenever it finds data, it processes it ⇒ This method is called polling (CPU liên tục thăm dò các thiết bị đầu vào để xem liệu chúng có bất kỳ dữ liệu đầu vào nào để báo cáo hay không)
- It is very inefficient. The CPU can waste an awful lot of time just waiting for input.

#### Interrupts (Ngắt)

- To avoid polling inefficiency
- An interrupt is a signal sent by another device to the CPU
- The CPU responds to an interrupt signal by **putting aside whatever it is doing in order to respond to the interrupt**
- Once it has handled the interrupt, it returns to what it was doing before the interrupt occurred
- Interrupts allow the CPU to deal with asynchronous events

### Thread (Luồng)

- Each of the individual tasks that the CPU is working on is called a thread.
- Many CPUs can literally execute more than one thread simultaneously—such CPUs contain multiple "cores," each of which can run a thread—but there is always a limit on the number of threads that can be executed at the same time.
- A thread that is being executed will continue to run until one of several things happens:
  - The thread might voluntarily yield control, to give other threads a chance to run. (Luồng có thể tự nguyện nhường quyền kiểm soát, để tạo cơ hội cho các luồng khác chạy.)
  - The thread might have to wait for some asynchronous event to occur
  - The thread might use up its allotted slice of time and be suspended to allow other threads to run (Luồng có thể sử dụng hết phần thời gian được phân bổ của nó và bị tạm ngưng để cho phép các luồng khác chạy)
- Reference video: [CPU Cores VS Threads Explained](https://www.youtube.com/watch?v=hwTYDQ0zZOw&t=236s)

### Operating system (Hệ điều hành)

- The software that does all the interrupt handling, handles communication with the user and with hardware devices, and controls which thread is allowed to run
- The operating system is the basic, essential software without which a computer would not be able to function
- Ex: Window, Mac OS, Linux, Android, iOS
- Reference Video: [How Do Operating Systems Work?](https://www.youtube.com/watch?v=GjNp0bBrjmU)

## The Java Virtual Machine

### Compiler

- A compiler takes a high-level-language program and translates it into an executable machine-language program
- Once the translation is done, the machine-language program can be run any number of times
- **It can only be run on one type of computer** (since each type of computer has its own individual machine language). If the program is to run on another type of computer it has to be re-translated, using a different compiler, into the appropriate machine language.

### Interpreter

- Translates it instruction-by-instruction, as necessary
- The interpreter runs in a loop in which it repeatedly reads one instruction from the program, decides what is necessary to carry out that instruction, and then performs the appropriate machine-language commands to do so
- Interpreters have another purpose: **They can let you use a machine-language program meant for one type of computer on a completely different type of computer**.
- Programs written in Java are compiled into **Java Virtual Machine**. The machine language for the Java Virtual Machine is called **Java bytecode** ⇒ **can actually be used on any computer. All that the computer needs is an interpreter for Java bytecode**

### The designers of Java

- Combination of compiling and interpreting
- Reference Video: [What is JVM](https://www.youtube.com/watch?v=G1ubVOl9IBw)

### Advantages of Java bytecode

- Small, simple program
- The bytecode interpreter acts as a buffer between you and the program you download. You are really running the interpreter, which runs the downloaded program indirectly. The interpreter can protect you from potentially dangerous actions on the part of that program.
- Just-in-time compiler can significantly speed up the overall execution time.

## Fundamental Building Blocks of Programs

### Data

- Variable
- Type

### Instruction

- Control structures
  - Loop
  - Branches
- Method

## Objects and Object-oriented Programming

- The central concept of object-oriented programming is the object which is a kind of module containing data and methods
- The program that results is a collection of objects, each with its own data and its own set of responsibilities.
- Reference video: [Object-oriented Programming in 7 minutes](https://www.youtube.com/watch?v=pTB0EiLXUC8)

## The Modern User Interface

## The Internet and Beyond

- [How does the internet work? - Glad You Asked S1](https://www.youtube.com/watch?v=TNQsmPf24go)
