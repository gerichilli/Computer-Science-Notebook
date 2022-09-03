key_delimiter = ':/ '
item_delimiter = ', '

# 1. Format each dictionary item as a text string in the input file
def text_to_dict(file_name):
    global key_delimiter
    global item_delimiter

    try:
        # Open file
        file = open(file_name, mode='r', encoding='utf-8')
        d = dict()
        
        for line in file:
            # Get a line in txt file with no white space
            words = line.strip()
            # Get key and list in string by split the word at key_delimiter letter
            key, list_string = words.split(key_delimiter)
            # Make list of nominees 
            list_of_values = list_string.strip('[]').split(item_delimiter)
            # Add key-value pair to the dict
            d[key] = list_of_values
        
        file.close()
        return d
    except:
        print('Something wrong with the input file')

# 2. Covert each input string into a dictionary item
def dict_to_text(d, file_name):
    global key_delimiter
    global item_delimiter

    try:
        # Open file in write mode
        file = open(file_name, mode="w", encoding='utf-8')
        for key, list_of_values in d.items():
            # Make list string
            list_string = '[' + item_delimiter.join(list_of_values) + ']'
            # Make a line in file
            line = key + key_delimiter + list_string + '\n'
            # Write line to file
            file.write(line)
    except: 
        print('Something wrong with the output file')

def invert_dict(d):
    inverse = dict()
    for key in d:
        val = d[key]
        for item in val:
            if item not in inverse:
                inverse[item] = [key]
            else:
                inverse[item].append(key)
    return inverse 

# Format each item of inverted dictionary as a text string in the output file
def dict_to_invert_output(input_file, output_file):
    try: 
        d = text_to_dict(input_file)
        invert_d = invert_dict(d)
        dict_to_text(invert_d, output_file)
    except:
        print('Something went wrong')


# Functions call
dict_to_invert_output('input.txt', 'output.txt')