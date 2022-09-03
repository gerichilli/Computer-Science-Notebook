import math

# 6.2
# def ackermann(m, n):
#     #n, m: non-negative integers
#     if m < 0 or n < 0 or not isinstance(m, int) or not isinstance(n, int):
#         print('m and n is non-negative intergers')
#         return
#     if m == 0:
#         return n + 1
#     if n == 0 and m > 0:
#         return ackermann(m - 1, 1)
#     else:
#         return ackermann(m - 1, ackermann(m, n - 1))

# print(ackermann(3,4))

# 6.3
def first(word):
    return word[0]

def last(word):
    return word[-1]

def middle(word):
    return word[1 : -1]

middle('la')

def is_palindrome(word):
    """Returns True if word is a palindrome."""
    if len(word) <= 1:
        return True
    if first(word) != last(word):
        return False
    return is_palindrome(middle(word))

print(is_palindrome('allen'))
print(is_palindrome('bob'))
print(is_palindrome('otto'))
print(is_palindrome('redivider'))