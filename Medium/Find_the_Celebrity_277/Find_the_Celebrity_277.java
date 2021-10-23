/* The knows API is defined in the parent class Relation.
      boolean knows(int a, int b); */

public class Solution extends Relation {
    /**
     * @param n a party with n people
     * @return the celebrity's label or -1
     */
    public int findCelebrity(int n) {
        // Write your code here
        int start = 0;
        int end = n-1;
        while (start < end) {
            if (knows(start, end)) {
                start++;
            } else {
                end--;
            }
        }
         
        // Validating the celebrity
        int celebrity = end;
        for(int person = 0; person<total_persons; person++){
            if(person==celebrity) continue;
            else if(knows(celebrity, person) || !knows(person, celebrity)) return -1;
        }
        return celebrity;
          
    }
}

/*
======================================================================
O(n2)
O(n)

======================================================================
Stack 


======================================================================
Graphs not implemented yet

Using Indegree outdegree concept.
O(n2)
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
            if(person==celebrity) continue;
            else if(knows(celebrity, person) || !knows(person, celebrity)) return -1;
        }
        return celebrity;
      }
*/

