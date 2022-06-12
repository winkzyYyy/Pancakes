package com.example.panackes.pancakes;

import com.example.panackes.category.Category;
import com.example.panackes.ingridients.Ingridients;
import com.sun.javafx.beans.IDProperty;

import javax.persistence.*;
import java.util.List;

 public class Pancakes {

    private int id;
    public List<Ingridients> ingridients;

     public Pancakes() {
     }

     public Pancakes(int id, List<Ingridients> ingridients) {
         this.id = id;
         this.ingridients = ingridients;
     }

     public Pancakes(List<Ingridients> ingridients) {
         this.ingridients = ingridients;
     }

     public int getId() {
         return id;
     }

     public List<Ingridients> getIngridients() {
         return ingridients;
     }

     public void setIngridients(List<Ingridients> ingridients) {
         this.ingridients = ingridients;
     }
 }
