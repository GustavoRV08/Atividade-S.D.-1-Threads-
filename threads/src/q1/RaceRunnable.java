package q1;

public class RaceRunnable{
    public static void main(String[] args) {
        RacerRunnable[] corredores;
        corredores = new RacerRunnable[10];
        for (int i = 0; i < 10; i++) {
            corredores[i] = new RacerRunnable(Integer.toString(i+1));
        }
        for (int i = 0; i < 10; i++) {
            corredores[i].start();
        }
    }
}
