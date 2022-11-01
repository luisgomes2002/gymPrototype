public class Funcionario extends Cliente{
    private double salario;
    private String cargo;

    public Funcionario(String nome, int tel, int idade, String email, String endereco, double salario, String cargo, int cpf){
        super(nome, tel, idade, email, endereco, cpf);
        this.salario = salario;
        this.cargo = cargo;
    }

    public Funcionario() {

    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }   
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String toString(){
        return super.toString()+ "\nSalario: "+this.salario+"\nCargo: "+this.cargo;
    }
}
