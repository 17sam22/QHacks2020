package VeggiePackage;
public class Vegetable {

	public double vitaminA;
	public double vitaminC;
	public double vitaminK;
	public double iron;
	public double calcium;
	public double calories;
	public double protein; 
	public double potassium;
	
	public boolean singleUse;
	public int lifeCycle;
	public double dailyWater;
	public double area;
	public double footprint;
	public String name;
	
	public Vegetable() {}
	
	
	public Vegetable (String name,
			double vitaminA,
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
		
		this.name = name;
		this.vitaminA = vitaminA;
		this.vitaminC = vitaminC;
		this.vitaminK = vitaminK;
		this.iron = iron;
		this.calcium = calcium;
		this.calories = calories;
		this.potassium = potassium;
		this.protein = protein; 
		this.singleUse = singleUse;
		this.lifeCycle = lifeCycle;
		this.dailyWater = dailyWater;
		this.area = area;
		this.footprint = footprint;
		
	}

}

