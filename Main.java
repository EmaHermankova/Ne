import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        try{
            a=sc.nextDouble();
            b=sc.nextDouble();
            c = a/b;

        }catch(InputMismatchException e){
            System.out.println("chyba vstupu");
            return;

        }catch(NoSuchElementException e){
            System.out.println("chyba AAA");
            return;

        }catch(ArithmeticException e){
            System.out.println("chyba BBB");
            return;
        }
        System.out.println("vysledek je: " + c);
    }
}