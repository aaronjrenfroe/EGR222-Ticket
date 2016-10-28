import java.io.PrintStream;

public class Ticket {

    public int ticketID;
    public double price = 50.00;

    public Ticket(){
        this.ticketID = -1;
    }
    public Ticket(int number){
        this.ticketID = number;
    }

    @Override
    public String toString() {

        return ("Number: " + ticketID + ", Price: $" + price);
    }
}
