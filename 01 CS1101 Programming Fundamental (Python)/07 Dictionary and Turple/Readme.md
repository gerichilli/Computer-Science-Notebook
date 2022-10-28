# DICTIONARIES

## 1. A Dictionary is a mapping
- Contains collection of indices (keys) + collection of values
- key-value pair / item
- Dictionary represents a mapping from keys to values = each key "maps to" the value
- {}: Empty dictionary
- Add item: dictionary[key] = value or use direct dictionary = {key: value}
- The order of the key-value pairs in a dictionary is unpredictable
- len(dictionary) => return number of key-value pairs
- in operator: check for key
- values method => return collect

## 2. Dictionary as a collection of counters
- get method dictionary.get(key, default value) 
- if key in the dictionary, get return value, else return default value

## 3. Looping and dictionaries
- for statement => traverse the keys
- sort keys => sorted(dictionary)

## 4. Reverse lookup
- lookup: give key find value
- reverse lookup: give value find key/keys
- raise LookupError()

## 5. Dictionaries and lists
- key have to be hashtable
- hash: function that takes a value and returns an integer
- keys are immutable
- lists cant't be keys

## 6. Memos
- Prevously computed value that is stored for later use is called a memo
- Make function call run faster

## 7. Global variables
- global: special frame __main__ 
- global statement: determine that the variable inside function is global
- UnboundLocalError: not assign variable by global statement before using it

## 8. Debugging
- Scale down the input: reduce the size of the dataset
- Check summaries and types: printing summaries of the data
- Write self-checks: write code to check for the errors automatically
    + Sanity check: detect result that are "insane"
    + Consistency check: compares results of two different computations => if they are consistent
- Format the output: pprint

## 9. Glossary
- mapping: relationship each element of 1 set vs another set
- dictionary: mapping from keys to corresponding values
- key-value pair
- item
- key
- value
- implementation
- hashtable
- hash function
- lookup
- reverse lookup
- raise statetmend: raises an exception
- singleton: a list with a single element
- call graph
- memo: computed value stored to avoid unnecessary future computation
- global variable
- global statement
- flag: boolean variable used to indcate whether a condition is true
- declaration

## ---------------------------------------------------- ##

## TUPLES
## 1. Tuples are immutable
- A sequence of values
- A comma-separated list of values
- Create a tuple
    + t = 'a',
    + t = tuple('lupin') => tuple with the elements of the sequence
- Access element t[index]
- Slice t[start:end] (Simalar with list)
- But immutable
- Relational operators: start by comparing first element then next element and so on
## 2. Tuple assignment
- Swap the values: a, b = b, a

## 3. Tuples as return values
- If the return value is a tuple => effect is same as returning multiple values

## 4. Variable-length argument tuples (Bộ giá trị đối số có độ dài thay đổi)
- A parameter name that begins with * gathers arguments into a tuple
- Gather: using *
- Scatter: using *

## 5. Lists and tuples
- zip
    + built-in function
    + take 2 or more sequences => return a list of tuples, each tuple contains one element from each sequence
    + zip object is kind of line iterator
    + similar to list but we can't use index to select an element from iterator
    + if want to use list operator => make a list by list(zip(....))
    + if the sequences are not the same length, the result is shorter
    ** => Combine zip, for and tuple assignment => traversing two or more sequences at the same time **
- enumerate
    + traverse the elements of a sequence and their indices (index + value)

## 6. Dictionaries and tuples
- items
    + method of dictionaries
    + return a sequence of tuples, each tuples is a key-value pair

## 7. Sequences of sequences
- Different kinds of sequences
    + string
    + list
    + tuple
- Strings are more limited than other sequences
- Lists are mutable
- Cases where we might prefer tuples
    + return statement
    + use a sequence as a dictionary key
    + passing as an argument to a function => using tuples reduces the potential for unexpected behavior due to aliasing
- sorted => take any sequence and return a new list with same elements in sorted order

## 8. Debugging
- Shape errors: errors caused when a data structure as the wrong type, size, or structure
- structshape https://github.com/AllenDowney/ThinkPython2/blob/master/code/structshape.py

## 9. Glossary
- tuple
- tuple assignment
- gather
- scatter 
- zip object
- iterator
- data structure
- shape error