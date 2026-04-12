import java.util.*;

class Solution {
    public double[] internalAngles(int[] sides) {

        double[] ans = new double[3];

        int a = sides[0];
        int b = sides[1];
        int c = sides[2];
        if (a > c) {
            int temp = a;
            a = c;
            c = temp;
        }
        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }

    
        if ((a+b<=c) || (a+c<=b) || (b+c<=a)) {
            return new double[0]; 
        }

      
        ans[0] = Math.toDegrees(Math.acos((b*b + c*c - a*a) / (2.0 * b * c)));
        ans[1] = Math.toDegrees(Math.acos((a*a + c*c - b*b) / (2.0 * a * c)));
        ans[2] = Math.toDegrees(Math.acos((a*a + b*b - c*c) / (2.0 * a * b)));

        Arrays.sort(ans);
        return ans;
    }
}