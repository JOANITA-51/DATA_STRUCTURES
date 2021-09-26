//Program for computing the sum of the first 1,000,000,000 numbers and how long the program takes to compute each result.

public class MyClass {
    public static void main(String args[]) {
        
      long start = System.currentTimeMillis();// calculating the starting time
      
      int N=1000; // declaring a variable N and assigning the first N numbers to be added
      
      int sum =0; // declaring variable sum and initialising it to 0
      
      for (int i = 0; i<=N; i++){ //iterating through each number
      
        sum = sum + i; // Calculating the sum for each number i.e new sum= old sum + the number
        
        long end = System.currentTimeMillis(); // calculating the ending time
        
        double total = (end - start); //Difference to get the total time of each number
        
        double seconds= total/1000;//converting to seconds from milliseconds
        
        System.out.println(i + "   "+ sum +"   " + seconds); //displaying the number , sum and seconds

      }

        

    }
}
