package q1;

public class RaceRunnableComJoin {
    public static void race() {
        RacerRunnableComJoin[] corredores;
        corredores = new RacerRunnableComJoin[10];
        for (int i = 0; i < 10; i++) {
            corredores[i] = new RacerRunnableComJoin(Integer.toString(i+1));
        }
        for (int i = 0; i < 10; i++) {
            corredores[i].start();
        }
    }
}
