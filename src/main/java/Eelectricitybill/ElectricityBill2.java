package Eelectricitybill;

public class ElectricityBill2 {
	static float invoiceAmount(int yearlyConsumption, float basePrice1, float pricePerKw1,
	                           float basePrice2, float pricePerKw2){

		float commCost1 = (basePrice1 + (pricePerKw1 * yearlyConsumption)) / 100;
		float commCost2 = (basePrice2 + (pricePerKw2 * yearlyConsumption)) / 100;

		float cheapestCost = commCost1 < commCost2
						?   commCost1
						:   commCost2;


		return (float) ((int) ((cheapestCost * 100) + 0.5f)) / 100;
	}

	public static void main(String[] args) {
		int yearlyConsumption = 3535;
		float basePrice1 = 1707f * 12;
		float basePrice2 = 1953f * 12;
		float pricePerKW1 = 33.26f;
		float pricePerKW2 = 30.17f;
		float cheapestCost = invoiceAmount(yearlyConsumption, basePrice1, pricePerKW1, basePrice2,
						pricePerKW2);


		System.out.println(cheapestCost);
	}
}
