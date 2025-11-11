class ThreadPair extends Thread {
    public void run() {
        for (int i = 0; i <= 20; i += 2) {
            System.out.println("T1: " + i);
        }
    }
}