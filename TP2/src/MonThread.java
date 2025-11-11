import java.util.Random;

class MonThread extends Thread {
    private String nom;
    private Random random;

    public MonThread(String nom) {
        this.nom = nom;
        this.random = new Random();
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                int delai = random.nextInt(201);
                Thread.sleep(delai);

                System.out.println(nom + " - itération " + i + " (délai: " + delai + "ms)");
            } catch (InterruptedException e) {
                System.err.println(nom + " a été interrompu");
                e.printStackTrace();
            }
        }
        System.out.println(nom + " a terminé son exécution");
    }
}