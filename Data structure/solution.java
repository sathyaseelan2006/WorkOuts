import java.util.*;
class solution {
    public int lengthOfLastWord(String s) {
        int c=0;
        Scanner sc = new Scanner(System.in);
        //String s = sc.nextLine();

        int n = s.length();
        for(int i=n-1;i>=0;i--){
            char ch = s.charAt(i);
            if(Character.isWhitespace(ch) && c==0)
            continue;
            if(!Character.isWhitespace(ch)){
                c++;
            }
            else{
                break;
            }
        }
        return c;
        
    }
}