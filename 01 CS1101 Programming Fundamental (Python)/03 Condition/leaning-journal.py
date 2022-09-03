def countdown(n):
    #Counting down from n while n > 0
    if n <= 0:
        print('Blastoff!')
    else:
        print(n)
        countdown(n-1)

def countup(n):
    #Counting up from n while n < 0
    if n >= 0:
        print('Blastoff!')
    else:
        print(n)
        countup(n+1)

def start_counting():
    # Get a number from keyboard input 
    n = input('Please input a number \n')

    # Convert n to interger number
    n_int = int(n)
    
    if(n_int >= 0):
        countdown(n_int)
    else:
        countup(n_int)

# Call function
# start_counting();

# Keyboard Input: 4
# Output: 
# 4
# 3
# 2
# 1
# Blastoff!

# Keyboard Input: -4
# Output:
# -4
# -3
# -2
# -1
# Blastoff!

# Keyboard Input: 0
# Output:
# Blastoff!

# I chosen countdown function to call for input of zero.
# When n = 0, the conditional statement of the branch with the condition if >= 0 will be executed. countdown function will be called with the argument 0. In the countdown function, condition n <= 0 is satisfied, and print('Blastoff!') is executed, we have the output: Blastoff!. 
# However, we can also achieve the same output using countup function

#---------------------------------------------

# 2. Write your own unique Python program that has a runtime error. Provide the following.

# The code of your program.
# Output demonstrating the runtime error, including the error message.
# An explanation of the error message.
# An explanation of how to fix the error.

def racing():
    # Get keyboard inputs of the distance of two people who are racing 
    # and prints the percentage of distance the first ran compared to the distance the second ran

    a_distance = float(input('Please enter the first distance\n'))
    b_distance = float(input('Please enter the second distance\n'))

    percentage = (a_distance / b_distance) * 100
    print('Distance percentage is ' + str(percentage) +'%')

# racing();

# For example, when the first ran 10km, the second had a numb leg so he could't run, his distance was 0
# Runtime error accure when I input 10 for the first and 0 for the second

# racing(10, 0) 

# Please enter the first distance
# 10
# Please enter the second distance
# 0
# Traceback (most recent call last):
#   File "d:\Study\CS1101\03 Condition\leaning-journal.py", line 75, in <module>
#     racing();
#   File "d:\Study\CS1101\03 Condition\leaning-journal.py", line 72, in racing
#     percentage = (a_distance / b_distance) * 100
# ZeroDivisionError: float division by zero

# The line 
# percentage = (a_distance / b_distance) * 100 
# has an error ZeroDivisionError: division by zero because we cannot divide a number by zero

# To fix this, we will check the distance of the second person to see if it is zero or not. 
# If it is zero, we don't do the operation and print a warning message, then ask users if they want to re-enter again
# If they say yes (y) call racing function again

def racing_fixed():
    # Get keyboard inputs of the distance of two people who are racing 
    # and prints the percentage of distance the first ran compared to the distance the second ran

    a_distance = float(input('Please enter the first distance\n'))
    b_distance = float(input('Please enter the second distance\n'))

    if b_distance != 0: 
        percentage = (a_distance / b_distance) * 100
        print('Distance percentage is ' + str(percentage) +'%')
    
    else:
        print('Sorry, we can\'t compute the percentage because the distance of the 2nd person is 0')
        re_enter = input('Is this a mistake? Do want to re-enter the distance?\n') # enter y for yes and n for no

        if(re_enter == 'y'):
            racing_fixed()

racing_fixed();

# When I input 10 for the first and 0 for the second. There are no error
# Please enter the first distance
# 10
# Please enter the second distance
# 0
# Sorry, we can't compute the percentage because the distance of the 2nd person is 0
# Is this a mistake? Do want to re-enter the distance?
# n