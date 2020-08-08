package sample;

public class Profession {

    private String professionName;
    private String position;

    public Profession(String professionName, String position) {
        this.professionName = professionName;
        this.position = position;
    }
    public Profession (String professionName) {
        this.professionName = professionName;
        this.position = "";
    }

    public String getProfessionName() {
        return professionName;
    }

    public void setProfessionName(String professionName) {
        this.professionName = professionName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
