package application;

//vedi https://www.youtube.com/watch?v=6DLx5_JJsfo 
//TdP-2017-L03 Java Collections Framework
public class PetClient implements Comparable<PetClient>{
	
	private String ownerName; //nome del proprietario (cliente)
	private String petName; //Nome dell'animale
	private int days; //Numero dei giorni da trascorrere  nel canile
	
	public PetClient(String ownerName, String petName, int days) {
		super();
		this.ownerName = ownerName;
		this.petName = petName;
		this.days = days;
	}
	
	
	@Override
	public String toString() {
		return "ownerName= " + ownerName + ", petName= " + petName + ", days= " + days;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		ownerName = ownerName;
	}
	public String getPetName() {
		return petName;
	}
	public void setPetName(String petName) {
		this.petName = petName;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}


	@Override
	public int compareTo(PetClient o) {
		if(this.days < o.days)
			return -1;
		if(this.days > o.days)
			return 1;
		return 0;
	}



	
	
}
