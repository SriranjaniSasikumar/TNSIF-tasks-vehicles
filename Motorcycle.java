package tnsiftask3;

class Motorcycle extends Vehicle {
   
    private int topSpeed;

	public Motorcycle(String make, String model, int year, int topSpeed) {
		super(make, model, year);
		this.topSpeed = topSpeed;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	 @Override
	    public void displayInfo() {
	       
	        super.displayInfo();
	        System.out.println("Top Speed: " + topSpeed + " mph");
	    }
	}

	