public class Main
{
    public static void main(String[] args) {
        RacerThreads[] corredores;
        corredores = new RacerThreads[5];
        for(int i = 0; i<5; i++){
            corredores[i] = new RacerThreads(Integer.toString(i));
        }
        for(int i = 0; i<5; i++){
            corredores[i].start();
        }
    }
}
