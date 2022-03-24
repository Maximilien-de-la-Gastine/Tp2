import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        discriminant();
//        parite();
//        max();
//        min();
//        egaliteStr();
//        factorielle();
//        countDown();
        carre();

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
            int racine0 = (-b/(2*a));
            System.out.println("ce poly a une racine double egale a " + racine0);
//            Ne fonctionne pas puisque ça renvoie 0, je ne sais pas pourquoi pour le moment
        }
        else {
            int racine1 = (int) ((-b+Math.sqrt(delta))/(2*a));
            int racine2 = (int) ((-b-Math.sqrt(delta))/(2*a));
            System.out.println("ce poly a deux racines egales a " + racine1 + " et " + racine2);
        }
    }
    public static void parite(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un entier :");
        int entier = scanner.nextInt();
        if (entier%2==0){
            System.out.println("C'est un nombre pair");
        }
        else {
            System.out.println("C'est un nombre impair");
        }
    }
    public static void max(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir un entier : ");
        int entier1 = scanner.nextInt();

        System.out.println("Saisir un deuxieme entier : ");
        int entier2 = scanner.nextInt();

        if (entier1>entier2){
            System.out.println("le maximum est la valeur : " + entier1);
        }
        else {
            System.out.println("le maximum est la valeur : " + entier2);
        }
    }
    public static void min(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir un entier : ");
        int entier1 = scanner.nextInt();

        System.out.println("Saisir un deuxieme entier : ");
        int entier2 = scanner.nextInt();

        if (entier1>entier2){
            System.out.println("le minimum est la valeur : " + entier2);
        }
        else {
            System.out.println("le minimum est la valeur : " + entier1);
        }
    }
    public static void egaliteStr(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir deux mots : ");
        String chaine1 = scanner.nextLine();

        System.out.println("Saisir deux mots simiaires ou differents : ");
        String chaine2 = scanner.nextLine();

        if (chaine1.equals(chaine2)){
            System.out.println("c'est la meme chose!");
        }
        else{
            System.out.println("C'est different!");
        }
    }
    public static void factorielle(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un entier positif ou nul");
        int n = scanner.nextInt();
        int factorielle = 1;

        for (int i = 1; i <= n; i++) {
            factorielle *= i;
        }
        System.out.println(n + "! = " + factorielle);
    }
    public static void countDown(){
        int compteur = 11;

        for (int i = 0; i <= 10 ; i++){
            if (i!=10){
                compteur--;
                System.out.println(compteur);
            }
            else if (i==10){
                System.out.println("Boum!");
            }
        }
    }
    public static void carre(){

        int[] tableau = new int[2];
        Scanner scanner = new Scanner(System.in);
        System.out.println("saisir une valeur: ");
        int valeur = scanner.nextInt();
        int carre = valeur*valeur;
        valeur = tableau[1];
        carre = tableau[2];
//        Je me suis arreté là


    }

}
