# FILES

## 1. Persistence
- Run for a long time (or all the time)
- Keep some data in permanent storage


## 2. Reading and writing
- open(filename, w mode)
- w mode:
    + Truncate file to zero length or create text file for writing.
    + The stream is positioned at the beginning of the file.
- Reading: open(...)
- Writing: file.write(...)
- When you are done writing => close the file by close method
    + If you don't close it get closed for you when the program ends

## 3. Format operator
- argument of write method must be a string => use str(value)
- % operator:
    + intergers -> modulus operator
    + if first operand is a string => format operator
    + %d: decimal integer
    + %g: floating point number
    + %s: string
    + if there is more than 1 format sequence in the string, the second argument has to be a tuple

## 4. Filenames and paths
- os: operation system
- cwd: current working directory
- syntax: os.getcwd()
- path: Ex: /home/dinsdale/memo.txt
- absolute path: os.path.abspath(filename)
- check file exist: os.path.exists(filename)
- check if it is a directory: os.path.isdir(para)
- check if it is a file: os.path.isfile(para)
- get list of files and directories in the given directory: os.listdir(cwd)
- take a directory + file name =>  complete path: os.path.join(dir, filename)

## 5. Catching exceptions
- IOError: try to open a file that doesn't exist
- PermissionError: don't have permission to access the file
- IsADirectoryError: try to open directory for reading
- try:... except:... statement (similar to try catch of JS)

## 6. Databases
- File that is organized for storing data
- Many database are organize like a dictionary
- dbm module: provides an interface for creating and updating database files
- open database: dbm.open(database-name , mode)

## 7. Pickling
- pickle.dumps() take object as a parameter and returns a string representation (dumps is short for "dumb string")
- pickle.loads() get object
- pickling and unpickling = copying the object

## 8. Pipes
- pipe object

## 9. Writing modules
- Any file that contain Python code can be imported as a module
- '__name__' built in variable that is set when the program starts
- If the program is running as a script '__name__' has a value '__main__'
- If you import a module that has already been imported, Python does nothing

## 10. Debugging
- repr: take object as an argument => return a string reprentation of object. Represent whitespace characters with \

## 11. Glossary
- persistent: program runs indefinitely, keep some data in permanent storage
- format operator %
- format string
- format sequence
- text file
- directory
- path
- relative path: start from current directory
- absolute path: start from topmost directory
- catch
- database
- bytes object
- shell
- pipe object

