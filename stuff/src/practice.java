import java.util.*;

public class practice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word you want reversed. ");
        String word = sc.nextLine(), reverse = " ",reverse2 = "";;
        char ch;

        for (int x = 0; x< word.length(); x++){
             ch = word.charAt(x);
             reverse = ch + reverse;
            }
        System.out.println(reverse);

        for (int x = word.length()-1; x>= 0; x--){
             reverse2 = reverse2+word.charAt(x);
            }
        System.out.println(reverse2);
    }//main

}//practice
