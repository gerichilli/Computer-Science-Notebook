# x = 5
# print(x)
# x = 7
# print(x)
# x = x + 1
# print(x)

# def countdown(n):
#     while n > 0:
#         print(n)
#         n = n - 1
#     print('Blastoff')

# countdown(5)

# while True:
#     line = input('> ')
#     if line == 'done':
#         break
#     print(line)

# fruit = 'banana'
# print(fruit[1:])
# print(fruit[:5])
# print(fruit[:])
# # fruit[0] = 'B' # 'str' object does not support item assignment
# print('B' + fruit[1:])


# def find(word, letter, starting = 0):
#     index = starting

#     while index < len(word):
#         if word[index] == letter:
#             return index
#         index += 1
    
#     return -1

# print(find('string', 'i', 0))
# print(find('string', 'i', 10))

# word = 'nhi thui xau xa'
# count = 0

# for letter in word:
#     if letter == 'x':
#         count += 1

# print(count)

# word = 'string in python'
# print(word.upper())
# print(word.find('n', 1, 10))
# print('i' in word)

def in_both(word1, word2):
    for letter in word1:
        if letter in word2:
            print(letter)

in_both('Yoo Ah In', 'Vu Thi Ha Mi')

print('Y' < 'banana') # True
print('y' < 'banana') # False

print("bib".find('b', 1, 2))