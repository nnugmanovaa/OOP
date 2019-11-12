package three;

public class Person {

	Gender gender;
	String name;

	public Person(String name, Gender gender) {
		this.name = name;
		this.gender = gender;
	}

	public String toString() {
		return name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		
		if (!(obj instanceof Person)) {
			
			return false;
		}
		
		Person tmpPerson = (Person) obj;
		System.out.println(this.name + " " + tmpPerson.name);

		
		return (this.name.equals(tmpPerson.name)) ;
		
		
	}
}
