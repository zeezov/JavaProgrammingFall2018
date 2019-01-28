package mentoring;

public class IntToString_10_17_18 {
	public static void main(String[] args) {
		
		printAsString(9);
		
		
	}
	
	public static void printAsString(int num) {
        String[] root = {"","one","two","three","four","five","six","seven","eight","nine"};
        
        String[] tenToNintine = {"","eleven","twelve","thirteen",
                "fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        
        String[] tens = {"","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
        
        String zero = "zero";
        String hundred = "hundred";
        String thousend = "thousand";
        
       
     
        if(num > 0 && num <= 9) {
            
               System.out.println(root[num]); 
               
        }else if(num >= 10 && num <= 19){
            
               if(num == 10) {  
                 System.out.println(tens[1]);                
           }else {
            System.out.println(tenToNintine[num%10]);
           }
   
            }else if(num >= 20 && num <= 99) {
                
                String firstDigit = tens[num/10];
                String secondDigit = root[num%10];
                System.out.println(firstDigit+" "+secondDigit);
    
            }else if(num >= 100 && num <= 999) {
                // 9 9 1
                String hDigit = root[num/100] + " " + hundred;
                int tNum = num%100;
                String tDigit = tens[tNum/10];
                int rNum = tNum%10;
                String rDigit = root[rNum];
                System.out.println(hDigit+" "+tDigit +" "+rDigit);
                
            }else if(num == 1000) {
                System.out.println(thousend);
            }else if(num == 0){
                System.out.println(zero);
            }else {
                System.out.println("Invalid number");
            }
    }

}
