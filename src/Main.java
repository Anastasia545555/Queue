import java.util.*;
public class Main {
    public static List<Person> generateClients(){
        List<Person> pList= new LinkedList<>();
        pList.add(new Person("Марина", "Цветаева", 5));
        pList.add(new Person("Александр", "Пушкин", 10));
        pList.add(new Person("Лев", "Толстой", 11));
        pList.add(new Person("Александр", "Блок", 4));
        pList.add(new Person("Михаил", "Лермонтов", 9));
        return pList;
    }
    public static void main(String[] args) {
        Queue<Person> q= new LinkedList<>(generateClients());
        while (!q.isEmpty()){
            Person p=q.poll();
            p.setTicketsNumber(p.getTicketsNumber()-1);
            System.out.printf("\n%s %s прокатился на аттракционе, осталось билетов: %d", p.getName(), p.getSurname(), p.getTicketsNumber());
            if (p.getTicketsNumber()!=0) {
                q.offer(p);
            }
        }

    }
}