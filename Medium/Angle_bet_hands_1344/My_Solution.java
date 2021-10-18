//https://leetcode.com/problems/angle-between-hands-of-a-clock/
class Solution {
    public double angleClock(int hour, int min) {
        int hour_degree = hour*60+min;
        if(hour==12){
            
            if(180<Math.abs(min*0.5-min*6)){
                return 360 - Math.abs(min*0.5-min*6);
            }
            else{
                return Math.abs(min*0.5-min*6);
            }
        }
        else if (180 < Math.abs(hour_degree*0.5-min*6)){
            return 360 - Math.abs(hour_degree*0.5-min*6);
        }
        else{
            return Math.abs(hour_degree*0.5-min*6);
        }
             
    }
}
