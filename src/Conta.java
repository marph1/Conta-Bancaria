public class Conta {

    int Numero;
    String agencia;
    String Nome_cli;
    double saldo = 7000.00;
    
    public Conta(int numero, String agencia, String nome_cli, double saldo) {
        Numero = numero;
        this.agencia = agencia;
        Nome_cli = nome_cli;
        this.saldo = saldo;
    }
    public int getNumero() {
        return Numero;
    }
    public void setNumero(int numero) {
        Numero = numero;
    }
    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public String getNome_cli() {
        return Nome_cli;
    }
    public void setNome_cli(String nome_cli) {
        Nome_cli = nome_cli;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

}
