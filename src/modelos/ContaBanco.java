package modelos;
import ferramentas.Entrada;

/**
 *
 * @author franciele
 */
public class ContaBanco {
    private String agencia;
    private String conta;
    private String titular;
    private double saldo;
    private double chequeEspecial;
    private String chavePix;

    //criar metode "saque", "deposito", toString()
    
    public ContaBanco() {
        
    }
    
    public ContaBanco(String agencia, String conta, String titular, double saldo, double chequeEspecial, String chavePix) {
        this.agencia = agencia;
        this.conta = conta;
        this.titular = titular;
        this.saldo = saldo;
        this.chequeEspecial = chequeEspecial;
        this.chavePix = chavePix;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
    
    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String transferenciaPix) {
        this.chavePix = transferenciaPix;
    }
    
    
    
    
    public void chequeEspecial () {
        System.out.println(this.chequeEspecial);
    }
           
  
    public boolean saque(double valorSaque) {
        
        if (this.saldo >= valorSaque) {
        this.saldo -= valorSaque;
            System.out.println("Saque de " + valorSaque + " efetuado com sucesso");
            return true;
        } else {
            System.out.println("Saldo insuficiente, saque não autorizado.");
            
            return false;
        }
    }
    
    public void deposito(double valorDeposito) {
        this.saldo += valorDeposito;
        System.out.println("Depósito de " + valorDeposito + " realizado com sucesso");
    }
    
    public void transferir(ContaBanco contaRecebimento, double valorTransferencia) {   
        if (saque(valorTransferencia)) {
            contaRecebimento.deposito (valorTransferencia);
            System.out.println("Transferência para conta " + contaRecebimento.titular + " realizada");
        }
    }
    
    public void transferirPix(ContaBanco contaRecebimento, double valorPix) {
        if (saque(valorPix)) {
            contaRecebimento.deposito (valorPix);
            System.out.println("Transferência via PIX para conta " + contaRecebimento.titular + " realizada");
        }
    }
    
   
    
    @Override
    public String toString() {
        return "----------------------\n"
                + "Titular: " + titular + "\n"
                + "Conta: " + conta + "\n" 
                + "Agencia: " + agencia + "\n"
                + "Saldo: " + saldo + "\n" 
                + "----------------------";
       
    }
}