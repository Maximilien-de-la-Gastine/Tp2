import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        discriminant();

    }
    public static void discriminant(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle est la valeur de a ?");
        int a = scanner.nextInt();

        System.out.println("Quelle est la valeur de b ?");
        int b = scanner.nextInt();

        System.out.println("Quelle est la valeur de c ?");
        int c = scanner.nextInt();

        int delta = (int) (Math.pow(b, 2) - 4 * a * c);

        if (delta < 0) {
            System.out.println("Ce polynome n’a pas de racine reelle");
        }
        else if (delta == 0){
            int racine0 = (int) ((-b)/(2*a));
            System.out.println("ce poly a une racine double egale a " + racine0);
        }
        else {
            int racine1 = (int) ((-b+Math.sqrt(delta))/(2*a));
            int racine2 = (int) ((-b-Math.sqrt(delta))/(2*a));
            System.out.println("ce poly a deux racines egales a " + racine1 + " et " + racine2);
        }
    }


}
