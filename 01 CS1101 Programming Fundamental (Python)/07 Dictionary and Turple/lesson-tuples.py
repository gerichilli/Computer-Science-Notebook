# # 1. Tuples are immutable
# t_1 = 'a', 'b', 'c'
# # or
# t_2 = ('a', 'b', 'c')
# # tuples with single element
# t_single = 'a', #must have a comma
# t = tuple('lupin')
# print(t) #('l', 'u', 'p', 'i', 'n')
# print(t[1]) # u

# # Make t refer to new tuple (can't mutate it)
# t = ('L',) + t[1:]
# print(t) #('L', 'u', 'p', 'i', 'n')

# # Comparision
# print((0, 1, 200) < (0, 2, 1)) #True

# ## 2. Tuple assignment
# addr = 'mi@gmail.com'
# name, domain = addr.split('@')
# print(name, domain) #mi gmail.com

# 3. Tuples as return values
# t = divmod(8, 3)
# print(t) #(2, 2)

# quot, rem = divmod(8, 3)
# print(quot, rem) #2 2

# # 4. Variable-length argument tuples 
# # GATHER
# def printall(*arg):
#     print(arg)

# printall(1, 2, 3) #(1, 2, 3) : A tuples

# SCATTER
# print(divmod((8, 3))) #TypeError: divmod expected 2 arguments, got 1
# print(divmod(*(8, 3))) #(2, 2)

# def sumall(*arg):
#     result = 0
#     for num in arg:
#         result += num
#     print(result)

# sumall(4,4,3,5,5,7,4,5)

# 5. Lists and tuples

# s = 'abc'
# s1 = 'ab'
# t = [0, 1, 2]

# for pair in zip(s, t):
#     print(pair)

# ('a', 0)
# ('b', 1)
# ('c', 2)

# zip_list = list(zip(s, t))
# print(zip_list) # [('a', 0), ('b', 1), ('c', 2)]

# zip_1 = zip(s1, t)
# print(list(zip_1)) #[('a', 0), ('b', 1)]

# for letter, number in zip_list:
#     print(letter, number)

# def has_match(t1, t2):
#     for x, y in zip(t1, t2):
#         if x == y:
#             return True
#     return False

# print(has_match((0, 1, 2), ('a', 0, 2)))

# for index, element in enumerate(('a', 'b'), start=1):
#     print(index, element)

# a = [1, 2, 3]
# b = ['a', 'b', 'c']
# c = ['d', 'e', 'f']

# for count, (x, y, z) in enumerate(zip(a, b, c)):
#     print(count, x, y, z)

# 0 1 a d
# 1 2 b e
# 2 3 c f

# 6. Dictionaries and tuples

# d = {'a': 0, 'b': 1, 'c': 2}
# t = d.items()
# #print(t) #dict_items([('a', 0), ('b', 1), ('c', 2)])
# for key, value in t:
#     print(key, value)

# list of tuples to dictionary
# t = [('a', 0), ('b', 1), ('c', 2)]
# d = dict(t)
# print(d)

# d2 = dict(zip('abc', range(3)))
# print(d2)

# tuple as key of directory
sdt = {
    ('nhi', 'thui'): '01224221224',
    ('nhi', 'ngoc'): '01224221224a',
    ('nhi', 'ngu'): '01224221224',
    ('nhi', 'vit bau'): '01224221224'
}

print(sdt['nhi', 'ngoc'])