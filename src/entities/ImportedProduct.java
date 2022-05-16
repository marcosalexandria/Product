package entities;

public class ImportedProduct extends Product{
	private Double customsFee;

	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}
	
	public Double totalPrice() {
		return getPrice() + this.customsFee;
	}
	
	@Override
	public String priceTag() {
		return getName() + " $ " + totalPrice() + " Customs fee: $ " + this.customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
}
