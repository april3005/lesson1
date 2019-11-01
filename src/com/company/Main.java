package com.company;

public class Main {

    public static void main(String[] args) {

        Dog dog1 = new Dog();


        Dog dog2 = new Dog ("Buddy", "Golden Retriever", Color.WHITE, new Shelter("Big Heart", "Toktogula") );

        Dog dog3 = new Dog("Delta", "Husky", new String[]{"Sit", "Make voice", "High five"}, new Shelter("Big Heart", "Toktogula"), Color.WHITE);

        System.out.println(dog3.getInfo());

        dog2.makeVoice();
        dog3.makeVoice("Woof-woof");


    }

}
