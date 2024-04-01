package com.mycompany.Hero;



public class Hero {
    
 String name;
 String description;
 boolean layer;


    public Hero(String name, String description, boolean layer) {
        this.name = name;
        this.description = description;
        this.layer = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isLayer() {
        return layer;
    }

    public void setLayer(boolean layer) {
        this.layer = layer;
    }

    @Override
    public String toString() {
        return "Hero{" + "name=" + name + ", description=" + description + ", layer=" + layer + '}';
    }
    
    
}

