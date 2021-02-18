package bean.lifecycleInterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean{
	
	private int price;

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		System.out.println("Setter ");
		this.price = price;
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Pepsi init ...");
		
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Pepsi destroy...");
		
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}
	

}
