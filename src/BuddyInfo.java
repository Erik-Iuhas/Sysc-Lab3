import java.util.Map;

public class BuddyInfo {
    private String name;
    private String address;
    private String phone_number;

    public BuddyInfo(String name, String address, String phone_number) {
        this.name = name;
        this.address = address;
        this.phone_number = phone_number;
    }


    public static void main(String[] args) {
        BuddyInfo person = new BuddyInfo("Senku", "Japan","No Phone Number");
        System.out.println("Hello " + person.name + ", " + person.address + ", " + person.phone_number);
    }
}

