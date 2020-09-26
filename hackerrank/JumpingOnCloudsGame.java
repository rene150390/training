public class JumpingOnCloudsGame{
	 static int jumpingOnClouds(int[] c) {
        int cLength = c.length;
       
        int count = -1;
        for (int i = 0; i < cLength; i++, count++) {
            if (i<cLength-2 && c[i+2]==0) i++;
        }

        return count;
    }

    public static void main(String[] args){

    }
}