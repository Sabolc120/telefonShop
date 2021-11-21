package com.company;

public class phonesParent { //Szülő osztály, amiből lesz az öröklés, minden telefonnak vannak ilyen tulajdonságaik:
    private int price;
    private String resolution;
    private String chipset;
    private int year;
    private int memory;

    public phonesParent(int price, String resolution, String chipset, int year, int memory) {
        this.price = price;
        this.resolution = resolution;
        this.chipset = chipset;
        this.year = year;
        this.memory = memory;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
}
