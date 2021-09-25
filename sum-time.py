#Declaring variables for the first N numbers and the sum   
N = 1000000000
sum = 0 #initialising the sum
# Adding a header to the table
print("{:<4}{:<8}{:<8}".format('N','Sum','Running Time')) 
# loop from 0 to N
for num in range(0, N , 1):
    sum = sum + num
     # end = '' avoids printing on a new line
    print(num , '   ', end = '' ) # displays the current number
    print(sum, '      ', end = '') # displays the sum of the current number and the numbers before it
    print(num+1) # displays the running time 
print("Sum of first ", N, "numbers is: ", sum)   
print("It takes N times to run hence time complexity O(N)")
