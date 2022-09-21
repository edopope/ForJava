package ClassActivities;

public class CarApplication  {

private String model;
private String year;
private double price;

public CarApplication(String model, String year, int price) {
	this.model = model;
	this.year = year;
	if (price > 0) {
	this.price = price; }
}

public void setModel(String model) {
this.model = model;
}

public void setYear(String year) {
this.year = year;
}

public void setPrice(double price) {
if (price > 0) {
	this.price = price; }
}

public String getModel() {
return model;
}
public String getYear() {
return year;
}
public double getPrice() {
return price;
}






}


