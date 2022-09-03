def time_to_meet(s, v1, v2): 
    v = v1 + v2
    t = s / v
    return t

print(time_to_meet(2, 1, 1)) # OUTPUT: 1.0
print(time_to_meet(4, 2, 3)) # OUTPUT: 0.8
print(time_to_meet(10, 3, 1)) # OUTPUT: 2.5