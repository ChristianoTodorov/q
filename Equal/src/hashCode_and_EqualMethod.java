
public class hashCode_and_EqualMethod extends Equal_Method_Example {

	String word;
	String slovo;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((slovo == null) ? 0 : slovo.hashCode());
		result = prime * result + ((word == null) ? 0 : word.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		hashCode_and_EqualMethod other = (hashCode_and_EqualMethod) obj;
		if (slovo == null) {
			if (other.slovo != null)
				return false;
		} else if (!slovo.equals(other.slovo))
			return false;
		if (word == null) {
			if (other.word != null)
				return false;
		} else if (!word.equals(other.word))
			return false;
		return true;
	}
}
