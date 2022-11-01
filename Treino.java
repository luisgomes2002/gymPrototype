public class Treino extends Cliente {
    private int numDoTreino;

    public Treino(String nome, int numDoTreino){
        super(nome);
        this.numDoTreino = numDoTreino;
    }
    public Treino(){

    }

    public String toString(){
        return System.out.println(Treino.getDataDeInscricao().getTime());
    }
}
