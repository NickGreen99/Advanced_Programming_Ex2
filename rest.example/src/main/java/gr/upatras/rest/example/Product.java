package gr.upatras.rest.example;

/**
 * @author ctranoris
 *
 */
public class Product {
	private int id;
	private String pname;
	private String batchno;
	private double price;
	private int noofproduct;
	private String color;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBatchno() {
		return batchno;
	}

	public void setBatchno(String batchno) {
		this.batchno = batchno;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNoofproduct() {
		return noofproduct;
	}

	public void setNoofproduct(int noofproduct) {
		this.noofproduct = noofproduct;
	}

	public Product(int id, String pname, String batchno, double price, int noofproduct,String color) {
		super();
		this.id = id;
		this.pname = pname;
		this.batchno = batchno;
		this.price = price;
		this.noofproduct = noofproduct;
		this.color = color;
	}
}