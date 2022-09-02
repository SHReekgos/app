package untitledggyu;
import java.util.ArrayList;
import java.util.List;


public class Party {
    private List<String> guests = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);


    public void addGuest() {
        System.out.println("Podaj imię gościa");
        String name = scanner.nextLine();
        guests.add(name);

    }

    public List<String> getGuests() {
        return guests;
    }
}
