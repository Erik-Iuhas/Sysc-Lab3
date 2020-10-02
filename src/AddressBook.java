import java.util.Map;
import java.util.ArrayList;

//added comment on github

//new_code
//more
//lines

public class AddressBook {
    private ArrayList<BuddyInfo> myBuddies;

    public AddressBook(){
        myBuddies = new ArrayList<>();
    }
    public void addBuddy(BuddyInfo aBuddy) {
        if(aBuddy != null) {
            myBuddies.add(aBuddy);
        }
    }

    public BuddyInfo removeBuddy(int index) {
        if (index >= 0 && index < myBuddies.size()) {
            return myBuddies.remove(index);
        }
        return null;
    }

    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo("Tom Holland","Carleton","631");
        AddressBook addressBook = new AddressBook();
        System.out.println("Why");
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);

    }
}
