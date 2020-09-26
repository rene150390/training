package here.code;

public class VowelsOptimal {
    
    public static int maxVowels(String s, int k) {
        
        char[] sCharArr = s.toCharArray();
        int sCharSize = sCharArr.length;
        int[] prefixSum = new int[sCharSize];
        
        
        
        for(int i = 0; i < sCharSize; i++) {
            if (sCharArr[i] == 'a' ||
                    sCharArr[i] == 'e' || 
                    sCharArr[i] == 'i' || 
                    sCharArr[i] == 'o' || 
                    sCharArr[i] == 'u') {
                prefixSum[i] = 1;
            }else {
                prefixSum[i] = 0;
            }
            
            if(i != 0) {
                prefixSum[i] += prefixSum[i - 1];
            }
        }
        int maxVowelsNum = prefixSum[k - 1];
        
        for(int i = 0; i < sCharSize - k + 1; i++) {
            //String subString = s.substring(i, i + (k));
            //System.out.println(subString);
            int voWelsNum = 0;
            if(i != 0){
                voWelsNum = prefixSum[i + (k - 1)] - prefixSum[i -1];
            }else {
                voWelsNum = prefixSum[i + (k - 1)];
            }
            if(voWelsNum > maxVowelsNum) {
                maxVowelsNum = voWelsNum;
            }
        }
        
        return maxVowelsNum;
        
     }
    
    public static void main(String[] args) {
        System.out.println("Output: " +  maxVowels("ceebbaceeffo", 3));
    }

}