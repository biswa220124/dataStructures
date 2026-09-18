class Solution {
    public void reverseString(char[] s) {
        int first = 0;
        int end = s.length-1;
        char temp ;
        while(first<s.length/2){
            temp = s[first];
            s[first] = s[end];
            s[end] = temp;
            first++; end--;
        }
    }
}