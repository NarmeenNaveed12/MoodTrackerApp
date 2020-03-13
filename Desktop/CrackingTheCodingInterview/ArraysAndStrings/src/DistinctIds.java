
//distinct elements after removing m items
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DistinctIds
{
    // Function to find distintc id's
    static int distinctIds(int arr[], int n, int mi)

    {
        System.out.println("maps" + mi);


        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        int count = 0;
        int size = 0;

        // Store the occurrence of ids
        for (int i = 0; i < n; i++)
        {

            // If the key is not add it to map
            if (m.containsKey(arr[i]) == false)
            {
                m.put(arr[i], 1);
                size++;
            }

            // If it is present then increase the value by 1
            else m.put(arr[i], m.get(arr[i]) + 1);
        }

        // Start removing elements from the beginning
        for (Entry<Integer, Integer> mp:m.entrySet())
        {
            System.out.println("map" + mp.getKey() + " " + mp.getValue());
            // Remove if current value is less than
            // or equal to mi
            if (mp.getKey() <= mi)
            {
                System.out.println("remaning" + mp.getKey() + " " + mi);
                mi -= mp.getKey();
                System.out.println("remaning after" + mp.getKey() + " " + mi);
                count++;

            }
            // Return the remaining size
            else {
                return size - count;
            }
        }
        return size - count;
    }

    //Driver method to test above function
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        int arr[] = {2, 3,2, 3, 3,3,4,4,4};
        int m = 4;

        System.out.println(distinctIds(arr, arr.length, m));
    }
}