# The Fetch and Execute Cycle: Machine Language

## When the CPU executes a program

![autodraw 4_9_2022.png](The%20Fetch%20and%20Execute%20Cycle%20Machine%20Language%20ca38eeb7136941b08104dd4d2a13f817/autodraw_4_9_2022.png)

## The operation of the CPU on the level of machine language

![draw-fecth and execute.png](The%20Fetch%20and%20Execute%20Cycle%20Machine%20Language%20ca38eeb7136941b08104dd4d2a13f817/draw-fecth_and_execute.png)

![Untitled](The%20Fetch%20and%20Execute%20Cycle%20Machine%20Language%20ca38eeb7136941b08104dd4d2a13f817/Untitled.png)

[https://www.youtube.com/watch?v=Z5JC9Ve1sfI](https://www.youtube.com/watch?v=Z5JC9Ve1sfI)

## Arithmetic Logic Unit ALU (**Đơn vị logic số học)**

- Là một phần của bộ xử lý thực hiện các phép toán như cộng và trừ
- Nó cũng chứa một số lượng nhỏ các thanh ghi (registers), là các đơn vị bộ nhớ nhỏ có khả năng chứa một số duy nhất.
- Một CPU điển hình có thể có 16 hoặc 32 thanh ghi "mục đích chung", chứa các giá trị dữ liệu có thể truy cập ngay lập tức để xử lý và nhiều lệnh ngôn ngữ máy tham chiếu đến các thanh ghi này.

## Program counter (PC)

- The CPU uses the PC to keep track of where it is in the program it is executing.
- The PC simply stores the memory address of the next instruction that the CPU should execute.
- At the beginning of each fetch-and-execute cycle, the CPU checks the PC to see which instruction it should fetch
- During the course of the fetch-and-execute cycle, the number in the PC is updated to indicate the instruction that is to be executed in the next cycle

## Binary numbers

- Machine language instructions are expressed as binary numbers
- Each zero or one is called a bit
- Each memory location holds a byte, which is a sequence of eight bits.
- Một máy tính có thể làm việc trực tiếp với các số nhị phân vì các công tắc có thể dễ dàng biểu diễn các số như vậy: Bật công tắc để biểu diễn số 1; tắt nó đi biểu thị số 0

## Summary: how computers work

1. Bộ nhớ chính chứa các chương trình và dữ liệu ngôn ngữ máy. Chúng được mã hóa dưới dạng số nhị phân. 
2. CPU lần lượt tìm nạp các lệnh ngôn ngữ máy từ bộ nhớ và thực thi chúng. 
3. Mỗi lệnh làm cho CPU thực hiện một số tác vụ rất nhỏ, chẳng hạn như thêm hai số hoặc di chuyển dữ liệu đến hoặc từ bộ nhớ. 
4. CPU thực hiện tất cả những điều này một cách máy móc, không cần suy nghĩ hoặc hiểu nó làm gì — và do đó chương trình mà nó thực thi phải hoàn hảo, hoàn chỉnh về mọi chi tiết và rõ ràng bởi vì CPU không thể làm gì khác ngoài việc thực thi nó chính xác như đã viết.

![Untitled](The%20Fetch%20and%20Execute%20Cycle%20Machine%20Language%20ca38eeb7136941b08104dd4d2a13f817/Untitled%201.png)