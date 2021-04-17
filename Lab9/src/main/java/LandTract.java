/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Blank47
 */
public class LandTract {
    
    private double length;
    private double width;

    public LandTract(double length, double width) {
        this.length = length;
        this.width = width;
    }
      public LandTract(LandTract land) {
        this.length = land.getLength();
        this.width =  land.getWidth();
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    public double getArea() {
        return this.length * this.width;
    }
    
     public boolean equals(LandTract obj) {
        if (this.length == obj.getLength() && this.width == obj.getWidth()) {
            return true;
        } else {
            return false;
        }
     }
}
