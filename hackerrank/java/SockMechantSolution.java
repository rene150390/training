import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SockMechantSolution {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) throws Exception{
        int pairsNumber = 0;
        if(ar != null){

            //Bubble sort
            for(int i = 0; i < n; i++){
                for(int j = i + 1; j < n; j++){
                    if(ar[i] > ar[j]){
                        int temp = ar[j] ;
                        ar[j] = ar[i];
                        ar[i] = temp;
                    }
                }
            }

            //Algortihm to find pair number
            int cont = 1;
            for(int k = 0; k < n; k++){
                
                if( k < (n - 1)){
                    
                    if(ar[k] == ar[k + 1]){
                        cont++;
                    } else {
                        if(cont % 2 == 0){
                            pairsNumber = ((cont / 2) + pairsNumber) ;
                            
                        }else if(cont > 1){
                            pairsNumber = (((cont - 1 )/ 2) + pairsNumber) ;
                        }
                        cont = 1;
                        
                    }
                }else{
                    if(cont % 2 == 0){
                            pairsNumber = ((cont / 2) + pairsNumber) ;
                            
                        }else if(cont > 1){
                            pairsNumber = (((cont - 1 )/ 2) + pairsNumber) ;
                        }
                        cont = 1;
                }
            }

        }else{
            throw new Exception("Arguments cannot be null");
        }

        return pairsNumber;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}