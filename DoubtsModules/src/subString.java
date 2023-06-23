public class subString {
    public static void main(String[] args) {
       // String s="rajapeddanna";
        String s="madamR";
       // System.out.println(s.substring(2));
       // System.out.println(s.substring(2,8));
       // isPalindrome(s);
        first(s);
    }

    public static boolean isPalindrome(String s)
    {   // if length is 0 or 1 then String is palindrome
        if(s.length() == 0 || s.length() == 1)
            return true;
        if(s.charAt(0) == s.charAt(s.length()-1)) {
            System.out.println(s.substring(1, s.length() - 1));
            return isPalindrome(s.substring(1, s.length() - 1));
        }else{
            return false;
        }

    }


    public static char first(String str) {
        if(str.isEmpty()) {
            return ' ';
        }
        System.out.println("Main String ::"+str);
        if (Character.isUpperCase(str.charAt(0))) {
            return str.charAt(0);
        }else {
            System.out.println(str.substring(1, str.length()));
            return first(str.substring(1, str.length()));
        }
    }
}
