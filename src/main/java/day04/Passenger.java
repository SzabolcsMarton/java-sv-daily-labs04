package day04;

public class Passenger {

    private String name;
    private String ticketId;
    private int lagguages;

    public Passenger(String name, String ticketId, int lagguages) {
        this.name = name;
        this.ticketId = ticketId;
        this.lagguages = lagguages;
    }

    public String getName() {
        return name;
    }

    public String getTicketId() {
        return ticketId;
    }

    public int getLagguages() {
        return lagguages;
    }
}
