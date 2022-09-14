# Checking and returning if a is divisible by b
def is_divisible(a, b): 
    return a % b == 0

# Checking and returning if a is power of b
# Program assume that both arguments to is_power are positive integers 
def is_power(a, b):
    if a < 0 or b < 0:
        return

    # 1 is always a power of non-zero numbers (b^0 = 1)
    # and a number is a power of itself
    if a == 1 or a == b:
        return True

    # only positive integer that is a power of 1 is 1 itself.
    if a != 1 and b == 1:
        return False

    # Call is_divisible(a, b) function, check if a is divisible by b
    if not is_divisible(a, b):
        return False
    
    # Call is_power recursively
    return is_power(a / b, b)

    
print("is_power(10, 2) returns: ", is_power(10, 2)) # Output: is_power(10, 2) returns:  False
print("is_power(27, 3) returns: ", is_power(27, 3)) # Output: is_power(27, 3) returns:  True
print("is_power(1, 1) returns: ", is_power(1, 1)) # Output: is_power(1, 1) returns:  True
print("is_power(10, 1) returns: ", is_power(10, 1)) # Output: is_power(10, 1) returns:  False
print("is_power(3, 3) returns: ", is_power(3, 3)) # Output: is_power(3, 3) returns:  True
