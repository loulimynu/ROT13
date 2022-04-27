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
