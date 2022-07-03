package finalss;

public class Application implements Comparable <Application>{
	private String name;
	private double Price;
	private int Stars;
	
	public Application(String n, double p, int s) throws NotValidPriceException, NotValidStarsException{
		name = n;
		setPrice(p);
		setStars(s);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) throws NotValidPriceException{
		if (price>=0) {
		Price = price;
	}
		else {
			throw new NotValidPriceException("The price "+price+" is not valid!");
		}
	}
	public int getStars() {
		return Stars;
	}

	public void setStars(int stars) throws NotValidStarsException {
		if (stars>1||stars<5) {
			Stars = stars;
		}
		else {
			throw new NotValidStarsException("The star rating "+stars+" is not valid!");
	}
	}
	public Boolean isFree() {
		if (this.getPrice()==0) {
			return true;
		}
		return false;
	}
	public Boolean isEqual(Application x) {
		if (x.getName().equals(this.getName())&&this.getPrice()==x.getPrice()&&x.getStars()==this.getStars()) {
			return true;
		}
		return false;
	}
	public int compareTo(Application o) {
		int c = (int) (this.getPrice()-o.getPrice());
		return c;
	}
	public String toString() {
		if (Stars==1) {
			return String.format("%s - Price= %.2f USD - Stars = *", this.getName(),this.getPrice());
		}
		if (Stars==2) {
			return String.format("%s - Price= %.2f USD - Stars = **", this.getName(),this.getPrice());
		}
		if (Stars==3) {
			return String.format("%s - Price= %.2f USD - Stars = ***", this.getName(),this.getPrice());
		}
		if (Stars==4) {
			return String.format("%s - Price= %.2f USD - Stars = ****", this.getName(),this.getPrice());
		}
		if (Stars==5) {
			return String.format("%s - Price= %.2f USD - Stars = *****", this.getName(),this.getPrice());
		}
		return "";
	}
	
}
