def check_fermat(a,b,c,n):
    if n > 2:
        print('Holy smokes, Fermat was wrong!')
    else:
        print('No, that doesn’t work')

def check_fermat_input():
    a = int(input('a = \n'))
    b = int(input('b = \n'))
    c = int(input('c = \n'))
    n = int(input('n = \n'))
    check_fermat(a,b,c,n)

check_fermat_input()