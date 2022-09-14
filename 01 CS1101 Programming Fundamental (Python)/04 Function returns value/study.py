import math

# def abs_value(x):
#     if x < 0: 
#         return -x
#     else:
#         return x

# print(abs_value(-2))

# def area(radius):
#     a = math.pi * radius**2
#     return a

# def distance(x1, y1, x2, y2): 
#     dx = x2 - x1
#     dy = y2 - y1
#     dsquared = dx**2 + dy**2
#     result = math.sqrt(dsquared)
#     return result

# def circle_area(dx1, dy1, dx2, dy2):
#     return area(distance(dx1, dy1, dx2, dy2));

# print(circle_area(2, 5, 4, 8))

# def is_between(x,y,z):
#     return x <= y <=z

# print(is_between(4,5,6))
# print(is_between(4,5,2))

# def factorial(n):
#     if not isinstance(n, int):
#         print('Only defined for integers')
#         return None
#     elif n < 0:
#         print('Not defined for negative intergers')
#         return None
#     elif n == 0:
#         return 1
#     else:
#         save = factorial(n - 1)
#         result = n * save
#         return result

# print(factorial(5))

n = 3.51
print(int(n))