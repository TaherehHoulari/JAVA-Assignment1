import java.util.Scanner;
/**
 * This is the driver class for this program. This means that it just runs the application with a method
 * main.
 * @author SeyedehTahereh Houlari
 * @see  java.util.Scanner
 * @version 1.0
 * @since 11
 */

public class MyHealthDataTest {
	
	/**
	 * @param args
	 * consider the main method in the class MyHealthDataTest to calculate what we need in Assignment01
	 */
	
	
	public static void main(String[] args) {
		
		MyHealthData patientInfo=new MyHealthData("firstName", "lastName", "gender", 1, 1, 1, 1);
		Scanner scan = new Scanner(System.in);

		
		
		System.out.print("patient’s First Name is ");
		patientInfo.setFirstName(scan.next());
		
		System.out.print("patient’s Last Name is ");
		patientInfo.setLastName(scan.next());
		
		System.out.print("patient’s Gender is ");
		patientInfo.setGender(scan.next());
		
		System.out.print("patient’s Birth Year is ");
		patientInfo.setBirthYear(scan.nextInt());
		
		System.out.print("patient’s Current Year is ");
		patientInfo.setCurrentYear(scan.nextInt());
		
		System.out.print("patient’s Hight is ");
		patientInfo.setHeight(scan.nextDouble());
		
		System.out.print("patient’s Weight is ");
		patientInfo.setWeight(scan.nextDouble());
		
		System.out.println();
		
		
		
		patientInfo.displayMyHealthData();

		
	}
	

}
