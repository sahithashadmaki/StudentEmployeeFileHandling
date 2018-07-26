package University;

import java.util.HashMap;
import java.util.Map.Entry;

public class DetailsStudent {
	static HashMap<Integer,Student> sMap=new HashMap<>();
	public static void main(String[] args){
		Student studentObj=new Student();
		studentObj.id(1);
		studentObj.name("abcd");
		studentObj.dateOfBirth(" sept 9 1996");
		studentObj.bloodGroup("A+");
		studentObj.height(12);
		studentObj.marks(97);
		int id=studentObj.getId();
		sMap.put(id, studentObj);
		for (Entry<Integer, Student> entry : sMap.entrySet()){
			System.out.println("Id: "+entry.getValue().getId());
			System.out.println("Name: "+entry.getValue().getName());
			System.out.println("Date of Birth: "+entry.getValue().getDateOfBirth());
			System.out.println("BloodGroup: "+entry.getValue().getBloodGroup());
			System.out.println("Height: "+entry.getValue().getHeight());
		}
	}

}
