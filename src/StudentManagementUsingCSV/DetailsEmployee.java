package StudentManagementUsingCSV;



public class DetailsEmployee extends CommonDetails {
	int experience;
public DetailsEmployee(int id, String name, String dateOfBirth, String bloodGroup, int height,int experience) {
		super(id, name, dateOfBirth, bloodGroup, height);

this.experience=experience;
	}



public int getExperience() {
	return experience;
}

public void setExperience(int experience) {
	this.experience = experience;
}

}
