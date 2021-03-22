/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procedimientos;

/**
 *
 * @author ricky
 */
public class Geometry {
    public final double PI = 3.141592653589793;
    
    public double area(Object shape) throws NoSuchShapeException {
        if(shape instanceof Square) {
            Square s = (Square) shape;
            return s.side * s.side;
        } 
        else if(shape instanceof Rectangle) {
            Rectangle r = (Rectangle) shape;
            return r.height * r.width;
        } 
        else if(shape instanceof Circle) {
            Circle c = (Circle) shape;
            return PI * c.radius * c.radius;
        }
        
        throw new NoSuchShapeException();
    }

    
    private static class NoSuchShapeException extends Exception {

        public NoSuchShapeException() {
        }
    }
    
}
