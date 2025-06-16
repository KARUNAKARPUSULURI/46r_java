class Student_Marks{
	public static void main(String [] args){
		int telugu = 90;
		int hindi = 75;
		int english = 34;
		int maths = 98;
		int social = 65;
		int physics = 90;
		int total_marks = telugu + hindi + english + maths + social + physics;
		System.out.println("Total Marks : " + total_marks);
		System.out.println(telugu >= 35 ? "Subject Passed" : "Failed");
		System.out.println(hindi >= 35 ? "Subject Passed" : "Failed");				System.out.println(english >= 35 ? "Subject Passed" : "Failed");			System.out.println(maths >= 35 ? "Subject Passed" : "Failed");				System.out.println(physics >= 35 ? "Subject Passed" : "Failed");			System.out.println(social >= 35 ? "Subject Passed" : "Failed");
		System.out.println(total_marks >= 580 ? "A class" : "B class");
		double cgpa = (total_marks/6) * 0.1;
		System.out.println("cgpa : " + cgpa);
	}
}





