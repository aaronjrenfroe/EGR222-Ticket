import java.io.PrintStream;

/**
 * Created by AaronR on 10/26/16.
 */
public class TicketClient {

    public static void main(String[] args){
        for (int i = 0; i < 10; i++) {


            Ticket myTicket = new WalkupTicket(i+1);

            System.out.println(myTicket);
        }
        for (int i = 0; i < 15; i++) {
            Ticket myTicket = new AdvanceTicket(i+1,i);
            System.out.println(myTicket);
        }
        for (int i = 0; i < 15; i++) {
            Ticket myTicket = new StudentAdvanceTicket(i+1,i);

            System.out.println(myTicket);
        }
    }

}
