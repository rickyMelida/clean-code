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
public class Square extends Shape{
    public Point topLeft;
    public double side;
    
    public double area() {
        return side * side;
    }
    
}
