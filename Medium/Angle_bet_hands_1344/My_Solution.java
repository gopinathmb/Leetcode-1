//https://leetcode.com/problems/angle-between-hands-of-a-clock/
/*
class Solution {
    public double angleClock(int hour, int min) {
        int hour_degree = (hour%12)*60+min;
        //Angle will be different at 12.0
        
        if (180 < Math.abs(hour_degree*0.5-min*6)){
            return 360 - Math.abs(hour_degree*0.5-min*6);
        }
        else{
            return Math.abs(hour_degree*0.5-min*6);
        }
             
    }
}



class Solution {
    public double angleClock(int hour, int min){
        double min_angle = min*6;
        double hour_angle = hour*30 + min*0.5;
        double total_angle = Math.abs(min_angle - hour_angle);
        return Math.min(total_angle, 360 - total_angle);
    }
}
*/

class Solution {
    public double angleClock(int hour, int min){      
        return Math.min(Math.abs(hour*30 - min*5.5), 360 - Math.abs(hour*30 - min*5.5));
    }
}


/*
Notes:

Formula:
Math.abs(hour*30 - min*5.5)
minute_hand per min -> 6 degree
hour_hand per min -> 0.5 degrees
hour hand per hour -> 30*hours

Angle between both:
	   h_angle =  hours*30 +   0.5*min
   -   m_angle =  0        +   6  *min
____________________________________
	    angle  = 30*hours - 5.5*min 
*/
