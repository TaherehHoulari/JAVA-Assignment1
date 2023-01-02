//22F CST8284
//Assignment 1: MyHealthData.java
import java.time.LocalDate;
/**
 * @author SeyedehTahereh Houlari
 * @see java.time.LocalDate
 * @version 1.0
 */

public class MyHealthData {

	static LocalDate local =  LocalDate.now();
	//This system maintains important health information about a patient.
	//Note: This class assumes values passed to the set methods are correct.
	// REVIEW THIS FILE AND ASSIGNMENT INSTRUCTIONS CAREFULLY BEFORE YOU START OFF!!


	//TO DO 1: INCLUDE YOUR ATTRIBUTES HERE. REMEMBER TO CHECK THE UML CLASS DIAGRAM TO INCLUDE ALL ATTRIBUTES LISTED AND THEIR TYPES.

	//START CODE
	/**
	 * first Name component of the patients information of MyHealthData.
	 */
		private	String firstName;
		/**
		 *last Name component of the patients information of MyHealthData.
		 */
		private	String lastName;
		/**
		 * Gender component of the patients information of MyHealthData.
		 */
		private	String gender;
		/**
		 * Birth Year component of the patients information of MyHealthData.
		 */
		private	int birthYear;
		/**
		 * Current Year component of the patients information of MyHealthData.
		 */
		private	int currentYear;
		/**
		 * Height component of the patients information of MyHealthData.
		 * The unit of height is inch.
		 */
		private	double height;
		/**
		 * Weight component of the patients information of MyHealthData.
		 * The unit of Weight is pound.
		 */
		private	double weight;
	//END CODE
		/**
		 * 
		 * @param firstName First Name component of the patients information of MyHealthData.
		 * @param lastName last Name component of the patients information of MyHealthData.
		 * @param gender Gender component of the patients information of MyHealthData.
		 * @param birthYear Birth Year component of the patients information of MyHealthData.
		 * @param currentYear Current Year component of the patients information of MyHealthData.
		 * @param height Height(inches) component of the patients information of MyHealthData.
		 * @param weight Weight(pound) component of the patients information of MyHealthData.
	 */

	// TO DO 2: INCLUDE YOUR CONSTRUCTOR HERE 
	//START CODE
		public MyHealthData(String firstName,String lastName,String gender, int birthYear,int currentYear, double height, double weight){
			
			this.firstName = firstName;
			this.lastName = lastName;
			this.gender = gender;
			this.birthYear = birthYear;
			this.currentYear = currentYear;
			this.height = height;
			this.weight = weight;	
			
		}
	//END CODE



	//TO DO 3: INCLUDE YOUR SET AND GET METHODS HERE. CHECK THE UML CLASS TO ENSURE ALL ARE COMPLETE. SOME ARE ALREADY PROVIDED FOR YOU BELOW.
		/**
		 * @return the firstName for MyHealthData.
		 */
		public String getFirstName() {
			return firstName;
		}

		/**
		 * @param firstName The firstName for MyHealthData.
		 */

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}


		/**
		 * @return the lastName for MyHealthData.
		 */
		public String getLastName() {
			return lastName;
		}


		/**
		 * @param lastName The lastName for MyHealthData.
		 */
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		/**
		 * @return the gender for MyHealthData.
		 */

		public String getGender() {
			return gender;
		}

		/**
		 * @param gender The gender for MyHealthData.
		 */

		public void setGender(String gender) {
			this.gender = gender;
		}

		/**
		 * @return the birthYear for MyHealthData.
		 */

		public int getBirthYear() {
			return birthYear;
		}


		/**
		 * @param birthYear The birthYear for MyHealthData.
		 */
		public void setBirthYear(int birthYear) {
			this.birthYear = birthYear;
		}


		/**
		 * @return the currentYear for MyHealthData.
		 */
		public int getCurrentYear() {
			return currentYear;
		}


		/**
		 * @param currentYear The currentYear for MyHealthData.
		 */
		public void setCurrentYear(int currentYear) {
			this.currentYear = currentYear;
		}


		/**
		 * @return the height for MyHealthData.
		 */
		public double getHeight() {
			return height;
		}


		/**
		 * @param height The height for MyHealthData.
		 */
		public void setHeight(double height) {
			this.height = height;
		}


		/**
		 * @return the weight for MyHealthData.
		 */
		public double getWeight() {
			return weight;
		}


		/**
		 * @param weight The weight for MyHealthData.
		 */
		public void setWeight(double weight) {
			this.weight = weight;
		}

	// THIS RETURNS THE PATIENT'S Body Mass Index (BMI) AND IT IS PROVIDED HERE FOR YOU. DO NOT CHANGE THIS PIECE OF CODE!
		/**
		 * @return the BMI for MyHealthData.
		 */

	public double getBMI() {
	   return (getWeight() * 703) / (getHeight() * getHeight());
	} 

	// TO DO 4: THIS PORTION OF CODE SHOULD DISPLAY ALL THE PATIENT'S HEALTH DATA. DO NOT MISS ANY DATA / INFORMATION
	/**
	 * @return the age for MyHealthData.
	 */
	public int getAge() {
		int currentYear = local.getYear();
		int age=currentYear-birthYear;
		return age;
	}

	/**
	 * @return the MaximumHeartRate for MyHealthData.
	 */
	public int getMaximumHeartRate() {
		 int maxRate=220-getAge();
		   return maxRate;
	}

	/**
	 * @return the MinimumTargetHeartRate for MyHealthData.
	 */
	public double getMinimumTargetHeartRate() {
		//double getMinimumTargetHeartRate=(double)(getMaximumHeartRate()*(50.0f/100.0f));
		double minRate=(getMaximumHeartRate())/2;
		return minRate;
	}
	/**
	 * @return the MaximumTargetHeartRate for MyHealthData.
	 */
	public double getMaximumTargetHeartRate() {
		double MaxTargetRate=(getMaximumHeartRate())*(0.85);
		return MaxTargetRate;
	}

	public void displayMyHealthData() 
	{ 

	//TO DO 5: HINT: YOU MUST USE System.out.printf TO SHOW ALL HEALTH DATA. DO NOT MISS ANY ITEM.
	   
	// START CODE
		System.out.println("The Patient's information is as follows:");
		System.out.printf("Full Name is %s %s \n",getFirstName(), getLastName() );
		System.out.printf("Gender is %s \n", getGender() );
		System.out.printf("Height is %f \n", getHeight() );
		System.out.printf("Weight is %f \n", getWeight() );
		System.out.printf("Age is %d \n", getAge() );
		System.out.printf("MaximumHeartRate is %d \n", getMaximumHeartRate());
		System.out.printf("MinimumTargetHeartRate is %f \n", getMinimumTargetHeartRate());
		System.out.printf("MaximumTargetHeartRate is %f \n", getMaximumTargetHeartRate());
		System.out.printf("BMI is %f \n", getBMI());
		
		
	//END CODE
	   
	//DO NOT MODIFY THIS PROTION OF CODE. IT SHOULD PRINT AS IT IS - ALREADY PROVIDED FOR YOU!!

	   System.out.println("BMI VALUES");
	   System.out.println("Underweight: less than 18.5");
	   System.out.println("Normal:      between 18.5 and 24.9");
	   System.out.println("Overweight:  between 25 and 29.9");
	   System.out.println("Obese:       30 or greater");   
	} 

	} // end class MyHealthData

