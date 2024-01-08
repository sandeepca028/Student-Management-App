package StudentMang;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.student.Student;
import com.student.*;

import java.io.*;

public class StartStudent {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Student Management App");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.println("Press 1 to ADD Student	");
			System.out.println("Press 2 to Delete Student");
			System.out.println("Press 3 to Display Student");
			System.out.println("Press 4 to Exit the App");
			
			int c = Integer.parseInt(br.readLine());
			
			if(c ==1) {
				System.out.println("Enter user name: ");
				String name = br.readLine();
				
				System.out.println("Enter user phone: ");
				String phone = br.readLine();
				
				System.out.println("Enter user city: ");
				String city = br.readLine();
				
				Student st = new Student(name, phone, city);
				boolean answer = StudentDao.insertStudentToDB(st);
				if(answer) {
					System.out.println("Student is added Successfuly");
				} else {
					System.out.println("Somethis wend wrong");
				}
				System.out.println(st);
				
			}else if(c ==2){
				
			}else if(c ==3){
				
			}else if(c ==4){
				break;
			}else {
				
			}
			
		}System.out.println("Thank you for using this App");
	}

}
