package io.zipcoder.pets;


import java.util.Comparator;

abstract public class Pet implements Comparable<Pet>, Comparator<Pet> {

    protected String name;

    public Pet(String name){
        this.name = name;
    }

    public Pet(){

    }

    public void setName (String name){

        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public String speak(){
        return "I am a pet";
    }

    @Override
    public String toString(){
        return this.getName();
    }

    public int compareTo(Pet o1){
        int compare = this.getName().compareToIgnoreCase(o1.getName());
        if(compare != 0){
            return compare;
        }
        else{
            compare = this.getClass().getSimpleName()
                    .compareToIgnoreCase(o1.getClass().getSimpleName());
            return compare;
        }
    }



    public int compare(Pet o1, Pet o2) {
        int compare = o1.getClass().getSimpleName().compareToIgnoreCase(o2.getClass().getSimpleName());
        if(compare != 0){
            return compare;
        }
        else{
            compare = o1.getName().compareToIgnoreCase(o2.getName());
            return compare;
        }
    }






}
