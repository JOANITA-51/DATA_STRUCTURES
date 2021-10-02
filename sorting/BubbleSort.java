
public class BubbleSort {

    public void Sort(Song[] array){ 
        for(var i=0 ;i<=array.length;i++ ){  // looping through the songs array
            for(var j=1;j<array.length-i; j++){  // Check each song at a certain position
                if(array[j].getViews() < array[j-1].getViews()){ // Check songs using their views
                    swap(array ,j , j-1); //Swap the songs if the views in a certain positionare less than views in some other position
                }
            }
        }
    }
    private  void  swap(Song[] array , int indexOne , int indexTwo ){
        var temp = array[indexOne];
        array[indexOne] =  array[indexTwo];
        array[indexTwo] = temp;

    }
}
