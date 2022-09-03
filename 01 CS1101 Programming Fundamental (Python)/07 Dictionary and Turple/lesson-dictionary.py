# DICTIONARY
## 1. A dictionary is mapping
# eng2jp = dict()
# # print(eng2jp) #{}
# eng2jp['one'] = 'ichi'
# # print(eng2jp) #{'one': 'ichi'}
# eng2jp = {'one': 'ichi', 'two': 'ni', 'three': 'san'}
# vals = eng2jp.values()

# print(vals) #dict_values(['ichi', 'ni', 'san'])
# print('san' in vals) #True
# print(eng2jp['two']) #ni
# print(len(eng2jp)) #3
# print('four' in eng2jp) #False

# 2. Dictionary as a collection of counters
# def histogram(s):
#     d = dict()
#     for c in s:
#         if c not in d:
#             d[c] = 1
#         else:
#             d[c] += 1
#     return d

# print(histogram('empty-dictionary'))
# # {'e': 1, 'm': 1, 'p': 1, 't': 2, 'y': 2, '-': 1, 'd': 1, 'i': 2, 'c': 1, 'o': 1, 'n': 1, 'a': 
# # 1, 'r': 1}
# h = histogram('empty')
# print(h.get('a', 10)) #10
# print(h.get('t', 10)) #1

# def histogram_rewrite(s):
#     d = dict()
#     for c in s:
#         d[c] = d.get(c, 0) + 1
#     return d

# h = histogram_rewrite('dictionary')

# # 3. Looping and dictionaries
# # for c in h:
# #     print(c, h[c])

# for key in sorted(h):
#     print(key, h[key])

# 4. Reverse lookup
# def reverse_lookup(dic, val):
#     for k in dic:
#         if dic[k] == val:
#             return k
#     raise LookupError('Value does not appear in the dictionary')

# reverse_lookup(h, 'e')

# 5. Dictionaries and lists
# def invert_dict(d):
#     inverse = dict()
#     for key in d: 
#         val = d[key]
#         if val not in inverse:
#             inverse[val] = [key]
#         else:
#             inverse[val].append(key)
#     print(inverse)
#     return inverse

# invert_dict(h) #{1: ['d', 'c', 't', 'o', 'n', 'a', 'r', 'y'], 2: ['i']}

# 7. Global variables
been_called = False

# def example():
#     been_called = True
#     print('Inside function', been_called)
# example()
# print('Global', been_called)

def example():
    global been_called
    been_called = True
    print('Inside function', been_called)
example()
print('Global', been_called)