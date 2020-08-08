package sample;

import sample.ApartmentBlocks;

public class  PersonalizedBlocks extends ApartmentBlocks {

    private boolean swimmingPool;
    private boolean garden;
    private boolean garage;
    private boolean airCon;
    private boolean style;
    private int price;
    private boolean lift;
    private boolean security;

    public PersonalizedBlocks(String name, int bedRooms, int bathrooms, boolean balcony, int livingRoom, boolean playRoom, String location, boolean swimmingPool, boolean garden, boolean garage, boolean airCon, boolean style, int price, boolean lift, boolean security) {
        super(name, bedRooms, bathrooms, balcony, livingRoom, playRoom, location);
        this.swimmingPool = swimmingPool;
        this.garden = garden;
        this.garage = garage;
        this.airCon = airCon;
        this.style = style;
        this.price = price;
        this.lift = lift;
        this.security = security;
    }

    public boolean isSwimmingPool() {
        return swimmingPool;
    }

    public void setSwimmingPool(boolean swimmingPool) {
        this.swimmingPool = swimmingPool;
    }

    public boolean isGarden() {
        return garden;
    }

    public void setGarden(boolean garden) {
        this.garden = garden;
    }

    public boolean isGarage() {
        return garage;
    }

    public void setGarage(boolean garage) {
        this.garage = garage;
    }

    public boolean isAirCon() {
        return airCon;
    }

    public void setAirCon(boolean airCon) {
        this.airCon = airCon;
    }

    public boolean isStyle() {
        return style;
    }

    public void setStyle(boolean style) {
        this.style = style;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isLift() {
        return lift;
    }

    public void setLift(boolean lift) {
        this.lift = lift;
    }

    public boolean isSecurity() {
        return security;
    }

    public void setSecurity(boolean security) {
        this.security = security;
    }
}
