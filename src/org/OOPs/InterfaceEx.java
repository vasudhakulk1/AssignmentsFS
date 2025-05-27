package org.OOPs;

	interface Car {
	    void startEngine();
	    void stopEngine();
	    void accelerate(int increment);
	}
	class Sedan implements Car {
	
	    private String model;
	    private int speed;

	    public Sedan(String model) {
	        this.model = model;
	        this.speed = 0;
	    }

	    public void startEngine() {
	        System.out.println(model + " engine started.");
	    }
	    public void stopEngine() {
	        System.out.println(model + " engine stopped.");
	    }
	    public void accelerate(int increment) {
	        speed += increment;
	        System.out.println(model + " accelerated to " + speed + " km/h.");
	    }
	    
	    public int getSpeed() {
	        return speed;
	    }
	}

	class SUV implements Car {

	    private String model;
	    private int speed;

	    public SUV(String model) {
	        this.model = model;
	        this.speed = 0;
	    }

	    public void startEngine() {
	        System.out.println(model + " engine started");
	    }

	    public void stopEngine() {
	        System.out.println(model + " engine stopped");
	    }
	    public void accelerate(int increment) {
	        speed += increment;
	        System.out.println(model + " zooms to " + speed + " km/h.");
	    }
	    public int getSpeed() {
	        return speed;
	    }
	}

	public class InterfaceEx {
	    public static void main(String[] args) {
	        Car mySedan = new Sedan("Skoda Slavia");
	        mySedan.startEngine();
	        mySedan.accelerate(60);
	        mySedan.stopEngine();
	        System.out.println();

	        Car mySUV = new SUV("Tata Nexon");
	        mySUV.startEngine();
	        mySUV.accelerate(80);
	        mySUV.stopEngine();
	    }
	}

