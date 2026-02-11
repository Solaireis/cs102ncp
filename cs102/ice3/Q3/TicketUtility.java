package cs102.ice3.Q3;
import java.util.ArrayList;
import java.util.*;

public class TicketUtility {
    public TicketUtility(){

    }

    public static double calculateAverageTicketPrice(ArrayList <Ticket> ticketList){
        if (ticketList == null || ticketList.size() == 0) {
            return 0.0;
        }
        double sum = 0.0;
        for (int i = 0; i < ticketList.size(); i++){
            sum += ticketList.get(i).calculatePrice();
        }
        return sum / ticketList.size();
    } 
}
