package org.OOPs;
  
  class Car1{ 
	  private String brand;
	    private int speed;
	    public String getBrand() {
	        return brand;
	    }
	    public void setBrand(String brand) {
	        this.brand = brand;
	    }
	    public int getSpeed() {
	        return speed;
	    }
	    public void setSpeed(int speed) {
	        this.speed = speed;
	    }
  }	
  
  public class EncapsulationEx {
  
  public static void main(String[] args) { 
	  Car1 myCar = new Car1();
	   myCar.setBrand("Toyota");
       myCar.setSpeed(80);
       System.out.println("Brand: " + myCar.getBrand());
       System.out.println("Speed: " + myCar.getSpeed() + " km/h");
   }
} 

