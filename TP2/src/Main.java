public class Main {
    public static void main(String[] args) {
        System.out.println("LE THREAD PRINCIPAL: Demarrage du programme\n");

        MonThread thread1 = new MonThread("Thread-Alpha");
        MonThread thread2 = new MonThread("Thread-Beta");
        MonThread thread3 = new MonThread("Thread-Gamma");

        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println("Thread principal: Les trois threads ont ete lances\n");

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            System.err.println("Thread principal interrompu");
            e.printStackTrace();
        }

        System.out.println("\nThread principal: Tous les threads sont termines");
        System.out.println("Thread principal: Fin du programme");
    }
}