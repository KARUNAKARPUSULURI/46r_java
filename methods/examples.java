class Main {
    
    public String printingOddChars(String str){
        String oddChar = "";
        for(int i = 0; i < str.length(); i++){
            if(i % 2 == 1){
                oddChar = oddChar + str.charAt(i);
            }
        } 
        return oddChar;
    }
    
    public int countingChars(String str){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            count++;
        }
        return count;
    }
    
    public String removeSpaces(String str){
        String trimmedStr = "";
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ' '){
                trimmedStr += str.charAt(i);
            }
        }
        return trimmedStr;
    }
    
    public static void main(String[] args) {
        Main example = new Main();
        String res = example.printingOddChars("madam");
        int res2 = example.countingChars(res);
        String rmspe = example.removeSpaces("  e n   g  ");
        System.out.println(rmspe);
    }
}







