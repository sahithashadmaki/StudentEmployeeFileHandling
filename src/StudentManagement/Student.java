package StudentManagement;

import java.util.HashMap;
import java.util.Map.Entry;



public class Student {
	static HashMap<Integer,DetailsStudent> map=new HashMap<>();
public static void main(String[] args){
	DetailsStudent studentObj=new DetailsStudent();
	studentObj.id(1);
	studentObj.name("abcd");
	studentObj.dateOfBirth(" sept 9 1996");
	studentObj.bloodGroup("A+");
	studentObj.height(12);
	studentObj.setMarks(97);
	int id=studentObj.getId();
	map.put(id, studentObj);
	for (Entry<Integer, DetailsStudent> entry : map.entrySet()){
		System.out.println("Id: "+entry.getValue().getId());
		System.out.println("Name: "+entry.getValue().getName());
		System.out.println("Date of Birth: "+entry.getValue().getDateOfBirth());
		System.out.println("BloodGroup: "+entry.getValue().getBloodGroup());
		System.out.println("Height: "+entry.getValue().getHeight());
		System.out.println("Marks: "+ entry.getValue().getMarks());
	}
	
}
}
