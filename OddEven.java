public class OddEven {
    public static void main (String [] args){
        int [] arr = {2,4,5,6,7,8,9,10,11};
        int sumOdd=0;
        int sumEven=0;
        int l=arr.length;
        for(int i=0;i<l;i++){
            if(arr[i]%2==0){
                sumEven+=arr[i];
            }else{
             sumOdd+=arr[i];
            }
        }
        System.out.printf("sum of even no.s in array: %d \n",sumEven);
        System.out.printf("sum of odd no.s in array: %d",sumOdd);
    }
}
