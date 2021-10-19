package com.jdbc.lapentity;

public class LapEntity {

	
	private int id;
	private String color;
	private String brand;
	private int price;
	private String processor;
	private int screensize;
	private int weight;
	private boolean graphicard;
	private boolean screentouch;
	
	public LapEntity(int id, String color, String brand, int price, String processor, int screensize, int weight,
			boolean graphicard, boolean screentouch) {
		super();
		this.id = id;
		this.color = color;
		this.brand = brand;
		this.price = price;
		this.processor = processor;
		this.screensize = screensize;
		this.weight = weight;
		this.graphicard = graphicard;
		this.screentouch = screentouch;
	}
	

	public LapEntity() {

	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public int getScreensize() {
		return screensize;
	}
	public void setScreensize(int screensize) {
		this.screensize = screensize;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public boolean isGraphicard() {
		return graphicard;
	}
	public void setGraphicard(boolean graphicard) {
		this.graphicard = graphicard;
	}
	public boolean isScreentouch() {
		return screentouch;
	}
	public void setScreentouch(boolean screentouch) {
		this.screentouch = screentouch;
	}
	public String toString() {
		return "LaptopEntity [id=" + id + ", brand=" + brand + ", color=" + color + ", price=" + price +  ", Processor=" + processor + ", Screen_Size=" + screensize + ", Weight=" + weight + ", graphicard=" + graphicard + ",screentouch="+screentouch +"]";
	}
	
}	