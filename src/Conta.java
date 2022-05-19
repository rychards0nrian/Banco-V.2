public class Conta {
    private int numero;
    private float saldo;
    private int senha;
   
    //GETTERS AND SETTERS
    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


    //Construtores
    public void depositar(float valor){
        
    }  
    
    public void sacar(float valor, int senha){

    }

    public float verificarSaldo(int senha){
        return saldo;
    } 



    
}
