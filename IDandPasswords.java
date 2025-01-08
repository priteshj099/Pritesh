import java.util.HashMap;

public class IDandPasswords {

    HashMap<String, String> logininfo = new HashMap<String, String>();

    IDandPasswords() {
        logininfo.put("Techplement", "user1");
        logininfo.put("pritesh", "user2");
        logininfo.put("jagtap", "user3");
    }

    public HashMap<String, String> getLoginInfo() {
        return logininfo;
    }
}