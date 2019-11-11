package Enity;

public class User {
    private String name;
    private String username;
    private String password;
    private int sex;
    private String mail;
    private String grade;

    private int status;
    private int rankings;
    private String UUID;
    private String head;
    private String background;
    public User() {
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getMail(){return mail;}

    public void setMail(String mail ){this.mail=mail;}

    public String getHead() {
        return head;
    }

    public String getBackground() {
        return background;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getUUID() {
        return UUID;
    }

    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    public int getRankings() {
        return rankings;
    }

    public void setRankings(int rankings) {
        this.rankings = rankings;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
