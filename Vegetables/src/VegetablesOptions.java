
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
	
}
