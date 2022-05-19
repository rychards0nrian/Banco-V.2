public class AutoAtendimento {
   // static Banco banco = new Banco();
    static Banco lc = new Banco();

    public static void main(String[] args) throws Exception {

        for(int i = 0; i < 4 ; i++) {
            lc.addCliente(new Cliente("CLIENTE " + i, i ,null ));

        }

        lc.getAllCli();
    }


    //CONSTRUCTORS
    public static void loginCliente(int numConta, int senha){

    }

    public static boolean loginGerente(int numAgencia, int senha){
        if((lc.getAgencia() == numAgencia) &&(lc.getSenhaGerente() == senha)){
            System.out.println("Acesso concedido");
        }else{
            System.out.println("Acesso negado!!! Por favor digite seus dados novamente");
        }
        return true;
    }

    public static void cadastrarCliente(Cliente novo){
      //  novo.setNome() = "rian";

    }

    public void excluirCliente(long CPF){

    }

    public void clienteSacar(float valor, int senha){

    }

    public void clienteDepositar(float valor){

    }

    public void clienteVerificarSaldo(int senha){

    }
    


}
/*public class Main {
    public static void main(String[] args) {
        ListaProduto lp = new ListaProduto();
        
        for(int i = 0; i < 4; i++) {
            lp.addProd(new Produto("PRODUTO " + i, i));
        }
        
        lp.getAllProd();
    }

}*/