package ClassActivities;

public class PetrolPurchase {
	private String stationLocation;
	private String petrolType;
	private int quantity;
	private double pricePerLitre;
	private double percentageDiscount;
        private double purchaseAmount;


 public void setStationLocation(String stationLocation) {
  this.stationLocation = stationLocation;
}

public void setPetrolType(String petrolType) {
this.petrolType = petrolType;
}

public void setQuantity(int quantity) {
this.quantity = quantity;
}

public void setPricePerLitre(double pricePerLitre) {
this.pricePerLitre = pricePerLitre;
}

public void percentageDiscount(double percentageDiscount) {

this.percentageDiscount = percentageDiscount;

}
public void setPurchaseAmount(double purchaseAmount) { 
this.purchaseAmount = purchaseAmount;
}
 
public String getStationLocation() {
return stationLocation;
}
public String getPetrolType() {
return petrolType;
}
public int getquauntity() {
return quantity;
}
public double getPricePerLitre() {
return pricePerLitre;
}
public double getPercentageDiscount() {
   return percentageDiscount;
}
 public double getpurchaseAmount() {
return purchaseAmount;
}




	}