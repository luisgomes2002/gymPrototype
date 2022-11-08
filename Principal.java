//time
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
//others
import java.util.ArrayList;
import javax.swing.JOptionPane;
//sql
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal
{
    public static void main(String[] args)
    {
        System.out.println("Bem Vindo ao sistema da academia");
        JOptionPane.showMessageDialog(null, "Bem Vindo ao sistema da academia");
        //nao entendi nada de SQL pqp
        Statement sqlSt; //runs SQL
        //String useSQL = new String("use academia");
        String output;
        ResultSet result; //holds the output from the SQL
        String SQL = "select * from author order by authorlast";//mudar
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String dbURL = "jdbc:mysql://localhost:3306/academia";
            Connection dbConnect = DriverManager.getConnection(dbURL, "root", "");
            sqlSt = dbConnect.createStatement();//allows SQL to be executed
            result = sqlSt.executeQuery(SQL);
            //result holds the output from the SQL
            while(result.next() != false){
                output = result.getString("AuthorLast") + " " + result.getString("AuthorLast");
                System.out.println(output);
            }

            sqlSt.close();
        }
        
        catch(ClassNotFoundException ex)
        {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Class not found, check the JAR");
        }
        
        catch(SQLException ex)
        {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("SQL IS BAD!!" + ex.getMessage());
        }
        
        ArrayList<Cliente> cadastro = new ArrayList<>();
        ArrayList<Funcionario> cadastrof = new ArrayList<>();
        ArrayList<Treino> cadastrot = new ArrayList<>();
        
        int menu;
        do
        {
            menu = Integer.parseInt(JOptionPane.showInputDialog(null, "[1] CASTRAR CLIENTES\n" +
            "[2] CADASTRAR FUNCIONARIOS\n" + "[3] FAZER LISTA DE TREINOS\n" +"[4] MOSTRAR LISTA DE CLIENTES\n" + "[5] MOSTRAR LISTA DE FUNCIONARIOS\n"+"[6] EXCLUIR CADASTROS\n"+"[7] MOSTRAR UM UNICO CLIENTE OU FUNCIONARIO\n" + "[8] SAIR"));
            switch(menu)
            {
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
                	
                    System.out.println("Treino A\n\n" +
                    "Agachamento 5 X 8-10 reps / Intervalo 45s a 1min\n" +
                    "Leg Press 4 X 8-10 reps / Intervalo 45s a 1min\n" +
                    "Extensora 3 X 8-10 reps / Intervalo 45s a 1min\n" +
                    "Stiff 4 X 8-10 reps / Intervalo 45s a 1min\n" +
                    "Mesa flexora 3 X 8-10 reps / Intervalo 45s a 1min\n" +
                    "Extensora lombar 3 X 8-10 reps / Intervalo 45s a 1min\n" +
                    "Panturrilha 4 X 8-10 reps / Intervalo 45s a 1min\n\n");
                    System.out.println("Treino B\n\n" +
                    "Supino / 5 X 8-10 reps / Intervalo 45s a 1min\n" +
                    "Supino inclinado halteres / 4 X 8-10 reps / Intervalo 45s a 1min\n" +
                    "Peck deck fly / 3 X 8-10 reps / Intervalo 45s a 1min\n" +
                    "Desenvolvimento / 4 X 8-10 reps / Intervalo 45s a 1min\n"  +
                    "Elevação lateral / 3 X 8-10 reps / Intervalo 45s a 1min\n" +
                    "Mergulho / 4 X 8-10 reps / Intervalo 45s a 1min\n" +
                    "Tríceps corda / 3 X 8-10 reps / Intervalo 45s a 1min\n\n");
                    System.out.println("Treino C\n\n"+
                    "Barra fixa ou graviton 5 X 8-10 reps / Intervalo 45s a 1min\n"+
                    "Remada baixa no triângulo 4 X 8-10 reps / Intervalo 45s a 1min\n"+
                    "Puxada alta 3 X 8-10 reps / Intervalo 45s a 1min\n"+
                    "Rosca alternada 4 X 8-10 reps / Intervalo 45s a 1min\n"+
                    "Rosca direta no cabo 3 X 8-10 reps / Intervalo 45s a 1min\n"+
                    "Abdominal crunch máquina 3 X 8-10 reps / Intervalo 45s a 1min\n"+
                    "Abdominal oblíquo máquina 3 X 8-10 reps / Intervalo 45s a 1min\n");
                    
                    Treino treino = new Treino();
                    treino.setTreinos(JOptionPane.showInputDialog(null, "Escolha o trenio do cliente"));
                    cadastrot.add(treino);
                break;
                case 4:
                	
                    LocalDateTime agora = LocalDateTime.now();
                    DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/MM/uuuu");
                    String dataFormatada = formatterData.format(agora);
                    DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm:ss");
                    String horaFormatada = formatterHora.format(agora);                   

                    int num = 1;
                    for(Cliente c: cadastro)
                    {//MOSTRAR DADOS DOS CLIENTES
                        System.out.println("Cliente: "+(num)+"\n"+c+"\n");
                        System.out.println("Cliente "+(num)+ "\n" + (cadastrot.get(num-1)));
                        System.out.println(horaFormatada);
                        System.out.println(dataFormatada+"\n"+"\n"); 
                        num++;
                    }                            
                break;
                case 5:
                	
                    int num2 = 1;
                    for(Funcionario f: cadastrof){//MOSTRAR DADOS DOS FUNCIONARIOS
                        System.out.println("Cliente: "+(num2)+"\n"+f+"\n");
                        num2++;                        
                    } 
                break;
                case 6://REMOVER CLIENTE, FUNCIONARO, TREINO
                    int menu2 = Integer.parseInt(JOptionPane.showInputDialog(null, "[1] EXCLUIR UM CLIENTE\n" + "[2] EXCLUIR UM FUNCIONARIOS\n" + "[3] EXCLUIR UM TREINO\n" + "[4] SAIR"));
                    do
                    {
                        switch(menu2)
                        {
                            case 1:
                                int remv;
                                remv = Integer.parseInt(JOptionPane.showInputDialog( "Escolha um cliente para remover"));
                                cadastro.remove(remv-1);
                            break;
                            case 2:
                                int remv2;
                                remv2 = Integer.parseInt(JOptionPane.showInputDialog( "Escolha um funcionario para remover"));
                                cadastrof.remove(remv2-1);
                            break;
                            case 3:
                                int remv3;
                                remv3 = Integer.parseInt(JOptionPane.showInputDialog( "Escolha um treino para remover"));
                                cadastrot.remove(remv3-1);
                            break;
                        }                     
                    }while(menu2 != 4);
                break;
                case 7://escolher um cliente e um funcionario especifico
                    int menu3 = Integer.parseInt(JOptionPane.showInputDialog(null, "[1] MOSTRAR UM UNICO CLIENTE\n" + "[2] MOSTRAR UM UNICO FUNCIONARIO\n"+"[3] SAIR"));
                    do{
                        switch(menu3)
                        {
                            case 1:
                                int esc;
                                esc = Integer.parseInt(JOptionPane.showInputDialog( "Escolha um cliente para imprimir"));
                                System.out.println("Cliente "+(esc)+ "\n" + (cadastro.get(esc-1)));
                                System.out.println("Cliente "+(esc)+ "\n" + (cadastrot.get(esc-1)));                    
                            break;
                            case 2:
                                int esc2;
                                esc2 = Integer.parseInt(JOptionPane.showInputDialog( "Escolha um funcionario para imprimir"));
                                System.out.println("Funcionario "+(esc2)+ "\n" + (cadastrof.get(esc2-1)));   
                            break;
                        }                                  
                    }while(menu3 !=3);
                break;
                default:
                break;
            }
        }while(menu != 8);
        {
            JOptionPane.showMessageDialog(null, "Saindo do Programa...");
        }
    }
}