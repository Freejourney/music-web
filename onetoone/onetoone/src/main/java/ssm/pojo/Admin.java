package ssm.pojo;

public class Admin {

    private Integer uid;
    private String username;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                '}';
    }
}
