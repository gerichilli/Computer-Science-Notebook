# 3. Traversing a list
# new_list = ['dog', 'cat', 'mouse']

# for animal in new_list:
#     animal = 'chicken'

# print(new_list) #['dog', 'cat', 'mouse']

# for i in range(len(new_list)):
#     new_list[i] = 'chicken'

# print(new_list) #['chicken', 'chicken', 'chicken']

# -----------------------------------------------------------
# 4. List operationsList operations
# a = [1, 2, 3]
# b = [4, 5, 6]
# a[: 2] = [7, 8]
# c = a + b
# d = a * 3
# print(c) # [7, 8, 3, 4, 5, 6]
# print(d) # [7, 8, 3, 7, 8, 3, 7, 8, 3]

# # -----------------------------------------------------------
# # 6. List methods
# list_methods_ex = [2, 3, 4]
# list_methods_ex.append(5)
# print(list_methods_ex) #[2, 3, 4, 5]
# list_methods_ex.extend([0, 1, 2, 7])
# print(list_methods_ex) #[2, 3, 4, 5, 0, 1, 2, 7]
# list_methods_ex.sort()
# print(list_methods_ex) #[0, 1, 2, 2, 3, 4, 5, 7]

# -----------------------------------------------------------
# 10. Objects and values
a = [1, 2, 3]
b = [1, 2, 3]
print(a is b)