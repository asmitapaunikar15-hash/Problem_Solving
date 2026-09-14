class Solution {
    public boolean isPalindrome(String s) {
        String newstr="";
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                newstr+=s.charAt(i);
            }
        }
        newstr=newstr.toLowerCase();
        String rev=new StringBuilder(newstr).reverse().toString();
        if(newstr.compareTo(rev)==0){
            return true;
        }
        else{
            return false;
        }
    }
}
