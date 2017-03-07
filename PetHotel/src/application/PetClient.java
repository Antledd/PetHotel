package application;

public class PetClient implements Comparable<PetClient> {

	private String ownerName;
	private String petName;
	private int days;

	public PetClient(String ownerName, String petName, int days) {
		super();
		this.ownerName = ownerName;
		this.petName = petName;
		this.days = days;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
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
		if (this.days < o.days)
			return -1;
		if (this.days > o.days)
			return 1;
		return 0;
	}

	@Override
	public String toString() {
		return "ownerName=" + ownerName + ", petName=" + petName + ", days=" + days;
	}

}
