package person;

public class Person {
	private String nom;
	private int age;
	public Person(String nom, int age) {
		super();
		this.nom = nom;
		this.age = age;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [nom=" + nom + ", age=" + age + "]";
	}
	public void affiche()
	{
		System.out.println(this.toString());
	}

}
