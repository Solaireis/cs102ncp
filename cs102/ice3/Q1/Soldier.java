package cs102.ice3.Q1;
public class Soldier {
    private String name;
    private double baseAllowance;
    
    public Soldier(String name, double baseAllowance){
        this.name = name;
        this.baseAllowance = baseAllowance;
    }
    public String getName(){
        return this.name;
    }

    public double getBaseAllowance(){
        return this.baseAllowance;
    }

    public String toString(){
        return "Soldier{Name: " + this.getName() + ", Base Allowance: " + this.getBaseAllowance() + "}";
    }

    public double getGrossAllowance(){
        return this.baseAllowance;
    }
}
