package cs102.ice3.Q2;


public class Vehicle {
    public int numWheels;
    public double distancePerLiter;
    
    public Vehicle(int numWheels, double distancePerLiter){
        this.numWheels = numWheels;
        this.distancePerLiter = distancePerLiter;
    }

    public String toString(){
        return "Vehicle[NumWheel=" +  this.numWheels + ", Distance per liter= " + this.distancePerLiter + "]";
    }
}
