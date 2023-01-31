package Arrays;

import java.util.Arrays;

public class flliping_an_image {
    public static void main(String[] args) {
        int[][]image = {{1,1,0},{1,0,1},{0,0,0}};
        for(int i=0;i<image.length;i++){
         reverse(image[i]);
        invert(image[i]);
       
        System.out.println(Arrays.toString(image[i]));
        }
     }
     static void reverse(int[] image){
         int temp=0;
         int s=0;
         int e=image.length-1;
         while(s<e){
             temp=image[s];
             image[s]=image[e];
             image[e]=temp;
             s++;
             e--;
         }
     }
         static void invert(int[] image){
             for(int i=0;i<image.length;i++){
                 if(image[i]==1){
                     image[i]=0;
                 }
                 else{
                     image[i]=1;
                 }
             }
    }
}
