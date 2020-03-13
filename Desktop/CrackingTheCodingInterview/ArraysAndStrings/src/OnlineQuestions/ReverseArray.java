package OnlineQuestions;

public class ReverseArray {

   public int[] reverse(int a[], int n){
       int[] newArray = new int[n];
       int j = n-1;
        for(int i = 0; i<n; i++){
           newArray[j-i] = a[i];
        }
        return newArray;
   }
}
