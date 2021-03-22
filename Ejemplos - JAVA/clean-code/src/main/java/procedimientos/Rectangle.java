/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procedimientos;

import java.awt.Point;

/**
 *
 * @author ricky
 */
public class Rectangle extends Shape{
    public Point topLeft;
    public double height;
    public double width;
    
    public double area() {
        return height * width;
    }
}
