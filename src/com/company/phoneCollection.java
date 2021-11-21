package com.company;

public class phoneCollection {
    private String name;
    private PhoneOne OnePhone;
    private phoneTwo TwoPhone;
    private phoneThree ThreePhone;

    public phoneCollection(String name, PhoneOne onePhone, phoneTwo twoPhone, phoneThree threePhone) {
        this.name = name;
        OnePhone = onePhone;
        TwoPhone = twoPhone;
        ThreePhone = threePhone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PhoneOne getOnePhone() {
        return OnePhone;
    }

    public void setOnePhone(PhoneOne onePhone) {
        OnePhone = onePhone;
    }

    public phoneTwo getTwoPhone() {
        return TwoPhone;
    }

    public void setTwoPhone(phoneTwo twoPhone) {
        TwoPhone = twoPhone;
    }

    public phoneThree getThreePhone() {
        return ThreePhone;
    }

    public void setThreePhone(phoneThree threePhone) {
        ThreePhone = threePhone;
    }
}
