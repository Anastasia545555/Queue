public class Person {
    private String name;
    private String surname;
    private int ticketsNumber;

    public Person(String name, String surname, int ticketsNumber) {
        this.name = name;
        this.surname = surname;
        this.ticketsNumber = ticketsNumber;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        ticketsNumber=0;
    }

    public int getTicketsNumber() {
        return ticketsNumber;
    }

    public void setTicketsNumber(int ticketsNumber) {
        this.ticketsNumber = ticketsNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
