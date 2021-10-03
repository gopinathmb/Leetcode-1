class Solution {
    public long power(long num, long d){
        if(d == 0){
             return 1;
        }
        long num_2 =  power(num,d/2);
        if(d%2 == 0){
             return (num_2*num_2);
        }
        else{
             return (num*num_2*num_2);
        }
        
    }
    public long reverse1(long x) {
        
        long flag = 0;
        long n = 0;
        if(x<0){
            flag = 1;
            x*=(-1);
        }
        long y =x;
        long rem = 0;
        long digit =0;
        
        while(y>0){
            y/=10;
            digit++;
        }
        while(x>0){
            rem=x%10;
            n+=rem*power(10,digit-1);
            digit--;
            x/=10;
        }
        if(n>=-2147483647 || n<=2147483647){
        if(flag==1){
            return n*(-1); 
        }
        return n;
        }
        else{
        return 0;
    }
    }
    public int reverse(int m){
        
        if(reverse1(m)>=-2147483647 && reverse1(m)<=2147483647){
            return reverse1(m);
        }
        else{ return 0; }
    }
    
}
