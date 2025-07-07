class Switch_Usecases{
	public static void main(String [] args){
		int score = 70;
		String status = switch(score){
			case 80, 90, 100 -> {
				if(score == 100){
					yield "Excellent";
				}else if(score == 90){
					yield "Very Good";
				}else{
					yield "Good";
				}
			}
			case 60, 70 -> {
				if(score == 70) {
					yield "Average";
				}else{
					yield "Below Average";
				}
			}
			default -> "Fail";			
		
		};
		System.out.print(status);
	}
}