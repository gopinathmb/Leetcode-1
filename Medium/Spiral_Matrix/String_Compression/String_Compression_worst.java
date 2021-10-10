class Solution {
    public int compress(char[] chars) {
        // storing the first element so that we can append count to it
      
        String s = chars[0]+"";
        int count = 1;
        for(int i=0; i<chars.length-1;i++){
            if(chars[i]==chars[i+1]){
                count++;
            }
            else {
                if(count>1){
                    s+= count;
                    count = 1;
                }
                s+=chars[i+1];
            }
            
        }

        if(count >1){
            s+=count;
            count =1;
        }
        
        for(int i =0; i<s.length();i++){
            chars[i] = s.charAt(i);
        }
        //System.out.println(chars);
        return s.length();
    }
}
