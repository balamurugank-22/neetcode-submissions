class Solution {
    public boolean isPalindrome(String s) {
        String str=s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        String r="";
        for(int i=str.length()-1;i>=0;i--){
            r+=str.charAt(i);
        }
        return r.equals(str);
    }
}
