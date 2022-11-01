import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Principal{
    public static void main(String[] args) {
        ArrayList<Cliente> cadastro = new ArrayList<>();
        ArrayList<Funcionario> cadastrof = new ArrayList<>();
        ArrayList<Treino> cadstrot = new ArrayList<>();
        int menu;
        do{
            menu = Integer.parseInt(JOptionPane.showInputDialog(null, "[1] CASTRAR CLIENTES\n" +
            "[2] CADASTRAR FUNCIONARIOS\n" + "[3] FAZER LISTA DE TREINOS\n" +"[4] MOSTRAR LISTA DE CLIENTES\n" + "[5] MOSTRAR LISTA DE FUNCIONARIOS\n"+"[6] APAGAR CLIENTES\n" + "[7] SAIR"));
            switch(menu){
                case 1://INSERIR OS DADOS DOS CLIENTES
                    Cliente cliente = new Cliente();
                    cliente.setNome(JOptionPane.showInputDialog(null, "Digite o nome: "));
                    cliente.setTel(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o telefone: ")));
                    cliente.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade: ")));
                    cliente.setEmail(JOptionPane.showInputDialog(null, "Digite o email: "));
                    cliente.setEndereco(JOptionPane.showInputDialog(null, "Digite o endereco: "));
                    cliente.setCpf(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o CPF")));
                    cadastro.add(cliente);
                break;
                case 2://INSERIR OS DADOS DOS FUNCIONARIOS
                    Funcionario funcionario = new Funcionario();
                    funcionario.setNome(JOptionPane.showInputDialog(null, "Digite o nome: "));
                    funcionario.setTel(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o telefone: ")));
                    funcionario.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade: ")));
                    funcionario.setEmail(JOptionPane.showInputDialog(null, "Digite o email: "));
                    funcionario.setEndereco(JOptionPane.showInputDialog(null, "Digite o endereco: "));
                    funcionario.setCpf(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o CPF")));
                    funcionario.setSalario(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o Salario: ")));
                    funcionario.setCargo(JOptionPane.showInputDialog(null, "Digite o Cargo: "));
                    cadastrof.add(funcionario);                    
                break;
                case 3:
                    
                break;
                case 4:
                    int num = 1;
                    for(Cliente i: cadastro){//MOSTRAR DADOS DOS CLIENTES
                        System.out.println("Cliente: "+(num)+"\n"+i+"\n");
                        num++;
                    }
                break;
                case 5:
                    int num2 = 1;
                    for(Funcionario i: cadastrof){//MOSTRAR DADOS DOS FUNCIONARIOS
                        System.out.println("Cliente: "+(num2)+"\n"+i+"\n");
                        num2++;
                    } 
                break;
                case 6:
                    int remv;
                    remv = Integer.parseInt(JOptionPane.showInputDialog( "Escolha um cliente para remover"));
                    cadastro.remove(remv-1);
                    //treino.remove(remv-1);
                break;
                default:
                break;
            }
        }while(menu != 7);
        {
            JOptionPane.showMessageDialog(null, "Saindo do Programa...");
        }
    }
}