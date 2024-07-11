package interface_adapter.clear_users;

// TODO Complete me

public class ClearState {
    private String message;

    public ClearState(ClearState copy) {
        this.message = copy.message;
    }
    public ClearState() {}

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
