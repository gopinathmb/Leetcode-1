/* The knows API is defined in the parent class Relation.
      boolean knows(int a, int b); */

public class Solution extends Relation {
    /**
     * @param n a party with n people
     * @return the celebrity's label or -1
     */
    public int findCelebrity(int n) {
        // Write your code here
    }
}

/*
=======================================================================
public int findCelebrity(int total_persons) {
        // Write your code here
        int celebrity = 0;
        for(int person =1; person< total_persons; person++){
            if(knows(celebrity,person)){
                celebrity = person;
            }
        }
        for(int person = 0; person<total_persons; person++){
            if((person!=celebrity && knows(celebrity, person)) || !knows(person, celebrity)){
                return -1;
            }
        }
        return celebrity;
    }
*/

