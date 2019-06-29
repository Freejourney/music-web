package ssm.pojo;

public class User {
    private Integer uid;

    private String username;

    private String workplace;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername1() {
        return username;
    }

    public void setUsername1(String username1) {
        this.username = username1;
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", username1='" + username + '\'' +
                ", workplace='" + workplace + '\'' +
                '}';
    }
}