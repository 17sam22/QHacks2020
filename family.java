package VeggiePackage;


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
	public static int numVeg(family fam, Vegetable veg){
		  double[] array = {fam.vitA/2,fam.vitC/2, fam.vitK/2, fam.iron/2, fam.calci/2, fam.prot/2, fam.cals/2, fam.potas/2};
		  int count = 0;
		  int numVegs = 1;
		  while(count < 5){
		    if(array[0] > 0){
		      array[0] -= veg.vitaminA;
		      if(array[0]<= 0){
		        count++;
		      }
		    }
		      if(array[1] > 0){
		        array[1] -= veg.vitaminC;
		        if(array[1]<= 0){
		          count++;
		        }
		    }

		    if(array[2] > 0){
		      array[2] -= veg.vitaminK;
		      if(array[2]<= 0){
		        count++;
		      }
		    }
		      if(array[3] > 0){
		        array[3] -= veg.iron;
		        if(array[3]<= 0){
		          count++;
		        }
		      }
		        if(array[4] > 0){
		          array[4] -= veg.calcium;
		          if(array[4]<= 0){
		            count++;
		          }
		        }
		          if(array[5] > 0){
		            array[5] -= veg.protein;
		            if(array[5]<= 0){
		              count++;
		            }
		          }
		            if(array[6] > 0){
		              array[6] -= veg.calories;
		              if(array[6]<= 0){
		                count++;
		              }
		            }
		              if(array[7] > 0){
		                array[7] -= veg.potassium;
		                if(array[7]<= 0){
		                  count++;
		                }
		              }

		    numVegs++;
		  }
		  return numVegs;
		}
		
		 public static double gardenSpace(int numVeg, Vegetable veg){
			 System.out.println(veg.area); 
		   double space = numVeg*veg.area;
		   return space/100;
		 }

		

		public static double totalWater(int numVeg, Vegetable veg){
			System.out.println(veg.dailyWater);
		  double water = numVeg*veg.dailyWater;
		  return water;
		}

	public static void main(String[] args) {
		
		family famOne = new family(); 

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
				famOne.cals = famOne.cals + 1000; 
				famOne.vitA = famOne.vitA + 0.0003; 
				famOne.vitC = famOne.vitC + 0.015; 
				famOne.vitK = famOne.vitK + 0.00003; 
				famOne.iron = famOne.iron + 0.007; 
				famOne.calci = famOne.calci + 0.7; 
				famOne.prot = famOne.prot + 13; 
				famOne.potas = famOne.potas + 3; 
				 
			} else if (4 <= numage && numage <= 8){
				famOne.cals = famOne.cals + 1400; 
				famOne.vitA = famOne.vitA + 0.0004; 
				famOne.vitC = famOne.vitC + 0.025; 
				famOne.vitK = famOne.vitK + 0.000055; 
				famOne.iron = famOne.iron + 0.01; 
				famOne.calci = famOne.calci + 1.0; 
				famOne.prot = famOne.prot + 19; 
				famOne.potas = famOne.potas + 3.8; 
				
			}else if (9 <= numage && numage <= 13){
				famOne.cals = famOne.cals + 1700; 
				famOne.vitA = famOne.vitA + 0.0006; 
				famOne.vitC = famOne.vitC + 0.045; 
				famOne.vitK = famOne.vitK + 0.00006; 
				famOne.iron = famOne.iron + 0.008; 
				famOne.calci = famOne.calci + 1.3; 
				famOne.prot = famOne.prot + 34; 
				famOne.potas = famOne.potas + 4.5;  
				 
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
					famOne.cals = famOne.cals + 1800; 
					famOne.vitA = famOne.vitA + 0.0007; 
					famOne.vitC = famOne.vitC + 0.065; 
					famOne.vitK = famOne.vitK + 0.000075; 
					famOne.iron = famOne.iron + 0.015; 
					famOne.calci = famOne.calci + 1.3; 
					famOne.prot = famOne.prot + 46; 
					famOne.potas = famOne.potas + 4.7; 
					 
				}else {
					famOne.cals = famOne.cals + 2700; 
					famOne.vitA = famOne.vitA + 0.0009; 
					famOne.vitC = famOne.vitC + 0.075; 
					famOne.vitK = famOne.vitK + 0.000075; 
					famOne.iron = famOne.iron + 0.011; 
					famOne.calci = famOne.calci + 1.3; 
					famOne.prot = famOne.prot + 52; 
					famOne.potas = famOne.potas + 4.7;  
				
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
					famOne.cals = famOne.cals + 2000; 
					famOne.vitA = famOne.vitA + 0.0007; 
					famOne.vitC = famOne.vitC + 0.075; 
					famOne.vitK = famOne.vitK + 0.00009; 
					famOne.iron = famOne.iron + 0.018; 
					famOne.calci = famOne.calci + 1.0; 
					famOne.prot = famOne.prot + 46; 
					famOne.potas = famOne.potas + 2.320; 
					 
				}else {
					famOne.cals = famOne.cals + 2500; 
					famOne.vitA = famOne.vitA + 0.0009; 
					famOne.vitC = famOne.vitC + 0.09; 
					famOne.vitK = famOne.vitK + 0.00012; 
					famOne.iron = famOne.iron + 0.008; 
					famOne.calci = famOne.calci + 1.0; 
					famOne.prot = famOne.prot + 56; 
					famOne.potas = famOne.potas + 3.016;  
					 
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
					famOne.cals = famOne.cals + 1800; 
					famOne.vitA = famOne.vitA + 0.0007; 
					famOne.vitC = famOne.vitC + 0.075; 
					famOne.vitK = famOne.vitK + 0.00009; 
					famOne.iron = famOne.iron + 0.008; 
					famOne.calci = famOne.calci + 1.2; 
					famOne.prot = famOne.prot + 55; 
					famOne.potas = famOne.potas + 4.7;  
					 
				}else {
					famOne.cals = famOne.cals + 2200; 
					famOne.vitA = famOne.vitA + 0.0009; 
					famOne.vitC = famOne.vitC + 0.09; 
					famOne.vitK = famOne.vitK + 0.00012; 
					famOne.iron = famOne.iron + 0.008; 
					famOne.calci = famOne.calci + 1.0; 
					famOne.prot = famOne.prot + 65; 
					famOne.potas = famOne.potas + 4.7;  
	 
				}
			}
			
		}
		
		System.out.printf("The daily needed intake of the family is:\n"+famOne.cals+" calories \n"+famOne.vitA+" Grams of vitamin A \n"+famOne.vitC+" Grams of vitamin C \n"+famOne.vitK+" Grams of vitamin K \n"+famOne.iron+" Grams of iron \n"+famOne.calci+" Grams of calcium\n"+famOne.prot+" Grams of protein\n"+famOne.potas+" Grams of potassium");
		Vegetable beet = new Vegetable("beet",0.0, 0.00612,0.00000034,0.004,0.00272,1.6,43.0, 0.05186,true, 55, 21.77,  60.0,  2.1);
		Vegetable carrots = new Vegetable("carrots",0.000509, 0.0036, 0.000008052, 0.000183, 0.021013, 0.45, 20.00, 0.01952, true, 75, 21.05, 58, 0.4);
		Vegetable kale = new Vegetable("kale",0.0017, 0.06955, 0.00138, 0.00342, 0.18724, 5.187, 76.44, 0.00062244, true, 65, 29.48, 65, 0.4);
		Vegetable spinach = new Vegetable("spinach",0.0017553, 0.01753, 0.00030133, 0.001691, 0.06178, 1.785, 14.4, 0.3482, true, 49, 5.90, 13, 0.5);
		Vegetable tomato = new Vegetable("tomato", 0.00002372, 0.0078, 0.0000045, 0.000155, 0.005962, 0.5, 10.1269,  0.135, false, 10, 421.37, 929, 2.0);
		System.out.println("\nWhich vegetable do you prefer:\n 1. Beets\n 2. Carrots\n 3. Kale\n 4. Spinach\n 5. Tomato\n Type in the number of the vegetable you would like:"); 
		Scanner veggie = new Scanner(System.in);
		String theveggie = veggie.nextLine(); 
		int numveggie = Integer.parseInt(theveggie); 
		while(numveggie < 0 || numveggie > 5) {
			System.out.println("You did not pick a number from 1-5 please try again.");
			Scanner veggie2 = new Scanner(System.in);
			String theveggie2 = veggie2.nextLine(); 
			numveggie = Integer.parseInt(theveggie2); 
		}
		Vegetable chosenVeg = new Vegetable(); 
		if(numveggie == 1) {
			System.out.println("You picked Beets!");
			chosenVeg = beet; 
		}else if(numveggie == 2) {
			System.out.println("You picked Carrots!"); 
			chosenVeg = carrots; 
		}else if(numveggie == 3) {
			System.out.println("You picked Kale!"); 
			chosenVeg = kale; 
		}else if(numveggie == 4) {
			System.out.println("You picked Spinach!"); 
			chosenVeg = spinach; 
		}else{
			System.out.println("You picked Tomatos!"); 
			chosenVeg = tomato; 
		}
		
		int vegetableNum = numVeg(famOne, chosenVeg); 
		double gardenArea = gardenSpace(vegetableNum, chosenVeg); 
		double waterVol = totalWater(vegetableNum, chosenVeg); 
		
		System.out.printf("\nThe total garden area you need for this vegetable for your family size is: "+gardenArea); 
		System.out.printf(" m^2 \n"); 
		System.out.printf("The total water volume you need for this vegetable is: "+waterVol); 
		System.out.printf(" ml per day \n"); 
	}
	
}

