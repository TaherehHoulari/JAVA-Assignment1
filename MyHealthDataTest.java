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

		
		
		System.out.print("patientís First Name is ");
		patientInfo.setFirstName(scan.next());
		
		System.out.print("patientís Last Name is ");
		patientInfo.setLastName(scan.next());
		
		System.out.print("patientís Gender is ");
		patientInfo.setGender(scan.next());
		
		System.out.print("patientís Birth Year is ");
		patientInfo.setBirthYear(scan.nextInt());
		
		System.out.print("patientís Current Year is ");
		patientInfo.setCurrentYear(scan.nextInt());
		
		System.out.print("patientís Hight is ");
		patientInfo.setHeight(scan.nextDouble());
		
		System.out.print("patientís Weight is ");
		patientInfo.setWeight(scan.nextDouble());
		
		System.out.println();
		
		
		
		patientInfo.displayMyHealthData();

		
	}
	

}
