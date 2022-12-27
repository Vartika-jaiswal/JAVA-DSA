package Arrays.Linear_search;

import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String name="kunal";
        char target='u';
        System.out.println(stringsearch(name,target));
        System.out.println(Arrays.toString(name.toCharArray()));
        
    }
    static boolean stringsearch(String str,char target){
         if(str.length()==0){
            return false;
         }
         for(int i=0;i<str.length();i++){
            if(target==str.charAt(i)){
                 return true;
            }
         }
         return false;
    }
    // using for each loop
    static boolean stringsearch2(String str,char target){
        if(str.length()==0){
           return false;
        }
        for(char ch:str.toCharArray()){
           if(target==ch){
                return true;
           }
        }
        return false;
   }
}
