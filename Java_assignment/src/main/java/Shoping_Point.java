

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name="P")

public class Shoping_Point {
	//@Id
	private int Pro_id;
	//@Column(name="Pro_name")
	private String Pro_name;
	//@Column(name="Pro_price")
	private double Pro_price;
	//@Column(name="Pro_count")
	private int Pro_count;
	//@Column(name="Pro_id")
	
	
	
	
	public Shoping_Point(int Pro_id, String Pro_name, double Pro_price, int Pro_count) {
		// TODO Auto-generated constructor stub
		this.Pro_id=Pro_id;
		this.Pro_name=Pro_name;
		
		this.Pro_price=Pro_price;
		
		
		this.Pro_count=Pro_count;
	}
	public int getPro_id() {
		return Pro_id;
	}
	public void setPro_id(int Pro_id) {
		this.Pro_id = Pro_id;
	}
	public String getPro_name() {
		return Pro_name;
	}
	public void setPro_name(String Pro_name) {
		this.Pro_name = Pro_name;
	}
	public double getPro_price() {
		return Pro_price;
	}
	public void setPro_price(double Pro_price) {
		this.Pro_price = Pro_price;
	}
	
	public int getPro_count() {
			return Pro_count;
		}
	public void setPro_count(int Pro_count) {
			this.Pro_count = Pro_count;	
	}
	
	
		
		
		
		
}
