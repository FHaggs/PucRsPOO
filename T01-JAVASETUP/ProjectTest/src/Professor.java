public class Professor {
    private String nome;
    private int anosExperiencia; 
    public Professor(String nome, int anosExperiencia) { 
        this.nome = nome; 
        this.anosExperiencia = anosExperiencia; 
    } 
    public String getNome() { return nome; } 
    public int getAnosExperiencia() { return anosExperiencia; } 
    public String classifica(){ 
        // Nova sintaxe do Java 14-15 em diante 
        return "LALAL";
    }        
    @Override public String toString() { 
        return "Professor: " + nome + ", anos de experiencia:" + anosExperiencia + "]"; 
}
}
