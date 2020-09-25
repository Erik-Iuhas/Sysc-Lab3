import java.util.Map;

public class AddressBook {
    private Map Buddies;

    public void addBuddy(BuddyInfo new_buddy) {
    }

    public void removeBuddy() {
    }

    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo("Tom Holland","Carleton","631");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy();

    }
}
