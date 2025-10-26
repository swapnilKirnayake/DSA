public class LargestElement{

public static void main(String[] args){

    int[] arr = {1, 3, 5, 2, 4};
    int max = arr[0];//temporary storage max

    for(int i=0;i<arr.length;i++){

       if( arr[i]>max){
        max = arr[i];
       }    
    }

System.out.println("Largest Element is : "+max);




}

}