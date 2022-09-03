# Read the file
fin = open('words.txt')

# # realine method: read intil it gets to a newline
# first_word = fin.readline()
# print(first_word) # aa

# # File object keeps track of where it is in the file
# # Get next word by
# next_word = fin.readline()
# print(next_word) #aah

# strip method
line = fin.readline();
print(line.strip())
line = fin.readline();
print(line.strip())
line = fin.readline();
print(line.strip())

# aa
# aah
# aahed

# for line in fin:
#     word = line.strip()
#     print(word)