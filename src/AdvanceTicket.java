/**
 * Created by AaronR on 10/26/16.
 */
public class AdvanceTicket extends Ticket {

    public AdvanceTicket(int id, int daysAdvance){
        super(id);
        if (daysAdvance >= 10){
            price = this.price * 0.6;
        }
        else{
            price *= 0.8;
        }


    }
    public String toString() {
        return "Ticket Type: Advanced, " + super.toString() + "(ID required)";
    }
}
