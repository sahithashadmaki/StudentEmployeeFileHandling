package StudentManagementUsingCSV;

import StudentManagement.Details;

public class DetailsStudent extends CommonDetails {
	int marks;
	public DetailsStudent(int id, String name, String dateOfBirth, String bloodGroup, int height,int marks) {
		super(id, name, dateOfBirth, bloodGroup, height);
		this.marks=marks;
	}

	

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
}
