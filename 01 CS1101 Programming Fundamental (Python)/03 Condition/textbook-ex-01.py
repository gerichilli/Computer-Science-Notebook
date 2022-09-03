import time

def convert_time():
    current_time = time.time()
    print('current time: ' + str(current_time))
    # Find days = floating point of total sec / (sec in a day = 24hour * 60 min * 60sec)
    days_number = current_time // (24 * 60 * 60)

    # Find hours = remainder of days number
    remainder_secs = current_time % (24 * 60 * 60)
    hours = remainder_secs // (60 * 60)
    mins = (remainder_secs % (60 * 60)) // 60
    secs = int(remainder_secs % (60 * 60) - mins * 60)

    print("Now it's is \n" + str(days_number) + '\n' + str(hours) + '\n' + str(mins) + '\n' + str(secs))

convert_time()
