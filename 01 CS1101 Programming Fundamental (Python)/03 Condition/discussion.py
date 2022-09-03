# The difference between a chained conditional and a nested conditional is: nested 
# Does not like chained conditional, a nested conditional has a conditional statement appearing in one of the branches of another conditional.
# In other words, in a nested conditional, an if statement appears in a branch of another if statement

# Example
def purchase_nested(balance, price):
    # Purchase if item price < 500 and balance >= item price
    if price >= 500:
        print('No, I don\'t buy it');
    else: 
        if balance >= price: 
            print('I buy it')
        else:
            print('No, I don\'t have enough money')

def purchase(balance, price):
    # Purchase if item price < 500 and balance >= item price
    if price >= 500:
        print('No, I don\'t buy it');
    elif price < 500 and balance >= price:
        print('I buy it')
    else:
        print('No, I don\'t have enough money')

# Function calls
purchase_nested(1000, 500); #Output: No, I don't buy it
purchase_nested(400, 450); #Output: No, I don't have enough money
purchase_nested(1000, 300); #Output: I buy it

purchase(1000, 500); #Output: No, I don't buy it
purchase(400, 450); #Output: No, I don't have enough money
purchase(1000, 300); #Output: I buy it

# Example of Deeply nested conditionals
def savings_interest_rate_nested(customer_type, total):
    # Calculating the bank's savings interest rate for customers based on customer type and savings deposits
    # customer_type: normal: 0 - VIP: 1
    # total: savings deposits
    interest_rate = 0
    
    if total <= 0:
        print('Deposit amount must be greater than 0')
        return
    else:
        if customer_type == 1: 
            if total >= 1000:
                interest_rate = 8
            else:
                interest_rate = 7

        elif customer_type == 0: 
            if total >= 1000:
                interest_rate = 6
            else:
                interest_rate = 5
        else:
            print('There is an error, please check')
            return

    print(interest_rate)


# Avoid: using and

def savings_interest_rate(customer_type, total):
    # Calculating the bank's savings interest rate for customers based on customer type and savings deposits
    # customer_type: normal: 0 - VIP: 1
    # total: savings deposits
    interest_rate = 0

    if total <= 0:
        print('Deposit amount must be greater than 0')
        return
    elif customer_type == 1 and total >= 1000:
        interest_rate = 8
    elif customer_type == 1 and total < 1000:
        interest_rate = 7
    elif customer_type == 0 and total >= 1000:
        interest_rate = 6
    elif customer_type == 0 and total < 1000:
        interest_rate = 5
    else:
        print('There is an error, please check')
        return

    print(interest_rate)

# Function calls
savings_interest_rate_nested(1, 1000) #Output: 8
savings_interest_rate_nested(1, 300) #Output: 7
savings_interest_rate_nested(0, 1000) #Output: 6
savings_interest_rate_nested(0, 300) #Output: 5
savings_interest_rate_nested(0, 0) #Output: Deposit amount must be greater than 0
savings_interest_rate_nested(2, 10) #Output: There is an error, please check

savings_interest_rate(1, 1000) #Output: 8
savings_interest_rate(1, 300) #Output: 7
savings_interest_rate(0, 1000) #Output: 6
savings_interest_rate(0, 300) #Output: 5
savings_interest_rate(0, 0) #Output: Deposit amount must be greater than 0
savings_interest_rate(2, 10) #Output: There is an error, please check

