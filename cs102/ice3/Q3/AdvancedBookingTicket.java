package cs102.ice3.Q3;
public class AdvancedBookingTicket extends Ticket {
    private int numDaysInAdvance;

    public AdvancedBookingTicket(String title, int numDaysInAdvance){
        super(title);
        this.numDaysInAdvance = numDaysInAdvance;
    }
    public double calculatePrice(){
        double sum = super.calculatePrice();
        if ((sum  - (this.numDaysInAdvance * 0.5)) < sum * 0.5 ){
            return sum * 0.5;
        } else {
            return sum - this.numDaysInAdvance * 0.5;
        }
        
    }
}
