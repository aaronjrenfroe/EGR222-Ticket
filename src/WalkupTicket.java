/**
 * Created by AaronR on 10/26/16.
 */

public class WalkupTicket extends Ticket {

    public WalkupTicket(int id){
        super(id);
    }
    @Override
    public String toString() {
        return "Ticket Type: Walk-up, " + super.toString() + "(ID required)";
    }
}
