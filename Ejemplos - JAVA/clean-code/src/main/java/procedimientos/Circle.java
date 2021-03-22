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
public class Circle extends Shape{
    public Point center;
    public double radius;
    public final double PI = 3.141592653589793;
    
    public double area() {
        return PI * radius * radius;
    }
    
}
