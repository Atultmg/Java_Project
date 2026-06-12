// The 'Duplicate Finder' (ArrayList & Loops)
import java.util.ArrayList;

public class DuplicateFinder {
    public static void main(String[] args) {

        ArrayList<String> guests = new ArrayList<>();
        guests.add("Alice");
        guests.add("Bob");
        guests.add("Charlie");
        guests.add("Alice");
        guests.add("David");
        guests.add("Bob");    
        guests.add("Emma");
        guests.add("Charlie");

        System.out.println("Guest list: " + guests);
        System.out.println("\nDuplicates found:");

        for (int i = 0; i < guests.size(); i++) {

            int count = 1;

            for (int j = i + 1; j < guests.size(); j++) {

                if (guests.get(i).equals(guests.get(j))) {
                    count++;
                }
            }

            if (count > 1) {
                System.out.println(guests.get(i) + " appears " + count + " times");
            }
        }
    }
}