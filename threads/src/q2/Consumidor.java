package q2;

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
                if(deposito.getNumItens()>0){
                    deposito.retirar();
                    Thread.sleep(tempo);
                }else{
                    System.out.println("Estoque insuficiente, entrando em espera...");
                    Thread.sleep(200);
                }
            }
            System.out.println("Estoque atual: " + deposito.getNumItens());
        }catch(InterruptedException e){
            System.out.println("ERRO!");
        }
    }

    public void start(){
        if(th == null){
            th = new Thread(this, "consumidor");
            th.start();
        }
    }
}
