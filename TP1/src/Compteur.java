class Compteur {
    private int valeur = 0;
    private boolean tourPair = true;

    public synchronized void afficherPair() {
        while (valeur <= 20) {
            while (!tourPair) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (valeur <= 20) {
                System.out.println(valeur);
                valeur++;
                tourPair = false;
                notify();
            }
        }
    }

    public synchronized void afficherImpair() {
        while (valeur <= 20) {
            while (tourPair) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (valeur <= 20) {
                System.out.println(valeur);
                valeur++;
                tourPair = true;
                notify();
            }
        }
    }
}