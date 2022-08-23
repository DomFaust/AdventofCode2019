
public class Day4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min = 111122;
		int max = 111124;
		int count = 0;
		
		if(max > 999999) {
			max =  max - 999999;
		}
		
		for(int i = min; i < max; i++) {
			String rep = String.valueOf(i);
			int correctCount = 0;
			int doubleDigit = 0;
			int tripleCheck = 1;
			//int temp = 0;
			for(int j = 0; j < rep.length()-1; j++) {
				if(Integer.valueOf(rep.charAt(j)) < Integer.valueOf(rep.charAt(j+1))) {
					correctCount++;
				}
				else if(Integer.valueOf(rep.charAt(j)) == Integer.valueOf(rep.charAt(j+1))) {
					correctCount++;
					doubleDigit++;
					//temp = Integer.valueOf(rep.charAt(j+1));
					tripleCheck++;
				}
			}
			if(correctCount >= 5 && doubleDigit >=1 && (tripleCheck == 5 || tripleCheck%2 == 0)) {
				count++;
			}
			System.out.println(rep);
			System.out.println(correctCount);
			System.out.println(doubleDigit);
			System.out.println(tripleCheck);
		}
		System.out.println(count);

	}

}
