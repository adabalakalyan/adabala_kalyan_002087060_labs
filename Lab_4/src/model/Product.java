/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.ArrayList;

/**
 *
 * @author Rushabh
 */
public class Product {
    
    private String name;
    private int price;
    private int id;
    private ArrayList<Feature> features;
    private String imagePath;

 
    public ArrayList<Feature> getFeatures() {
        return features;
    }  

    private static int count = 0;
    
    public Product() {
        count++;
        id = count;
        
        features=new ArrayList<Feature>();
    }
    
    public Feature addNewFeature(){
        Feature newF = new Feature(this,"","");
        features.add(newF);
        return newF;
    }
    
    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    
    
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
    @Override
    public String toString() {
        return name;
    }
    
}
