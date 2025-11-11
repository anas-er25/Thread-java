class ThreadImpairSync extends Thread {
    private Compteur compteur;

    public ThreadImpairSync(Compteur c) {
        this.compteur = c;
    }

    public void run() {
        compteur.afficherImpair();
    }
}