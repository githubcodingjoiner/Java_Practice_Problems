// import java.util.Scanner;

public class strings {
    public static void main(String [] args){
        // Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());

        
        StringBuffer sb1 = new StringBuffer("Aditi Desai");
        System.out.println(sb1.capacity());
        System.out.println(sb1.length());

        sb1.insert(6, "Sharad ");
        System.out.println(sb1);

    }
}
