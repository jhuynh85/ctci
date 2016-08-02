import java.util.*;

class test {
    public static void main(String[] args){
        System.out.println(compress(args[0]));

        return;
    }
    
    // 1.1 Determine if a string contains only unique characters
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
    
    // 1.3 Determine if two strings are permutations of each other   
    public static boolean permutation (String str1, String str2){
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        System.out.println(arr1);
        System.out.println(arr2);
        
        return (Arrays.equals(arr1,arr2));
    }
	
	// 1.5 Method to perform basic string compression using the counts of repeated characters
	public static String compress (String str){
		String newStr = "";
		int repeats = 1;
		char prev='\0';
		
		for (int i=0; i<str.length(); i++){
			if (str.charAt(i)==prev){
				prev=str.charAt(i);
				repeats++;
				continue;
			}
			
			if (repeats==1){
				prev=str.charAt(i);
				newStr+=str.charAt(i);
				continue;
			}
			
			prev = str.charAt(i);
			newStr+=repeats;
			newStr+=str.charAt(i);
			repeats=1;
		}
		
		if (repeats != 1) newStr+=repeats;
		
		return (newStr.length()<str.length()?newStr:str);
	}
}
