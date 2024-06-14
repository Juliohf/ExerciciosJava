package entities;

public class Employee {
	
	public String name;
	public double bruto;
	public double imposto;
	
	
	public double liquido() {
		return bruto - imposto;		
	}
	
	public void increase(double percentage) {
		bruto += bruto * percentage /100.0;		
		
	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", liquido());
		}
	

}
