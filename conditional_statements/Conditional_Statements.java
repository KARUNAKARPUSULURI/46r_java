class Conditional_Statements {
	public static void main(String [] args){
	//find greatest of 3 numbers
		int a = 15;
		int b = 20;
		int c = 32; 
		int student_marks = 72;
		if(a > b && a > c){
			System.out.print("A is greater");
		}else{
			if(b > c && b > a){
				System.out.print("B is greater");
			}else{
                        	System.out.print("c is greater");	
			}
		}
		System.out.print("-----------------------------------------------------------------");	

		if(student_marks >= 90 && student_marks <= 100){
			System.out.print("Excellent");
		}else{
			if(student_marks >= 80 && student_marks <= 89){
			     System.out.print("Very good");
			}else{
				if(student_marks >= 70 && student_marks <= 79){
					System.out.print("Improvement needed");
				}else{
					if(student_marks >= 60 && student_marks <= 69){
					           System.out.print("close fail");
				        }else{
						System.out.print("fail");
					}
				}
			}
		}






	}
}

