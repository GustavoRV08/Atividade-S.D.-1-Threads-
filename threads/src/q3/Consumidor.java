package q3;

public class Consumidor extends Thread{
    Thread th;
    Deposito deposito;
    int tempo;
    public Consumidor(Deposito dep, int t){
        deposito = dep;
        tempo = t;
    }

    public void run(){
        try{
            for(int i = 0; i<20; i++){
                while(!deposito.retirar()){
                    Thread.sleep(200);
                }
                Thread.sleep(tempo);
            }
        }catch(InterruptedException e){
            System.out.println("ERRO!");
        }
        System.out.println("Estoque atual: " + deposito.getNumItens());
    }

    public void start(){
        if(th == null){
            th = new Thread(this, "consumidor");
            th.start();
        }
    }
}
