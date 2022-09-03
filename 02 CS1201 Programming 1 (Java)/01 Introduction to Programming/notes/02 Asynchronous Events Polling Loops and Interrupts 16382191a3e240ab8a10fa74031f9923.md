# Asynchronous Events: Polling Loops and Interrupts

# Sự kiện không đồng bộ: Vòng lặp thăm dò và ngắt

## Complete system

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

## **Polling Loops and Interrupts**

![Untitled](Asynchronous%20Events%20Polling%20Loops%20and%20Interrupts%2016382191a3e240ab8a10fa74031f9923/Untitled.png)

### Bus

- A computer system consisting of many devices is typically organized by connecting those devices to one or more busses.
- A bus is a set of wires that carry various sorts of information between the devices connected to those wires.
- The wires carry data, addresses, and control signals.
- An address directs the data to a particular device and perhaps to a particular register or location within that device.

### Polling (Thăm dò)

- Các thiết bị như bàn phím, chuột và giao diện mạng có thể tạo ra đầu vào cần được xử lý bởi CPU ⇒ How does the CPU know that the data is there?
- Solution: Let CPU to keep checking for incoming data over and over. Whenever it finds data, it processes it ⇒ This method is called polling (CPU liên tục thăm dò các thiết bị đầu vào để xem liệu chúng có bất kỳ dữ liệu đầu vào nào để báo cáo hay không)
- It is very inefficient. The CPU can waste an awful lot of time just waiting for input.

### Interrupts (Ngắt)

- To avoid polling inefficiency
- An interrupt is a signal sent by another device to the CPU
- The CPU responds to an interrupt signal by **putting aside whatever it is doing in order to respond to the interrupt**
- Once it has handled the interrupt, it returns to what it was doing before the interrupt occurred
- Interrupts allow the CPU to deal with asynchronous events

## Thread (Luồng)

- Each of the individual tasks that the CPU is working on is called a thread.
- Many CPUs can literally execute more than one thread simultaneously—such CPUs contain multiple "cores," each of which can run a thread—but there is always a limit on the number of threads that can be executed at the same time.
- A thread that is being executed will continue to run until one of several things happens:
    - The thread might voluntarily yield control, to give other threads a chance to run. (Luồng có thể tự nguyện nhường quyền kiểm soát, để tạo cơ hội cho các luồng khác chạy.)
    - The thread might have to wait for some asynchronous event to occur
    - The thread might use up its allotted slice of time and be suspended to allow other threads to run (Luồng có thể sử dụng hết phần thời gian được phân bổ của nó và bị tạm ngưng để cho phép các luồng khác chạy)

## Operating system (Hệ điều hành)

- The software that does all the interrupt handling, handles communication with the user and with hardware devices, and controls which thread is allowed to run
- The operating system is the basic, essential software without which a computer would not be able to function
- Ex: Window, Mac OS, Linux, Android, iOS