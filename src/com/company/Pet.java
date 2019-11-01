package com.company;

import java.util.Random;

public class Pet {
    private int age = generateDefaultAge();
   private Color color;
   private Shelter shelter;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    private int generateDefaultAge(){
        Random r = new Random();

        return r.nextInt(10);
    }

    public String getInfo(){
        return getAge() + getShelter().getName() +" "+ getShelter().getAddress()+" " + getColor();

    }
}



