class Main{
  public static void main (String[] args)
  {
     int arr[] = {1,5,6,8,18,20};
    
     int countEven = 0, countOdd = 0;

     for(int i=0; i<arr.length; i++){
         if((arr[i] % 2 )== 0)
           countEven += 1;

         else
           countOdd += 1;
     }
     System.out.println("Even Elements count : "+ countEven);
     System.out.println("Odd Elements count : "+ countOdd);
  }
}