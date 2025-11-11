public class Main {
    public static void main(String[] args) {
        System.out.println("=== Version SANS synchronisation ===");
        ThreadPair t1 = new ThreadPair();
        ThreadImpair t2 = new ThreadImpair();
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\n=== Version AVEC synchronisation (ordre 0-20) ===");
        Compteur compteur = new Compteur();
        ThreadPairSync t3 = new ThreadPairSync(compteur);
        ThreadImpairSync t4 = new ThreadImpairSync(compteur);
        t3.start();
        t4.start();

        try {
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nFin du programme");
    }
}
