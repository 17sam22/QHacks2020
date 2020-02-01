import java.util.Scanner; 

public class family {
	
	private double cals; 
	private double vitA; 
	private double vitC; 
	private double vitK; 
	private double iron; 
	private double calci; 
	private double prot; 
	private double potas; 
	
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
			
			System.out.println("Type in the age of a family member: "); 
			Scanner input = new Scanner(System.in);
			String age = input.nextLine(); 
			int numage = Integer.parseInt(age); 
			
			//for children 
			if (2 <= numage && numage <= 3) {
				calc = calc + #; 
				vitA = vitA + #; 
				vitC = vitC + #; 
				vitK = vitK + #; 
				iron = iron + #; 
				calci = calci + #; 
				prot = prot + #; 
				pots = potas + #; 
			} else if (4 <= numage && numage <= 8){
				calc = calc + #; 
				vitA = vitA + #; 
				vitC = vitC + #; 
				vitK = vitK + #; 
				iron = iron + #; 
				calci = calci + #; 
				prot = prot + #; 
				pots = potas + #; 
			}else if (9 <= numage && numage <= 13){
				calc = calc + #; 
				vitA = vitA + #; 
				vitC = vitC + #; 
				vitK = vitK + #; 
				iron = iron + #; 
				calci = calci + #; 
				prot = prot + #; 
				pots = potas + #;  
			}else if (14 <= numage && numage <= 18){ // for teens
				System.out.println("Type in the gender (either M or F): "); 
				Scanner inp = new Scanner(System.in);
				String gender = inp.nextLine(); 
				if (gender == "F") {
					calc = calc + #; 
					vitA = vitA + #; 
					vitC = vitC + #; 
					vitK = vitK + #; 
					iron = iron + #; 
					calci = calci + #; 
					prot = prot + #; 
					pots = potas + #; 
				}else {
					calc = calc + #; 
					vitA = vitA + #; 
					vitC = vitC + #; 
					vitK = vitK + #; 
					iron = iron + #; 
					calci = calci + #; 
					prot = prot + #; 
					pots = potas + #;  
				}
			}else if (19 <= numage && numage <= 50) { //for adults 
				System.out.println("Type in the gender (either M or F): "); 
				Scanner inp = new Scanner(System.in);
				String gender = inp.nextLine(); 
				if (gender == "F") {
					calc = calc + #; 
					vitA = vitA + #; 
					vitC = vitC + #; 
					vitK = vitK + #; 
					iron = iron + #; 
					calci = calci + #; 
					prot = prot + #; 
					pots = potas + #; 
				}else {
					calc = calc + #; 
					vitA = vitA + #; 
					vitC = vitC + #; 
					vitK = vitK + #; 
					iron = iron + #; 
					calci = calci + #; 
					prot = prot + #; 
					pots = potas + #;  
				}
			}else {
				System.out.println("Type in the gender (either M or F): "); 
				Scanner inp = new Scanner(System.in);
				String gender = inp.nextLine(); 
				if (gender == "F") {
					calc = calc + #; 
					vitA = vitA + #; 
					vitC = vitC + #; 
					vitK = vitK + #; 
					iron = iron + #; 
					calci = calci + #; 
					prot = prot + #; 
					pots = potas + #;  
				}else {
					calc = calc + #; 
					vitA = vitA + #; 
					vitC = vitC + #; 
					vitK = vitK + #; 
					iron = iron + #; 
					calci = calci + #; 
					prot = prot + #; 
					pots = potas + #;  
				}
			}
			
		}
	}
	
}
