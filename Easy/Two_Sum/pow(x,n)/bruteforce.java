class Solution {
    public double myPow(double x, int n) {
        double y = x;
        if (n<0) {
            n *= -1;
            while(n-1>0){
            x*=y;
            n--;
            }
            return 1/x;
        }
            
        else if(n>0){
            while(n-1>0){
                x*=y;
                n--;
            }
            return x;
        }
        else{return 1;}
    }
}
