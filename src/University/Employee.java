package University;

public class Employee implements University{
	int id;
	String name;
	String dateOfBirth;
	String bloodGroup;
	int height;
	@Override
	public void id(int a) {
		this.id=a;;
		
	}

	@Override
	public void name(String a) {
		
		this.name=a;
	}

	@Override
	public void dateOfBirth(String a) {
		
		this.dateOfBirth=a;
	}

	@Override
	public void bloodGroup(String a) {
		this.bloodGroup=a;
		
	}

	@Override
	public void height(int a) {
		
		this.height=a;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", bloodGroup=" + bloodGroup
				+ ", height=" + height + "]";
	}

}
