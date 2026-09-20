package Main;

public class MyBigNumber {

	public String sum(String stn1, String stn2) {
		
		int i = stn1.length()- 1 ; 
		int j = stn2.length() - 1 ; 
		
		int temp = 0;
		
		StringBuilder result  = new StringBuilder();
		
		
		int step = 1;
		while( i >= 0 || j >= 0 || temp > 0) {
			
			// lấy từng con số 
			int getS1 = (i >= 0) ? stn1.charAt(i)- '0':0;
			int getS2 = (j >= 0) ? stn2.charAt(j)- '0':0;
			
			
			int sum = getS1 + getS2 + temp; 
						
			int getResult = sum%10;
			
			int newTemp = sum/10;
			
			System.out.println("Bước: "+ step +" lấy số " +getS1+" cộng "+getS2+" nhớ "+temp+" = "+sum+" ghi "+getResult+",nhớ "+newTemp);
			
			result.insert(0, getResult);
			
			temp=newTemp;
			
			i--; 
			j--; 
				
			step++;
			
			}
		return result.toString();
		}
			 
	}

