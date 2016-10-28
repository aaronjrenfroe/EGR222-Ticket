/**
 * Created by AaronR on 10/26/16.
 */
public class StudentAdvanceTicket extends AdvanceTicket {
    public StudentAdvanceTicket(int id, int daysAdvance){
        super(id,daysAdvance);
        this.price /= 2;
    }
    public String toString() {
        return ("Ticket Type: Student Advanced, Number: " + ticketID + ", Price: $" + price + " (ID Required)");
    }
}
