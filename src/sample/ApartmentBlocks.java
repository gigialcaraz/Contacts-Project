package sample;

public class ApartmentBlocks {

    private String name;
    private int bedRooms;
    private int bathrooms;
    private boolean balcony;
    private int livingRoom;
    private boolean playRoom;


    private String location;


    public ApartmentBlocks(String name, int bedRooms, int bathrooms, boolean balcony, int livingRoom, boolean playRoom, String location) {
        this.name = name;
        this.bedRooms = bedRooms;
        this.bathrooms = bathrooms;
        this.balcony = balcony;
        this.livingRoom = livingRoom;
        this.playRoom = playRoom;
        this.location = location;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBedRooms() {
        return bedRooms;
    }

    public void setBedRooms(int bedRooms) {
        this.bedRooms = bedRooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    public boolean isBalcony() {
        return balcony;
    }

    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }

    public int getLivingRoom() {
        return livingRoom;
    }

    public void setLivingRoom(int livingRoom) {
        this.livingRoom = livingRoom;
    }

    public boolean isPlayRoom() {
        return playRoom;
    }

    public void setPlayRoom(boolean playRoom) {
        this.playRoom = playRoom;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
