import java.util.Scanner;

// Main
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Inserimento Base
        System.out.println("Inserisci la base del rettangolo:");
        double base = in.nextDouble();

        // Inserimento Altezza
        System.out.println("Inserisci l'altezza del rettangolo:");
        double altezza = in.nextDouble();

        // Oggetto
        Rettangolo rettangolo = new Rettangolo(base, altezza);


    }
}

class Rettangolo {
    private double larghezza;
    private double altezza;



    // Metodo per calcolare l'area
    public double calcolaArea() {
        return larghezza * altezza;
    }
}
