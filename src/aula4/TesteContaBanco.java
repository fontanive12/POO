package aula4;
import modelos.ContaBanco;
import ferramentas.Entrada;

/**
 *
 * @author franciele
 */
public class TesteContaBanco {
    public static void main(String[] args) {
        
        ContaBanco objConta1 = new ContaBanco("111", "123", "Pessoa1", 1000, 300, "51999338811");
        ContaBanco objConta2 = new ContaBanco("222", "456", "Pessoa2", 400, 5000, "51999118833");
        ContaBanco objConta3 = new ContaBanco("333", "789", "Pessoa3", 5000, 300, "user@gmail.com");
//        ContaBanco objConta1 = new ContaBanco();
//        
//        objConta1.setTitular(Entrada.leiaString("Digite o nome do titular: "));
//        objConta1.setAgencia(Entrada.leiaString("Digite o número da agencia: "));
//        objConta1.setConta(Entrada.leiaString("Digite o número da conta: "));
//        objConta1.setSaldo(Entrada.leiaDouble("Digite o saldo disponível: "));
        
        int opcao = Entrada.leiaInt("Digite a opção que deseja\n"
                + "[1] Saque\n"
                + "[2] Depósito\n"
                + "[3] Extrato\n"
                + "[4] Transferência\n"
                + "[5] Pix");
        
        
//        objConta1.saque(100);

        
        if (opcao == 1) {
            objConta1.saque(Entrada.leiaDouble("Digite o valor do saque: "));
            System.out.println(objConta1);
       
        } else if (opcao == 2) {
            objConta1.deposito(Entrada.leiaDouble("Digite o valor do depósito: "));
            System.out.println(objConta1);
            
        } else if (opcao == 3) {
            System.out.println("Saldo atual: " + "\n " + objConta1);
        
        } else if (opcao == 4) {
            
            double valorTransferencia = Entrada.leiaDouble("Digite o valor da transferencia: ");
            
            objConta1.transferir(objConta2, valorTransferencia);
            System.out.println(objConta1);
            System.out.println(objConta2);
            
                        
//        } else if (opcao == 5) {
//            double valorPix = Entrada.leiaDouble("Digite o valor que deseja transferir: ");
//            objConta1.setTransferenciaPix(Entrada.leiaString("Digite a chave que deseja enviar: "));
//            
//            if (objConta1.getTransferenciaPix().equals(objConta2.getTransferenciaPix())) {
//                objConta1.chavePix(objConta2, valorPix);
//            } else {
//                objConta2.chavePix(objConta1, valorPix);
//            }
//            
//            System.out.println(objConta1);
//            System.out.println(objConta2);
//        }
        
        
        
        
        System.exit(0);
        
    }
    }
}

