public class Treino extends Cliente {
    private int numDoTreino;
    
    public Treino(String nome, int numDoTreino){
        super();
        this.numDoTreino = numDoTreino;
    }
    public Treino(){

    }

    public int getNumDoTreino() {
        return numDoTreino;
    }
    public void setNumDoTreino(int numDoTreino) {
        this.numDoTreino = numDoTreino;
    }

    public String toString(){
        return super.toString()+ "\nNumero do treino: "+this.numDoTreino;
    }
}
