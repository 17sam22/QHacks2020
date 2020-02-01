
public class VegetablesOptions {

	private double vitaminA;
	private double vitaminC;
	private double vitaminK;
	private double iron;
	private double calcium;
	private double calories;
	private double potassium;
	
	private boolean singleUse;
	private int lifeCycle;
	private double dailyWater;
	private double area;
	private double footprint;
	
	public VegetablesOptions (double vitaminA,
			double vitaminC,
			double vitaminK,
			double iron,
			double calcium,
			double protein,
			double calories,
			double potassium,
			boolean singleUse,
			int lifeCycle,
			double dailyWater,
			double area,
			double footprint) {
		
		this.vitaminA = vitaminA;
		this.vitaminC = vitaminC;
		this.vitaminK = vitaminK;
		this.iron = iron;
		this.calcium = calcium;
		this.calories = calories;
		this.potassium = potassium;
		this.singleUse = singleUse;
		this.lifeCycle = lifeCycle;
		this.dailyWater = dailyWater;
		this.area = area;
		this.footprint = footprint;
		
	}
	public static void main(String[] args){
		 VegetablesOptions beet = new VegetablesOptions(0.0, 0.00612,0.00000034,0.004,0.00272,1.6,43.0, 0.05186,true, 55, 21.77,  60.0,  2.1);
		 VegetablesOptions carrots = new VegetablesOptions(0.000509, 0.0036, 0.000008052, 0.000183, 0.021013, 0.45, 20.00, 0.01952, true, 75, 21.05, 58, 0.4);
		 VegetablesOptions kale = new VegetablesOptions(0.0017, 0.06955, 0.00138, 0.00342, 0.18724, 5.187, 76.44, 0.00062244, true, 65, 29.48, 65, 0.4);
		 VegetablesOptions spinach = new VegetablesOptions(0.0017553, 0.01753, 0.00030133, 0.001691, 0.06178, 1.785, 14.4, 0.3482, true, 49, 5.90, 13, 0.5);
		 VegetablesOptions tomato = new VegetablesOptions( 0.00002372, 0.0078, 0.0000045, 0.000155, 0.005962, 0.5, 10.1269,  0.135, false, 10, 421.37, 929, 2.0);

	}
	
}
