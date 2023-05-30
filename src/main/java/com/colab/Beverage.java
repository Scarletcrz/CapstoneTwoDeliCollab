package com.colab;

public class Beverage {
    private String small;
    private String medium;
    private String large;
    private String water;
    private String coke;
    private String sprite;
    private String sweetTea;
    private String lemonade;

    public Beverage(String small, String medium,
                    String large, String water,
                    String coke, String sprite,
                    String sweetTea, String lemonade) {
        this.small = small;
        this.medium = medium;
        this.large = large;
        this.water = water;
        this.coke = coke;
        this.sprite = sprite;
        this.sweetTea = sweetTea;
        this.lemonade = lemonade;
    }

    public String getSmall() {
        return small;
    }

    public void setSmall(String small) {
        this.small = small;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }

    public String getCoke() {
        return coke;
    }

    public void setCoke(String coke) {
        this.coke = coke;
    }

    public String getSprite() {
        return sprite;
    }

    public void setSprite(String sprite) {
        this.sprite = sprite;
    }

    public String getSweetTea() {
        return sweetTea;
    }

    public void setSweetTea(String sweetTea) {
        this.sweetTea = sweetTea;
    }

    public String getLemonade() {
        return lemonade;
    }

    public void setLemonade(String lemonade) {
        this.lemonade = lemonade;
    }
}
