package University;

public class Student implements University{
int id;
String name;
String dateOfBirth;
String bloodGroup;
int height;
int marks;
@Override
public void id(int a) {
	this.id=a;
}
public int getId() {
	return id;
}
@Override
public void name(String a) {
	this.name=a;
	
}
public String getName() {
	return name;
}
@Override
public void dateOfBirth(String a) {
	this.dateOfBirth=a;
	
}
public String getDateOfBirth() {
	return dateOfBirth;
}
@Override
public void bloodGroup(String a) {
	
	this.bloodGroup=a;
}
public String getBloodGroup() {
	return bloodGroup;
}
@Override
public void height(int a) {
	this.height=a;
}
public int getHeight() {
	return height;
}
public void marks(int a) {
	
	this.marks=a;
}
public int getMarks() {
	return marks;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", bloodGroup=" + bloodGroup
			+ ", height=" + height + ", marks=" + marks + "]";
}
}
