package food;

public class Pizza {

	private int Price;
	private Boolean veg;
	private int addExtraCheese=50;
	private int addExtraToppings=100;
	private int takeBag=20;
	
	private int commonpizzaprice;
	
	private boolean isextracheeseadded=false;
	private boolean isExtraToppingsAdded=false;
	private boolean isBagAdded=false;
	
	
	
	public Pizza(Boolean isVeg) {
		this.veg=isVeg;
		if(this.veg) {
			this.Price=200;
		}
		else{
			this.Price=400;
		}
		commonpizzaprice=this.Price;
		
		
	}
	
	

	public void addExtraCheese() {
	isextracheeseadded=true;
	this.Price+=this.addExtraCheese;
		
		
	}
	public void addExtraToppings() {
		isExtraToppingsAdded=true;
		
        this.Price+=this.addExtraToppings;
		
	}
	public void takeBag() {
		isBagAdded=true;
		this.Price+=this.takeBag;
		
	}
	
	public void getBill() {
		String bill="";
	System.out.println("Pizza  "+this.commonpizzaprice);
	
	if(isextracheeseadded) {
		bill+="Extra Cheese Added  "+addExtraCheese+"\n";
	}
	if(isExtraToppingsAdded) {
		bill+=addExtraToppings+"Extra Toppings Added"+"\n";
	}
	if(isBagAdded) {
		bill+=takeBag+"Bag Added"+"\n";
	}
	bill+="Bill:"+this.Price;
	System.out.println(bill);
	
	}

}
