package project.rot13;

import java.util.Scanner;

/**
 *
 * @author white
 */
public class ROT13 {

    public static void main(String[] args) {
        //Ambinete teorico onde você instanciaria o 
        //objeto crypt para realizar a criptografia 
        //em algum campo.
        
        //variaveis de inicialização
        Scanner in = new Scanner(System.in);//novo objeto de scan
        String rotmsg;/*variavel de exemplo, sera usada apenas para
        armazenar o valor da criptografia para podermos comparalas,
        em um ambinete real seu funcao seria aplicada a variavel msg.*/
        
        //menu.
        System.out.println("1- Encryption\n2- Decryption\nChose(1,2)");// "\n" quebra o output para a outra linha.
        int chose = in.nextInt();
        
        //criando objeto crypto, ele vai ser ultilizado para chamar o metodo em sua chace.
        CryptRot13 crypt = new CryptRot13();
        
        //operador logico especifico para menus.
        switch (chose) {
            case 1 -> {
                System.out.println("---Encryption---\nOnly alphabetics characters\nEnter menssage: ");
                String msg = in.next();
                rotmsg = crypt.cipherEncryption(msg);//msg = crypt.cipherEncryption(msg)
                //outpute somente para comparação
                System.out.println("\nMensagem antiga: " + msg + "\nNova mensagem: " + rotmsg);
                break;
            }
            case 2 -> {
                System.out.println("---Decryption---");
                String msg = in.next();
                //uma vez que a cifra move um caractere seu equivalente 13 caracteres a frente
                //aplicar a cifra em uma String ja criptografada a descriptografa
                rotmsg = crypt.cipherEncryption(msg);
                System.out.println("\nMensagem antiga: " + msg + "\nNova mensagem: " + rotmsg);
                break;
            }
            //default é para onde vc sera encaminhado caso não se encaixe em nenhum dos operadores logicos a cima.
            default -> {
                    System.out.println("---Invalide---");
                    break;
            }
        }
    }

    //Classe proprosta que seria estanciada
    private static class CryptRot13 {

        public String cipherEncryption(String str) {
		StringBuilder val = new StringBuilder();
                //divide a string em caracteres a parte e
                //aplica uma operação logica.
		for(char a:str.toCharArray()) {
			//operação logica para encontra equivalencia na tabela ASCII.
			if(a >= 'A' && a <= 'Z') {//se caractere a maior que (A) e menor q (Z), siga esse procediemnto
				a += 13;          
				if(a > 'Z') {
					a -= 26;
				}
			}
			else if(a >= 'a' && a <= 'z') {//se caractere (a) maior que a e menor q (z), siga esse procediemnto
				a += 13;
				if(a > 'z') {
					a -= 26;
				}
			}
			val.append(a);
		}
		return val.toString();
                //retorna caracteres encontrados como String.
	}
    }
}
