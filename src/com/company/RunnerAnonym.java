package com.company;

/**
 * Created by uitschool JV on 1/31/2016.
 */
public class RunnerAnonym {
    public static void main(String[] args) {
        TypeQuest unique = new TypeQuest()
        {
          public void addNewType(){
              System.out.println("quest with free answer was added");
          }
        };
        unique.addNewType();

        new TypeQuest(71)
        {
          private String name = "Drag&Drop";
            public void addNewType()
            {
                System.out.println("added" + getName());
            }
            String getName(){return name;}
        }.addNewType();

        TypeQuest standart = new TypeQuest(35);
        standart.addNewType();
    }
}
