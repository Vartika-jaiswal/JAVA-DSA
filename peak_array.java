 class peak_array{
    public static void main(String []args){
       int arr[] = {1,2,5,4,10,9,8,7,6};
       int n = arr.length, peak = 0;
       if(n == 1)
       {
           System.out.print(arr[0]);
           System.exit(0);
       }
      for(int i = 0; i<n; i++)
      {
          if(i==0)
           {   if(arr[i+1] > arr[i])
                   peak = arr[i+1];

           }
          else if(i == n-1)
           {   if(arr[i-1] < arr[i])
                   peak = arr[i];

           }
          else
           {    if(arr[i-1] < arr[i] && arr[i+1] < arr[i])
                   peak = arr[i];

           }
      }
       System.out.println(peak);
    }
} 