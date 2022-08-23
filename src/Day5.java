import java.util.Scanner;

public class Day5 {


	public static void main(String[] args) {
		int opCode = 0;
		int pram1 = 0;
		int pram2 = 0;
		int i = 0;
		Scanner keyboard = new Scanner(System.in);
		int[] op = {3,225,1,225,6,6,1100,1,238,225,104,0,1102,9,19,225,1,136,139,224,101,-17,224,224,4,224,102,8,223,223,101,6,224,224,1,223,224,223,2,218,213,224,1001,224,-4560,224,4,224,102,8,223,223,1001,224,4,224,1,223,224,223,1102,25,63,224,101,-1575,224,224,4,224,102,8,223,223,1001,224,4,224,1,223,224,223,1102,55,31,225,1101,38,15,225,1001,13,88,224,1001,224,-97,224,4,224,102,8,223,223,101,5,224,224,1,224,223,223,1002,87,88,224,101,-3344,224,224,4,224,102,8,223,223,1001,224,7,224,1,224,223,223,1102,39,10,225,1102,7,70,225,1101,19,47,224,101,-66,224,224,4,224,1002,223,8,223,1001,224,6,224,1,224,223,223,1102,49,72,225,102,77,166,224,101,-5544,224,224,4,224,102,8,223,223,1001,224,4,224,1,223,224,223,101,32,83,224,101,-87,224,224,4,224,102,8,223,223,1001,224,3,224,1,224,223,223,1101,80,5,225,1101,47,57,225,4,223,99,0,0,0,677,0,0,0,0,0,0,0,0,0,0,0,1105,0,99999,1105,227,247,1105,1,99999,1005,227,99999,1005,0,256,1105,1,99999,1106,227,99999,1106,0,265,1105,1,99999,1006,0,99999,1006,227,274,1105,1,99999,1105,1,280,1105,1,99999,1,225,225,225,1101,294,0,0,105,1,0,1105,1,99999,1106,0,300,1105,1,99999,1,225,225,225,1101,314,0,0,106,0,0,1105,1,99999,1008,677,226,224,1002,223,2,223,1005,224,329,1001,223,1,223,107,226,677,224,1002,223,2,223,1006,224,344,101,1,223,223,1007,677,677,224,1002,223,2,223,1006,224,359,1001,223,1,223,8,677,226,224,102,2,223,223,1005,224,374,101,1,223,223,108,226,677,224,102,2,223,223,1006,224,389,1001,223,1,223,1008,677,677,224,1002,223,2,223,1006,224,404,1001,223,1,223,1107,677,677,224,102,2,223,223,1005,224,419,1001,223,1,223,1008,226,226,224,102,2,223,223,1005,224,434,101,1,223,223,8,226,677,224,1002,223,2,223,1006,224,449,101,1,223,223,1007,677,226,224,102,2,223,223,1005,224,464,1001,223,1,223,107,677,677,224,1002,223,2,223,1005,224,479,1001,223,1,223,1107,226,677,224,1002,223,2,223,1005,224,494,1001,223,1,223,7,677,677,224,102,2,223,223,1006,224,509,101,1,223,223,1007,226,226,224,1002,223,2,223,1005,224,524,101,1,223,223,7,677,226,224,102,2,223,223,1005,224,539,101,1,223,223,8,226,226,224,1002,223,2,223,1006,224,554,101,1,223,223,7,226,677,224,102,2,223,223,1005,224,569,101,1,223,223,1108,677,226,224,1002,223,2,223,1005,224,584,101,1,223,223,108,677,677,224,1002,223,2,223,1006,224,599,101,1,223,223,107,226,226,224,1002,223,2,223,1006,224,614,101,1,223,223,1108,226,226,224,1002,223,2,223,1005,224,629,1001,223,1,223,1107,677,226,224,1002,223,2,223,1005,224,644,101,1,223,223,108,226,226,224,1002,223,2,223,1005,224,659,101,1,223,223,1108,226,677,224,1002,223,2,223,1005,224,674,1001,223,1,223,4,223,99,226};

		//int[] op = {1101,100,-2,4,0,3,1,99};

		while(i < op.length && op[i] != 99) {
			//System.out.println("Index: "+i);
			//System.out.println("OP: "+op[i]);

			if(String.valueOf(op[i]).length() == 4) {
				String rep = String.valueOf(op[i]);
				opCode = Integer.parseInt(""+rep.charAt(2)+ rep.charAt(3));
			
				if(opCode > 4) {
					
					opCode = op[i];
					pram1 = 0;
					pram2 = 0;
				}
				else {
					//System.out.println("TEMP: "+opCode);
					//rep = "0"+rep;
					//System.out.println(rep);
					pram1 = Integer.parseInt(""+rep.charAt(1));
					pram2 = Integer.parseInt(""+rep.charAt(0));
				}
			}
			else if(String.valueOf(op[i]).length() == 3) {
				String rep = String.valueOf(op[i]);
				opCode = Integer.parseInt(""+rep.charAt(1)+ rep.charAt(2));
			
				if(opCode > 4) {
					
					opCode = op[i];
					pram1 = 0;
					pram2 = 0;
				}
				else {
					//System.out.println("TEMP: "+opCode);
					//rep = "0"+rep;
					//System.out.println(rep);
					pram1 = Integer.parseInt(""+rep.charAt(0));
					pram2 = 0;
				}
			}
			else {
				opCode = op[i];
				pram1 = 0;
				pram2 = 0;
			}
			//System.out.println(opCode);
			switch(opCode) {
			//case 99:
				//break;
			case 1:
				int sum = 0;
				int add1 = op[i+1];
				int add2 = op[i+2];
				int where = op[i+3];

				switch(pram1) {
				case 1:
					sum += add1;
					break;
				case 0:
					sum += op[add1];
					break;
				}

				switch(pram2) {
				case 1:
					sum += add2;
					break;
				case 0:
					sum += op[add2];
					break;

				}
				op[where] = sum;
				i+=4;
				break;
			case 2:
				int pro = 1;
				add1 = op[i+1];
				add2 = op[i+2];
				where = op[i+3];


				switch(pram1) {
				case 1:
					pro *= add1;
					break;
				case 0:
					pro *= op[add1];
					break;
				}

				switch(pram2) {
				case 1:
					pro *= add2;
					break;
				case 0:
					pro *= op[add2];
					break;

				}
				op[where] = pro;
				i+=4;
				break;
			case 3:
				System.out.println("Enter an integer: ");
				int myInt = keyboard.nextInt();
				where = op[i+1];
				op[where] = myInt;
				i+=2;
				break;
			case 4:
				where = op[i+1];
				System.out.println(op[where]);
				i+=2;
				break;
			default:
				i++;
				break;
			}
			//i++;
		}


		System.out.println();
		for(int j = 0; j < op.length; j++) {
			System.out.print(op[j]+" ");

		}
	}
}


