public class Person{
	protected String name;
	protected  String address;

	/** 
	* Default Constructor
	*/

	public Person(){ //tanpa Parameter / tidak ada 
		System.out.println("Inside Person:Constructor");
		name = "";
		address = "";

	}

	/**
	* Constructor dengan dua parameter 
	*/

	public Person(String vname, String vaddress){
		this.name = vname;
		this.address = vaddress;
	}

	/**
	* Method accessor
	*/

	public String getName(){ // method accessor ==> untuk menanganai atribut sebuah class pasti menggunakan set dan get
								// kalau set itu mthod void

		return name;

	}

	public String  getAddress(){

		return address; //pengembalian nilai

	}

	public void setName(String vname){

		this.name = vname;
	}

	public void setAddress(String vaddress){
		this.address = vaddress;
	}

}