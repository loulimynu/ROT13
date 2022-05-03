private static class CryptRot13 {

        public String cipherEncryption(String str) {
		StringBuilder val = new StringBuilder();.
		for(char a:str.toCharArray()) {
			if(a >= 'A' && a <= 'Z') {
				a += 13;          
				if(a > 'Z') {
					a -= 26;
				}
			}
			else if(a >= 'a' && a <= 'z') {
				a += 13;
				if(a > 'z') {
					a -= 26;
				}
			}
			val.append(a);
		}
		return val.toString();
	}
