package model;

public class Player {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String sportsName;
    private String city;
    private long contact;
    private Team team;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSportsName() {
        return sportsName;
    }

    public void setSportsName(String sportsName) {
        this.sportsName = sportsName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "ID = " + id +
                ", Name = '" + name + '\'' +
                ", Age = " + age +
                ", Gender = '" + gender + '\'' +
                ", Sports Name = '" + sportsName + '\'' +
                ", City = '" + city + '\'' +
                ", Contact = " + contact +
                ", " + team;
    }
}
