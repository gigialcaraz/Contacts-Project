package sample;

public class Client {

    private String name;
    private String surname;
    private String email;
    private String residence;
    private int family;
    private int age;
    private int phoneNum;
    private Profession profession;

    public Client(String name, String surname, String email, String residence, int family, int age, int phoneNum) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.residence = residence;
        this.family = family;
        this.age = age;
        this.phoneNum = phoneNum;
    }

    public Client(String name, String surname, String email, String residence, int family, int age, int phoneNum, Profession profession) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.residence = residence;
        this.family = family;
        this.age = age;
        this.phoneNum = phoneNum;
        this.profession = profession;
    }

    public Client(String name, String surname, String email, String residence, int phoneNum, int family, int age, String job) {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    public int getFamily() {
        return family;
    }

    public void setFamily(int family) {
        this.family = family;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }
}
