import java.util.Scanner;
public class prg4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String w=" ";
        String result=" ";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch!=' '){
                w=w+ch;
            }
            else{
                for(int j = w.length()-1; j>=0;j--){
                    result+=w.charAt(j);
                }
                result =result+ " ";
                w=" ";

            }
        }
        for(int j = w.length()-1; j>=0;j--){
                    result+=w.charAt(j);



    }
    System.out.println("Rversed:" +result);
}
}