import java.util.Random;

public class Deck {
    private Carta cartas[] = new Carta[104];
    private int proxLivre;
    private Random random;

    public Deck(){
        proxLivre = 0;
        random = new Random();
    }

    
    public boolean addCard(Carta carta){
        if(proxLivre < cartas.length){
            if(carta.isAberto()){
                carta.virar();
            }
            cartas[proxLivre] = carta;
            proxLivre++;
            return true;
        }
        return false;
    }

    public Carta[] getCartas(){
        return cartas;
    }

    public Carta retirarCima(){
        if(proxLivre == 0){
            return null;
        }
        Carta deCima = cartas[0];

        
        for(int i=0;i<proxLivre-1;i++){
            cartas[i] = cartas[i+1];
        }

        proxLivre--;

        return deCima;
    }
    public int qntCardas(){
        return proxLivre;
    }
    public void shuffle(){
        

        for(int i=0;i<proxLivre;i++){
            int key = random.nextInt(qntCardas());
            
            Carta aux = cartas[i];
            cartas[i] = cartas[key];
            cartas[key] = aux;

        }
    }


}
