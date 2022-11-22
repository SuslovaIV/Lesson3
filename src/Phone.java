import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Phone {
    private final Map<String, List<String>> PhoneNumber;

    public Phone() {
        PhoneNumber = new HashMap<>();
    }

    public void addPersonNumber(String personName, String phoneNumber) {
        if (PhoneNumber.get(personName) == null) {
            PhoneNumber.put(personName, new ArrayList<>());
        }
        PhoneNumber.get(personName).add(phoneNumber);
    }

    public String getPersonNumber(String Name) {
        String result = Name+":"+PhoneNumber.get(Name);
        return result;
    }

    public static void main(String[] args) {
        Phone phoneDirectory = new Phone();
        phoneDirectory.addPersonNumber("Иван", "9877854411");
        phoneDirectory.addPersonNumber("Михаил", "9827415858");
        phoneDirectory.addPersonNumber("Андрей", "9265555555");
        phoneDirectory.addPersonNumber("Андрей", "9021111111");
        System.out.println(phoneDirectory.getPersonNumber("Андрей"));
        System.out.println(phoneDirectory.getPersonNumber("Михаил"));
    }
}