import java.util.ArrayList;

public class Banco{
    static Conta conta = new Conta();
    private String nome = "Banco UFMA";
    private int agencia = 26034;
    private ArrayList<Cliente> clientes;
    private int senhaGerente = 123;
    
    public Banco(){
        clientes = new ArrayList<Cliente>();
    }
    
    //GGETTERS AND SETTERS
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
      public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public int getSenhaGerente() {
        return senhaGerente;
    }
    public void setSenhaGerente(int senhaGerente) {
        this.senhaGerente = senhaGerente;
    }

    
    //CONSTRUCTORS
    public void cadastrarCliente(Cliente novo){

    }

    public void excluirCliente(long CPF){

    }

    public void ListaCliente() {
        this.clientes = new ArrayList<Cliente>();
    }


    public void addCliente(Cliente c){
        this.clientes.add(c);
    }

    public void getAllCli(){
        for(int i = 0; i < this.clientes.size(); i++){
            System.out.println("\n REF DO CLIENTE "+ this.clientes.get(i) + " -- " + this.clientes.get(i).getNome() + "-- CPF: " + this.clientes.get(i).getCpf() + "-- CONTA: " + this.clientes.get(i).getConta());
        }
    }
}


/*public void getAllProd() {
        for(int i = 0; i < this.arrProd.size(); i++) {
            System.out.println("\nREF DO OBJ: " + this.arrProd.get(i) + " -- "  + "MARCA: " + this.arrProd.get(i).getMarca() + " -- QUANTIDADE: " + this.arrProd.get(i).getQuantidade());
        }
    }

    
}*/