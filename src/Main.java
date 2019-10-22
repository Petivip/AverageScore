import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Enter your first score here: ");
        System.out.println("Enter your second score here: ");
        System.out.println("Enter your third score here: ");
        System.out.println("Enter your fourth score here: ");
        System.out.println("Enter your fifth score here: ");
        System.out.println("Enter your sixth score here: ");
        System.out.println("Enter your seventh score here: ");
        System.out.println("Enter your eighth score here: ");
        System.out.println("Enter your nineth score here: ");
        System.out.println("Enter your tenth score here: ");

        Scanner myVar=new Scanner(System.in);
        int number=myVar.nextInt();
        int number2=myVar.nextInt();
        int number3=myVar.nextInt();
        int number4=myVar.nextInt();
        int number5=myVar.nextInt();
        int number6=myVar.nextInt();
        int number7=myVar.nextInt();
        int number8=myVar.nextInt();
        int number9=myVar.nextInt();
        int number10=myVar.nextInt();

        int newNumber=number+number2+number3+number4+number5+number6+number7+number8+number9+number10;
        System.out.println(newNumber);

    }
}