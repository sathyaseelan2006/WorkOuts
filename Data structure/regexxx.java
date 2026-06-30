
public class regexxx {
    public static void main(String[] args) {
        String number ="9790419564";
        boolean validate = number.matches("^[6789]\\d{9}"); 
        System.out.println(validate);
        String smallletter ="abcdgoppandhadi";
        boolean pool = smallletter.matches("[a-z]+");
        System.out.println(pool);
        String aadhar = "123412341234"; // example
        boolean isValid = aadhar.matches("^\\d{12}$");
        System.out.println(isValid); // true
        String email= "ksathyaseelan34@gmail.com";
        boolean isEmailValid = email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
        System.out.println(isEmailValid); // true

        String pass = "Navdeep@6969";
        boolean isvalidpass = pass.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,20}$");
        System.out.println(isvalidpass);


    }
}
