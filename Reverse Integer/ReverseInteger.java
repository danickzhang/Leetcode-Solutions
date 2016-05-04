public class Solution {
    public int reverse(int x) {
        long rtn = 0;
        while (x != 0) {
            rtn = rtn * 10 + x % 10;
            x = x / 10;
        }
        
        if(Math.abs(rtn) > Integer.MAX_VALUE) return 0;
        else return (int) rtn;
    }
}
