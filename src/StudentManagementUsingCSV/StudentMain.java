package StudentManagementUsingCSV;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StudentMain {
	private static final String COMMA = ",";
	public static void main(String[] args) throws NumberFormatException, IOException{

		int input;
		String[] StudentDetails;
		String[] EmployeeDetails;
		String[] parameters;
		String[] empParameters;
		String[] medParam;
		String line="";
		String lineEmp="";
		String line1="";
		String line2="";
		String medLine="";
		int studCount = 0;
		int empCount=0;
		//String addLine;
		System.out.println("Add Student Details-0|Read Student Details-1|Add Employee Details-2|Read Employee Details-3|Medical Benifits-4");
		InputStreamReader inputStreamReader=new InputStreamReader(System.in);
		BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
		//BufferedReader empBufferedReader=new BufferedReader(inputStreamReader);
		input=Integer.parseInt(bufferedReader.readLine());

		String file="C:/Users/sahitha.shadamaki/files/StudentRecord.txt";
		String empFile="C:/Users/sahitha.shadamaki/files/EmployeeRecord.txt";
		List<DetailsStudent> mylist=new ArrayList<>();
		List<DetailsEmployee> empList=new ArrayList<>();
		String currLine;
		String empline;
		BufferedReader br=new BufferedReader(new FileReader(file));
		FileWriter fileWriter=new FileWriter(file,true);
		BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);


		BufferedReader Empreader=new BufferedReader(new FileReader(empFile));
		FileWriter empFileWriter=new FileWriter(empFile,true);
		BufferedWriter empBufferedWriter=new BufferedWriter(empFileWriter);


		while((currLine=br.readLine())!=null){
			String[] detailsStudent=currLine.split(COMMA);
			if(detailsStudent.length>0){
				DetailsStudent studentObj=new DetailsStudent(Integer.parseInt(detailsStudent[0]),detailsStudent[1],detailsStudent[2],detailsStudent[3],Integer.parseInt(detailsStudent[4]),Integer.parseInt(detailsStudent[5]));
				mylist.add(studentObj);
			}
		}

		while((empline=Empreader.readLine())!=null){
			String[] DetailsEmployee=empline.split(COMMA);
			if(DetailsEmployee.length>0){
				DetailsEmployee employeeObj=new DetailsEmployee(Integer.parseInt(DetailsEmployee[0]),DetailsEmployee[1],DetailsEmployee[2],DetailsEmployee[3],Integer.parseInt(DetailsEmployee[4]),Integer.parseInt(DetailsEmployee[5]));
				empList.add(employeeObj);
			}
		}
		do{
			try{

				switch(input){

				case 0:

					//String[] StudentDetails = null;
					System.out.println("Add Student Details");
					System.out.println("Student Id: ");
					line=line+bufferedReader.readLine()+",";
					System.out.println("Student Name: ");
					line=line+bufferedReader.readLine()+",";
					System.out.println("Student Date-of-Birth: ");
					line=line+bufferedReader.readLine()+",";
					System.out.println("Student Blood Group: ");
					line=line+bufferedReader.readLine()+",";
					System.out.println("Student Height: ");
					line=line+bufferedReader.readLine()+",";
					System.out.println("Student Marks: ");
					line=line+bufferedReader.readLine();

					StudentDetails=line.split(COMMA);
					
					if((StudentDetails[0]==null) || (StudentDetails[1]==null) || (StudentDetails[2]==null) || (StudentDetails[3]==null) || (StudentDetails[4]==null) || (StudentDetails[5]==null)){
						throw new NullPointerException();
					}
					for(DetailsStudent s:mylist){
						System.out.println(s);
					}
					for(DetailsStudent stud:mylist){
						System.out.println("Inside for loop");
						int dupId=stud.getId();
						if(dupId==Integer.parseInt(StudentDetails[0])){
							
							throw new MyException("Entry with this StudentID exists");
						}
						System.out.println("Inside for loop");
					}
					if(Integer.parseInt(StudentDetails[5])>100){
						throw new ArithmeticException();
					}

					DetailsStudent studentObj=new DetailsStudent(Integer.parseInt(StudentDetails[0]),StudentDetails[1],StudentDetails[2],StudentDetails[3],Integer.parseInt(StudentDetails[4]),Integer.parseInt(StudentDetails[5]));
					mylist.add(studentObj);
					//addLine=line;
					bufferedWriter.newLine();
					bufferedWriter.write(line);

					bufferedWriter.flush();
					System.out.println("New details added to file");
					System.out.println("Add Student Details-0|Read Student Details-1|Add Employee Details-2|Read Employee Details-3|Medical Benifits-4");
					input=Integer.parseInt(bufferedReader.readLine());
					break;

				case 1:
					System.out.println("Get Student Details of: ");
					System.out.println("Student Id: ");
					line1=line1+bufferedReader.readLine()+",";
					System.out.println("Student Name: ");
					line1=line1+bufferedReader.readLine();
					parameters=line1.split(COMMA);//id and name


					for(DetailsStudent student:mylist){
						int newId=student.getId();
						String newName=student.getName();
						studCount=0;
						if(newId==Integer.parseInt(parameters[0]) && newName.equals(parameters[1])){
							studCount++;
							System.out.println("Student Details with Id:"+parameters[0]+" Name: "+parameters[1]);
							System.out.println("id: "+student.getId());
							System.out.println("Name: "+student.getName());
							System.out.println("Date of Birth: "+student.getDateOfBirth());
							System.out.println("Blood Group: "+student.getBloodGroup());
							System.out.println("Height: "+student.getHeight());
							System.out.println("Marks: "+student.getMarks());
							System.out.println("Add Student Details-0|Read Student Details-1|Add Employee Details-2|Read Employee Details-3|Medical Benifits-4");
							input=Integer.parseInt(bufferedReader.readLine());
							break;
						}

					}
					if(studCount==0){
						throw new MyException("No Entries with this StudentID&Name");
					}
					break;
				case 2:

					System.out.println("Add Employee Details");
					System.out.println("Employee Id: ");
					lineEmp=lineEmp+bufferedReader.readLine()+",";
					System.out.println("Employee Name: ");
					lineEmp=lineEmp+bufferedReader.readLine()+",";
					System.out.println("Employee Date-of-Birth: ");
					lineEmp=lineEmp+bufferedReader.readLine()+",";
					System.out.println("Employee Blood Group: ");
					lineEmp=lineEmp+bufferedReader.readLine()+",";
					System.out.println("Employee Height: ");
					lineEmp=lineEmp+bufferedReader.readLine()+",";
					System.out.println("Employee Experience: ");
					lineEmp=lineEmp+bufferedReader.readLine();
					EmployeeDetails=lineEmp.split(COMMA);
					if((EmployeeDetails[0])==null || (EmployeeDetails[1])==null ||(EmployeeDetails[2])==null || (EmployeeDetails[3])==null || (EmployeeDetails[4])==null || (EmployeeDetails[5])==null ){
						throw new NullPointerException();
					}
					for(DetailsEmployee emp:empList){
						int dupEmpId=emp.getId();
						if(dupEmpId==Integer.parseInt(EmployeeDetails[0])){
							throw new MyException("Entry with this EmployeeID Exists");
						}
					}
					DetailsEmployee employeeObj=new DetailsEmployee(Integer.parseInt(EmployeeDetails[0]),EmployeeDetails[1],EmployeeDetails[2],EmployeeDetails[3],Integer.parseInt(EmployeeDetails[4]),Integer.parseInt(EmployeeDetails[5]));
					empList.add(employeeObj);
					empBufferedWriter.newLine();
					empBufferedWriter.write(lineEmp);

					empBufferedWriter.flush();
					System.out.println("New Employee details added to file");
					System.out.println("Add Student Details-0|Read Student Details-1|Add Employee Details-2|Read Employee Details-3|Medical Benifits-4");
					input=Integer.parseInt(bufferedReader.readLine());
					break;

				case 3:
					System.out.println("Get Employee Details of: ");
					System.out.println("Employee Id: ");
					line2=line2+bufferedReader.readLine()+",";
					System.out.println("Employee Name: ");
					line2=line2+bufferedReader.readLine();
					empParameters=line2.split(COMMA); //id and name


					for(DetailsEmployee employee:empList){
						int empId=employee.getId();
						String empName=employee.getName();
						empCount=0;
						if(empId==Integer.parseInt(empParameters[0]) && empName.equals(empParameters[1])){
							empCount++;
							System.out.println("employee Details with Id:"+empParameters[0]+" Name: "+empParameters[1]);
							System.out.println("id: "+employee.getId());
							System.out.println("Name: "+employee.getName());
							System.out.println("Date of Birth: "+employee.getDateOfBirth());
							System.out.println("Blood Group: "+employee.getBloodGroup());
							System.out.println("Height: "+employee.getHeight());
							System.out.println("Experience: "+employee.getExperience());
							System.out.println("Add Student Details-0|Read Student Details-1|Add Employee Details-2|Read Employee Details-3|Medical Benifits-4");
							input=Integer.parseInt(bufferedReader.readLine());
							break;
						}
					}
					if(empCount==0){
						throw new MyException("No Entries with this EmployeeID&Name");
					}
					break;
				case 4:
					System.out.println("provide medical benifits for: ");
					System.out.println("Employee id: ");
					medLine=medLine+bufferedReader.readLine()+",";
					System.out.println("Employee name: ");
					medLine=medLine+bufferedReader.readLine();
					medParam=medLine.split(COMMA);

					for(DetailsEmployee medEmp:empList){
						int medId=medEmp.getId();
						String medName=medEmp.getName();
						if(medId==Integer.parseInt(medParam[0]) && medName.equals(medParam[1])){
							System.out.println("Medical benifits provided for employee Id:"+medParam[0]+" Name: "+medParam[1]+" whose");
							System.out.println("Blood Group is "+medEmp.getBloodGroup());
							System.out.println("Height is "+medEmp.getHeight());
							System.out.println("Add Student Details-0|Read Student Details-1|Add Employee Details-2|Read Employee Details-3|Medical Benifits-4");
							input=Integer.parseInt(bufferedReader.readLine());
							break;
						}
					}

				}
			}catch(NullPointerException e){
				//System.out.println(e);
				System.out.println("Entries Cannot be null");
			}catch(NumberFormatException e){ 
				System.out.println(e);
			}
			catch(ArithmeticException e){
				System.out.println(e);
				System.out.println("Error! Marks out of 100");
			}
			catch(Exception e){
				System.out.println(e);
			}
		}while(true);

	}

}

class MyException extends Exception{
	public MyException(String message){
		super(message);
	}
}
