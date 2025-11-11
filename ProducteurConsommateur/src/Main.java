public class Main{
    public static void main() {
        Buffer buffer = new Buffer();
        Thread producteur = new Thread(new Producteur(buffer));
        Thread consommateur = new Thread(new Consommateur(buffer));

        producteur.start();
        consommateur.start();
    }
}

