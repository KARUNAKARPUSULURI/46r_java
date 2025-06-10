class StudentDetails{
	static String collegeName = "Karunya University";
	int rollNo;
	StudentDetails(int idNo){
		rollNo = idNo;
	}
	
	public void displayInfo(){
		String name = "Gowtham";
		int age = 23;
		String batch = "46r";
		System.out.print("StudentName : " + name);
		System.out.print("StudentAge : " + age);
		System.out.print("batch : " + batch);
		System.out.print("Roll No : " + rollNo);
	}
	public static void main(String[] args){
		StudentDetails s1 = new StudentDetails(101);// {rollNo, displayInfo}
		StudentDetails s2 = new StudentDetails(102);// rollNo, displayInfo
		
		System.out.print(StudentDetails.collegeName + s1.rollNo);
		System.out.print(StudentDetails.collegeName + s2.rollNo);
		
		StudentDetails.collegeName = "KLU";

		System.out.print(StudentDetails.collegeName + s1.rollNo);
		System.out.print(StudentDetails.collegeName + s2.rollNo);
		s1.displayInfo();
		s2.displayInfo();
	}
}


