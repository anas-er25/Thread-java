class ThreadPairSync extends Thread {
    private Compteur compteur;

    public ThreadPairSync(Compteur c) {
        this.compteur = c;
    }

    public void run() {
        compteur.afficherPair();
    }
}
