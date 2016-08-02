import java.util.*;

class test {
    public static void main(String[] args){
        System.out.println(permutation(args[0],args[1]));

        return;
    }
    
    // Determine if a string contains only unique characters
    public static boolean unique (String str) {
        boolean[] charArr = new boolean[256];
        
        if (str.length() > 256) return false;
        
        for (int i=0; i<str.length(); i++){
            int c = str.charAt(i);
            if (charArr[c]) return false;
            charArr[c] = true;
        }
        
        return true;
    }
    
    // Determine if two strings are permutations of each other   
    public static boolean permutation (String str1, String str2){
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        System.out.println(arr1);
        System.out.println(arr2);
        
        return (Arrays.equals(arr1,arr2));
    }
}
