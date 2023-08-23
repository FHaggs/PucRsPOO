import java.util.Arrays;

public class Baralho {
    private Deck cartas;

    public Baralho(){
        cartas = new Deck();
        for(Naipe naipe: Naipe.values()){
            // 13 cartas por naipe
            for(Valor valor: Valor.values()){
                cartas.addCard(new Carta(valor, naipe));
            }
        }
    }
    public Carta retirarCima(){
        return cartas.retirarCima();
    }
    
    public void shuffle(){
        cartas.shuffle();
    }
    public String toString(){
        return Arrays.toString(cartas.getCartas());
    }
    
    
    
}
