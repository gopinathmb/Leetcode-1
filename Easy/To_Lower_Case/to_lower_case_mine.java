class Solution {
    public String toLowerCase(String s) {
        String str = "";
        for(int i=0; i<s.length();i++){
            if((int)s.charAt(i)>= 65 && (int)s.charAt(i)<=90){
                str += (char)((int)s.charAt(i) + 32);
            }
            else{
                str+=s.charAt(i);
            }
        }
        return str;
    }
}
