import java.util.*;
public class adjacency{
    public static void main(String args[]) {

         // initializing two dimensional array 
        Integer[][] nodes = { 
             {0,1,0,1,0,1,0,1,0,1},
             {1,0,1,0,1,0,1,0,1,0}, 
             {0,1,0,1,0,1,0,1,0,1},
             {1,0,1,0,1,0,1,0,1,0},
             {0,1,0,1,0,1,0,1,0,1},
             {1,0,1,0,1,0,1,0,1,0},
             {0,1,0,1,0,1,0,1,0,1},
             {1,0,1,0,1,0,1,0,1,0},
             {0,1,0,1,0,1,0,1,0,1},
             {1,0,1,0,1,0,1,0,1,0},
        }; 
        for (int i=1; i<11; i++){
            for( int j =1; j<11; j++){
               
            }
            
        }
        Scanner vertices = new Scanner(System.in);
        System.out.println("Enter the two nodes you would want to compare: ");
        int i = vertices.nextInt();
        int j = vertices.nextInt();
        System.out.println("comparing " + i + " and " + j + "....");
        if (nodes[i][j]==1) {
            System.out.println("There is an edge between the nodes");
        } else {
            System.out.println("There is no edge between the nodes");
        }
    }


}