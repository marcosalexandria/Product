package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
	private Date manufactureDate;

	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
		return getName() + "(used) $ " + getPrice() + " (Manufacture date: " + sdf2.format(manufactureDate) + ")";
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
}