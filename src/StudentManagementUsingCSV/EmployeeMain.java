package StudentManagementUsingCSV;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {
	private static final String COMMA = ",";
	public static void main(String[] args){

		int input;
		String[] EmployeeDetails;
		String[] parameters;
		//String addLine;
		System.out.println("Enter Value 0/1");
		InputStreamReader inputStreamReader=new InputStreamReader(System.in);
		BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
		try{
			String file="C:/Users/sahitha.shadamaki/files/EmployeeRecord.txt";
			BufferedReader br=new BufferedReader(new FileReader(file));
			FileWriter fileWriter=new FileWriter(file,true);
			BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
			input=Integer.parseInt(bufferedReader.readLine());
			List<DetailsEmployee> mylist=new ArrayList<>();
			do{
				switch(input){
				case 0:
					

					System.out.println("Add Employee Details");
					String line=bufferedReader.readLine();
					EmployeeDetails=line.split(COMMA);
					
					String currentLine;
					while((currentLine=br.readLine())!=null){
						String[] DetailsEmployee=currentLine.split(COMMA);
						if(DetailsEmployee.length>0){
							DetailsEmployee employeeObj=new DetailsEmployee(Integer.parseInt(EmployeeDetails[0]),EmployeeDetails[1],EmployeeDetails[2],EmployeeDetails[3],Integer.parseInt(EmployeeDetails[4]),Integer.parseInt(EmployeeDetails[5]));
							mylist.add(employeeObj);
						}
					}
					
					
					bufferedWriter.newLine();
					bufferedWriter.write(line);
					
					bufferedWriter.flush();
					System.out.println("new details added to file");
					input=Integer.parseInt(bufferedReader.readLine());
					break;
					
				case 1:
					
					System.out.println("enter id,name");
					String line1=bufferedReader.readLine();
					parameters=line1.split(COMMA);//id and name
					
					
					for(DetailsEmployee employee:mylist){
						int newId=employee.getId();
						String newName=employee.getName();
						if(newId==Integer.parseInt(parameters[0]) && newName.equals(parameters[1])){
							System.out.println("employee Details with Id:"+parameters[0]+" Name: "+parameters[1]);
							System.out.println("id: "+employee.getId());
							System.out.println("Name: "+employee.getName());
							System.out.println("Date of Birth: "+employee.getDateOfBirth());
							System.out.println("Blood Group: "+employee.getBloodGroup());
							System.out.println("Height: "+employee.getHeight());
							System.out.println("Experience: "+employee.getExperience());
							System.out.println("enter value 0/1: ");
							input=Integer.parseInt(bufferedReader.readLine());
							break;
						}
						/*else{
							System.out.println("there are no records with This ID&Name");
							break;
						}*/
					}

				}
				//System.out.println("enter value 0/1: ");
				//break;
			}while(true);
		}catch(NullPointerException e){
			//System.out.println(e);
			System.out.println("Entries Cannot be null");
		}
				catch(Exception e){
					System.out.println(e);
				}
			}
		
	}

