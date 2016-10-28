import java.io.PrintStream;

/**
 * Created by AaronR on 10/26/16.
 */
public class TicketClient {

    public static void main(String[] args){
        for (int i = 0; i < 10; i++) {

            AdvanceTicket newTicket = new AdvanceTicket(i+1, i + 8);
            Ticket myTicket = new AdvanceTicket(i+1, i + 8 );

            System.out.println(newTicket);
            System.out.println(myTicket);
        }
//        for (int i = 0; i < 15; i++) {
//            AdvanceTicket newTicket = new AdvanceTicket(i+1,i);
//            System.out.println(newTicket);
//        }
//        for (int i = 0; i < 15; i++) {
//            StudentAdvanceTicket newTicket = new StudentAdvanceTicket(i+1,i);
//
//            System.out.println(newTicket);
//        }
    }

}
