import java.util.Scanner; 

public class family {
	
	private static double cals; 
	private static double vitA; 
	private static double vitC; 
	private static double vitK; 
	private static double iron; 
	private static double calci; 
	private static double prot; 
	private static double potas; 
	
	public family() {
		
		cals = 0; 
		vitA = 0; 
		vitC = 0; 
		vitK = 0; 
		iron = 0; 
		calci = 0; 
		prot = 0; 
		potas = 0; 
		
	}

	public static void main(String[] args) {
		
		System.out.println("Type in the number of people in your family: "); 
		
		Scanner people = new Scanner(System.in); 
		
		String numpeople = people.nextLine(); 
		
		int fam = Integer.parseInt(numpeople); 
		
		for( int i = 0; i < fam; i++) {
			
			System.out.println("Type in the age of a family member (if their age is above two): "); 
			Scanner input = new Scanner(System.in);
			String age = input.nextLine(); 
			int numage = Integer.parseInt(age); 
			
			// all of the values are based off of canada's food guide 
			/** weight and activity level of lifestyle is not considered for the data, it 
			 * for the future we would have options to consider this and it would change the result
			 */ //for children 
			if (numage < 2) {
				System.out.println("This child is too young to comsume the plants. Please re-enter an age."); 
				i--;  
			} else if(2 <= numage && numage <= 3) {
				cals = cals + 1000; 
				vitA = vitA + 0.0003; 
				vitC = vitC + 0.015; 
				vitK = vitK + 0.00003; 
				iron = iron + 0.007; 
				calci = calci + 0.7; 
				prot = prot + 13; 
				potas = potas + 3; 
				 
			} else if (4 <= numage && numage <= 8){
				cals = cals + 1400; 
				vitA = vitA + 0.0004; 
				vitC = vitC + 0.025; 
				vitK = vitK + 0.000055; 
				iron = iron + 0.01; 
				calci = calci + 1.0; 
				prot = prot + 19; 
				potas = potas + 3.8; 
				
			}else if (9 <= numage && numage <= 13){
				cals = cals + 1700; 
				vitA = vitA + 0.0006; 
				vitC = vitC + 0.045; 
				vitK = vitK + 0.00006; 
				iron = iron + 0.008; 
				calci = calci + 1.3; 
				prot = prot + 34; 
				potas = potas + 4.5;  
				 
			}else if (14 <= numage && numage <= 18){ // for teens
				System.out.println("Type in the gender (either M or F): "); 
				Scanner inp = new Scanner(System.in);
				String gender = inp.nextLine(); 
				char gen = gender.charAt(0);
				System.out.println(gen); 
				while(gen != 'F' && gen != 'M') {
					System.out.println("you did not type M or F, try again."); 
					Scanner inp2 = new Scanner(System.in);
					String gender2 = inp2.nextLine(); 
					gen = gender2.charAt(0);
				}
				if (gen == 'F') {
					cals = cals + 1800; 
					vitA = vitA + 0.0007; 
					vitC = vitC + 0.065; 
					vitK = vitK + 0.000075; 
					iron = iron + 0.015; 
					calci = calci + 1.3; 
					prot = prot + 46; 
					potas = potas + 4.7; 
					 
				}else {
					cals = cals + 2700; 
					vitA = vitA + 0.0009; 
					vitC = vitC + 0.075; 
					vitK = vitK + 0.000075; 
					iron = iron + 0.011; 
					calci = calci + 1.3; 
					prot = prot + 52; 
					potas = potas + 4.7;  
				
				}
			}else if (19 <= numage && numage <= 50) { //for adults 
				System.out.println("Type in the gender (either M or F): "); 
				Scanner inp = new Scanner(System.in);
				String gender = inp.nextLine(); 
				char gen = gender.charAt(0); 
				while(gen != 'F' && gen != 'M') {
					System.out.println("you did not type M or F, try again."); 
					Scanner inp2 = new Scanner(System.in);
					String gender2 = inp2.nextLine(); 
					gen = gender2.charAt(0);
				}
				if (gen == 'F') {
					cals = cals + 2000; 
					vitA = vitA + 0.0007; 
					vitC = vitC + 0.075; 
					vitK = vitK + 0.00009; 
					iron = iron + 0.018; 
					calci = calci + 1.0; 
					prot = prot + 46; 
					potas = potas + 2.320; 
					 
				}else {
					cals = cals + 2500; 
					vitA = vitA + 0.0009; 
					vitC = vitC + 0.09; 
					vitK = vitK + 0.00012; 
					iron = iron + 0.008; 
					calci = calci + 1.0; 
					prot = prot + 56; 
					potas = potas + 3.016;  
					 
				}
			}else if (numage >= 51){
				System.out.println("Type in the gender (either M or F): "); 
				Scanner inp = new Scanner(System.in);
				String gender = inp.nextLine(); 
				char gen = gender.charAt(0);
				char fchar = 'F';
				char mchar = 'M';
				while(gen != fchar && gen != mchar) {
					System.out.println("you did not type M or F, try again."); 
					Scanner inp2 = new Scanner(System.in);
					String gender2 = inp2.nextLine(); 
					gen = gender2.charAt(0); 
				}
				if (gen == 'F') {
					cals = cals + 1800; 
					vitA = vitA + 0.0007; 
					vitC = vitC + 0.075; 
					vitK = vitK + 0.00009; 
					iron = iron + 0.008; 
					calci = calci + 1.2; 
					prot = prot + 55; 
					potas = potas + 4.7;  
					 
				}else {
					cals = cals + 2200; 
					vitA = vitA + 0.0009; 
					vitC = vitC + 0.09; 
					vitK = vitK + 0.00012; 
					iron = iron + 0.008; 
					calci = calci + 1.0; 
					prot = prot + 65; 
					potas = potas + 4.7;  
	 
				}
			}
			
		}
		
		System.out.printf("The daily needed intake of the family is:\n"+cals+" calories \n"+vitA+" Grams of vitamin A \n"+vitC+" Grams of vitamin C \n"+vitK+" Grams of vitamin K \n"+iron+" Grams of iron \n"+calci+" Grams of calcium\n"+prot+" Grams of protein\n"+potas+" Grams of potassium");
	}
	
}
