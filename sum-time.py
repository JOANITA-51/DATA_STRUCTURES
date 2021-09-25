#Declaring variables for the first N numbers and the sum   
N = 1000000000
sum = 0 #initialising the sum
# Adding a header to the table
print("{:<4}{:<8}{:<8}".format('N','Sum','Running Time')) 
# loop from 0 to N taking a step of 1. Display the current number, sum and the Running time
for num in range(0, N , 1):
    sum = sum + num # Calculation the sum . i.e new sum = old sum + current number
    # end = '' avoids printing on a new line
    print(num , '   ', end = '' ) # displays the current number
    print(sum, '      ', end = '') # displays the new sum 
    print(num+1) # displays the running time 
print("Sum of first ", N, "numbers is: ", sum)   
print("It takes N times to run hence time complexity O(N)")
