class InstanceVariable{
	String student_name = "Madhava";
	int student_age = 23;
	String gender = "Male";
	int pin_code = 500085;
	public static void main(String[] args){
		InstanceVariable student_details = new InstanceVariable();
		System.out.println("Student Name : " + student_details.student_name);
		System.out.println("Student Age : " + student_details.student_age);
		System.out.println("Student Gender : " + student_details.gender);
		System.out.println("Student Pincode : " + student_details.pin_code);
		student_details.student();
	};
       
}

class InstanceVariable{
	String student_name = "Madhava";
	int student_age = 23;
	String gender = "Male";
	int pin_code = 500085;
	
	public static void main(String[] args){
		InstanceVariable student_details = new InstanceVariable();
		System.out.println("Student Name : " + student_details.student_name);
		System.out.println("Student Age : " + student_details.student_age);
		System.out.println("Student Gender : " + student_details.gender);
		System.out.println("Student Pincode : " + student_details.pin_code);
		student_details.student(); // Call the method on the instance
	}
	
	public void student(){ // Added parentheses
		System.out.println("Student Name : " + student_name);
	}
}