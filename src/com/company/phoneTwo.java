package com.company;

public class phoneTwo extends phonesParent{
    private String name;

    public phoneTwo(int price, String resolution, String chipset, int year, int memory, String name) {
        super(price, resolution, chipset, year, memory);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
