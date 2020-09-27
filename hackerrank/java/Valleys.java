import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        int seaLevel = 0;
        int result = 0;
        boolean valleyBegin = false;
        if(path != null){
            int up = 1;
            int down = -1;
            if(steps >= 2 && steps <= 1000000){
                char[] stepsArray = path.toCharArray();

                for (char step : stepsArray) { 
                    if(step == 'U'){
                        seaLevel ++;
                        if(seaLevel == 0){
                            result++;
                        }
                    }else {
                        seaLevel --;
                    }

                } 
            }
        }
        return result;
    }

}

public class Valleys {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = Result.countingValleys(steps, path);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
