public class Race {
    public static void race() {
        RacerThreads[] corredores;
        corredores = new RacerThreads[10];
        for (int i = 0; i < 10; i++) {
            corredores[i] = new RacerThreads(Integer.toString(i+1));
        }
        for (int i = 0; i < 10; i++) {
            corredores[i].start();
        }
    }
}
