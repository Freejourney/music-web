package ssm.pojo;

public class test {
    private int ID;
    private String username;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "test{" +
                "ID=" + ID +
                ", username='" + username + '\'' +
                '}';
    }
}
