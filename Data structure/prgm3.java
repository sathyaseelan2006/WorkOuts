import java.util.Scanner;
public class prgm3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name= sc.nextLine();
        int numbs=0;
        int words=1;
        int space=0;
        int spcs=0;
        int aplb=0;

        for(int i=0;i<name.length();i++){
            if(name.charAt(i)==' '){
                words++;
                space++;
            } 

           else if(name.charAt(i)>='0' && name.charAt(i)<='9'){
                numbs++;
            }
            else if(name.charAt(i)>='a' && name.charAt(i)<='z'){
                aplb++;
            }
            
            else{
                spcs++;
            }

        }


        System.out.println("Total numbers found: " + numbs);
        System.out.println("Total spaces found: " + space);
        System.out.println("Total special charactors found are:" +spcs);
        System.out.println("Total words are:"+words);

    }
}