package here.code;


public class Vowels {
	
	public static int numberOfVowelsInArray(char[] array){
		char[] vowels = {'a', 'e', 'i', 'o', 'u'};
		int count = 0;
		for(int i = 0; i < array.length; i++){
			for(char vowel : vowels){
	            if(array[i] == vowel){
	                count ++;
	            }
	        }
	    }
		return count;
	}
    
    public static Integer maxElement(Integer[] arr){
        int max = arr[0]; 
         
         for(int i = 1; i < arr.length; i++){
             if (arr[i] > max) {
                 max = arr[i]; 
            }
        }
         return max; 
    }
	
	 public static int maxVowels(String s, int k) {
         Integer result = null;
		 if(s != null) {
			 
			 Integer sLength = s.length();
			 char[] string = s.toCharArray();
			 char[] subString = new char[k];
			 Integer[] sizeArray = new Integer[(sLength - k + 1)];
			 
			 if( (sLength >= 1 && sLength <= 100000) && (k >= 1 && k <= sLength) ) {
				 
				 for(int i = 0; i <= sLength - k; i++) {
					 
                     for(int j = 0; j < k; j++){
                         subString[j] = string[i+j];
                     }
					 sizeArray[i] = numberOfVowelsInArray(subString);
					 
				 }
				 result = maxElement(sizeArray);
			 }
			 
		 }else {
			 System.out.println("s can't be null");
		 }
		 return result;
	 }
	 
	 public static void main(String[] args) {
		 System.out.println("Result: " + maxVowels("abbcdeitr", 3));
	 }
}
