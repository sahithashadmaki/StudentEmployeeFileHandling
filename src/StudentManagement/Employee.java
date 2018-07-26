package StudentManagement;

import java.util.HashMap;
import java.util.Map.Entry;

public class Employee {
	static HashMap<Integer,DetailsEmployee> empMap=new HashMap<>();
public static void main(String[] args){
	DetailsEmployee empObj=new DetailsEmployee();
	empObj.id(100);
	empObj.name("employee");
	empObj.dateOfBirth("12-03-2001");
	empObj.bloodGroup("O+");
	empObj.height(7);
	empObj.setExperience(9);
	int empId=empObj.getId();
	empMap.put(empId, empObj);
	for(Entry<Integer,DetailsEmployee> entry:empMap.entrySet()){
		System.out.println("Id: "+entry.getValue().getId());
		System.out.println("Name: "+entry.getValue().getName());
		System.out.println("Date Of Birth:  "+entry.getValue().getDateOfBirth());
		System.out.println("Blood Group: "+entry.getValue().getBloodGroup());
		System.out.println("height: "+entry.getValue().getHeight());
		System.out.println("Experience: "+entry.getValue().getExperience());
	}
	int height=empObj.getHeight();
	String bloodGroup=empObj.getBloodGroup();
	EntitiesForMedical MedObj=new EntitiesForMedical();
	MedObj.MedicalMethod(height, bloodGroup);
}
}
