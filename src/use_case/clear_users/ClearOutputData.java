package use_case.clear_users;

// TODO Complete me

import java.util.ArrayList;

public class ClearOutputData {

    private final ArrayList<String> users;
    public ClearOutputData(ArrayList<String> users) {
        this.users = users;
    }

    public String getUsers() {
        return String.join("\n", this.users);
    }
}
