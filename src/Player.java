public class Player {
    String name;
    String lastname;
    String email;
    String password;
    boolean isAuthorized;

    Statistics statistics;

    public Player() {

    }

    public Player(String name, String lastname, String email, String password, boolean isAuthorized, Statistics statistics) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.isAuthorized = isAuthorized;
        this.statistics = statistics;
    }

    public Statistics getStatistics() {
        return statistics;
    }

    public void setStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAuthorized() {
        return isAuthorized;
    }

    public void setAuthorized(boolean authorized) {
        isAuthorized = authorized;
    }
}
