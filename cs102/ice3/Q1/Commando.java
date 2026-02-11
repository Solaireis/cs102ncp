package cs102.ice3.Q1;
public class Commando extends Soldier {
    private double vocationAllowance;

    public Commando(String name, double baseAllowance, double vocationAllowance){
        super(name, baseAllowance);
        this.vocationAllowance = vocationAllowance;
    }

    public double getVocationAllowance(){
        return this.vocationAllowance;
    }

    public double getGrossAllowance(){
        return this.getBaseAllowance() + this.getVocationAllowance();
    }

    public String toString(){
        return "Commando{" + super.toString() + ", vocationAllowance: " + this.vocationAllowance +"}";
    }
}
