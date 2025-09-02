public class Od{
    public static void main (String [] args){
        int [] arr = {1,2,3,4,5,6,7,8};
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
        System.out.printf("sum even: %d \n",sumEven);
        System.out.printf("sum odd:%d",sumOdd);
    }
}