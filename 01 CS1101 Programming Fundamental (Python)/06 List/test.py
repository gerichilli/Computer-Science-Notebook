def fstreet(unity): ## parameter.
    t = [ 'us', 'we', 'family' , 'strength', 'together'] ##variable reference to an object.
    a = t ##aliased
    if a == t: ### argument while a list equal to t list.
        t.append('forever') ##add the string 'forever' to the list
        del t [0] ##delete the 0th value in the object that reference to t
        t.sort() ## sort the list by alphabetical order
        print (t) ## display the list.

fstreet('Amanda Anspach')