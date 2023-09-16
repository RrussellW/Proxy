import java.util.ArrayList;
import java.util.List;

public class Bouncer implements Club {
    private RealClub realClub;
    private List<String> vipList;

    public Bouncer() {
        realClub = new RealClub();
        vipList = new ArrayList<>();
        vipList.add("Elm");
        vipList.add("Renz");
        vipList.add("Nookie");

    }

    @Override
    public void enter(String name) {
        if (vipList.contains(name)) {
            System.out.println(name + " is a VIP. Welcome!");
            realClub.enter(name);
        } else {
            String redColorCode = "\u001B[31m";
            String resetColorCode = "\u001B[0m";
            System.out.println(name + " is " + redColorCode + "not " + resetColorCode + "on the VIP list. " + redColorCode + "Access denied." + resetColorCode);
        }
    }
}