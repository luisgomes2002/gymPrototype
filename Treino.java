public class Treino extends Cliente {
    private String treinos;
    
    public Treino(String nome, String treinos){
        super();
        this.treinos = treinos;
    }
    public Treino(){

    }

    public String getTreinos() {
        return treinos;
    }
    public void setTreinos(String treinos) {
        this.treinos = treinos;
    }

    public String toString(){
        return "\nTreino: "+this.treinos;
    }
}
