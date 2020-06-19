import java.util.HashSet;

public class IteratorExample {

	public static void main(String[] args) {
		Animal e = new Animal("dog", "Jessie", 4);
		Animal x = new Animal("lizard", "Frank", 4);
		Animal y = new Animal("spider", "Bob", 8);
		Animal q = new Animal("fish", "Jack", 0);
		Collection ac = new Collection();
		ac.add(e);
		ac.add(x);
		ac.add(y);
		ac.add(q);

		Iterator it = ac.Iterator();
		while (it.hasNext()) {
			Animal a = it.next();
			System.out.println(a + "\n");
		}
	}
}

interface Iterator {
	public boolean hasNext();

	public Animal next();
}

class Collection {
	private HashSet<Animal> animals = new HashSet<Animal>();

	public void add(Animal a) {
		animals.add(a);
	}

	public theIterator Iterator() {
		return new theIterator();
	}

	private class theIterator implements Iterable<HashSet<Animal>>, Iterator {
		private int active = 0;

		public boolean hasNext() {
			if (active == animals.size()) {
				return false;
			} else {
				return true;
			}
		}

		public Animal next() {
			Animal a = animals.iterator().next();
			animals.iterator().next().remove(animals);
			return a;
		}

		@Override
		public java.util.Iterator<HashSet<Animal>> iterator() {
			return null;
		}

	}

}
