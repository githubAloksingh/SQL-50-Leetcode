class Solution {
    public int minChanges(String s) {
        int n= s.length();
        int ch=s.charAt(0);
        int count=0;
        int change=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)==ch){
                count++;
                continue;
            }
             if(count%2==0){
                count=1;
            }
            else{
                count=0;
                change++;
            }
            ch=s.charAt(i);
        }
        return change;
    }
}