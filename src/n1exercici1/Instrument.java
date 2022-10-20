package n1exercici1;

abstract class Instrument {
	private String name = "";
	private float price = 0f;
	
	
	public Instrument(String name, float price) {
		super();
		this.name = name;
		this.price = price;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Aquest/a " + name + " té un preu de " + price + " euros.";
	}
	

	public abstract void tocar();

}