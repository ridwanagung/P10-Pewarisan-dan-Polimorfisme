class Bentukwajah{
	/* Membuat sebuah method respons pada class induk  dimana mengembalikan 
		sebuah nilai String */
	public String respons(){
		return("Perhatikan reakssi bentuk wajah \n ");
	}
}

/** Memebuat class-class lain dengan turunan dari class bentuk wajah*/

class Senyum extends Bentukwajah{ // merupakan bentuk hierarki
	public String respons(){
		return("Senyum karena senang \n");
	}
}

class Tertawa extends Bentukwajah{
	public String respons(){
		return (" Tertawa karena gembira \n");
	}
}

class Marah extends Bentukwajah{
	public String respons(){
		return ("Kemarahan disebabkan bertengkar \n");
	}
}

class Sedih extends Bentukwajah{
	public String respons(){
		return("Sedih disebabkan cemburu \n");
	}
}