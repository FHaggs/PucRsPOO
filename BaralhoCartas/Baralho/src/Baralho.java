public class Baralho {
    private Carta cartas[] = new Carta[52];
    private int proxLivre;

    public Baralho(){
        proxLivre = 0;
        createBaralho();
    }

    public void createBaralho(){
    
        for(Naipe naipe: Naipe.values()){
            // 13 cartas por naipe
            for(Valor valor: Valor.values()){
                addCard(new Carta(valor, naipe));
            }
        }
    }
    public boolean addCard(Carta carta){
        if(proxLivre < cartas.length){
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

        // 0 1 2 3
        for(int i=0;i<proxLivre-1;i++){
            cartas[i] = cartas[i+1];
        }

        proxLivre--;

        return deCima;
    }



}
