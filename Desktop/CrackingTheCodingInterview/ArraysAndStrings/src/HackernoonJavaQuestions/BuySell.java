package HackernoonJavaQuestions;

public class BuySell {

    public void buySell(int[] arr){
        int lowestprice = arr[0];
        int maxPrice = Integer.MIN_VALUE;
        int buy = 0;
        int sell = 0;
        for(int i = 0;i< arr.length; i++) {
            int profit = 0;
            if (arr[i] > lowestprice) {
                profit = arr[i] - lowestprice;
                buy = lowestprice;
                sell = arr[i];

            if (profit > maxPrice) {
                maxPrice = profit;
            }
        }
        else{
            lowestprice = arr[i];
        }

        }
        System.out.println(maxPrice);
        System.out.println(buy);
        System.out.println(sell);

    }
//        int tempSum = arr[1] - arr[0];
//        int buy = 0;
//        int sell = 0;
//        for(int i = 0;i< arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                int sum = arr[j] - arr[i];
//                if (sum > tempSum && arr[j] > arr[i]) {
//                    tempSum = sum;
//                    buy = arr[j];
//                    sell = arr[i];
//                }
//            }
//        }
//        System.out.println(tempSum);
//        System.out.println(buy);
//        System.out.println(sell);
//
//    }


}
