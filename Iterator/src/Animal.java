import java.util.HashSet;

public class Animal {
	private final int numOfLegs;
	private String name;
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Animal(String type, String name, int legs) {
		this.name = name;
		this.type = type;
		numOfLegs = legs;
	}

	public void remove(HashSet<Animal> a) {
		a.remove(this);
	}

	public String toString() {
		return this.name + " is a " + this.type + " with " + this.numOfLegs + " legs";
	}

}
