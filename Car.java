


public class Car extends Vehicle {
	private int doors;
	private int passengers;
	
	
	public Car(String aMake, String aModel, String aPlate, int numDoors, int numPass) {
		
		super(aMake, aModel, aPlate); 

		this.doors = numDoors;
		this.passengers = numPass;
	}
	
	
	public int getDoors() {
		return this.doors;
	}
	
	public int getPassengers() {
		return this.passengers;
	}
	
	public String toString() {
		String result = String.format("%d-door %s%s with license %s.", this.doors, getMake(), getModel(), getPlate());
		return result;
	}
	
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Car)) {
			return false;
		}
		
		Car otherCar = (Car) obj;

		if(this.doors == otherCar.doors) {
			if(this.passengers == otherCar.passengers) {
				return super.equals(obj); 
			}
		}
		return false;
		
	}
	
	public Car copy() { 


		Car theCopy = new Car(getMake(),getModel(), getPlate(),this.doors, this.passengers);
		
		
		return theCopy;
		
		
			
		
		
}
}
	
	