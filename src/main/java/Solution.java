class Solution {
    public int minSteps(int n) {
        if(n == 1) {
            return 0;
        }
        int res  = 0;
        while(true) {
            int bd = biggestDivider(n);
            if(bd == n) {
                res += n;
                break;
            }
            res+= n / bd ;
            n = bd;
        }


        return res;
    }

    int biggestDivider(int n) {
        for(int i = 2;  i * i <= n; i++ ) {
            if(n % i == 0) {
                return n / i;
            }
        }

        return n;
    }
}