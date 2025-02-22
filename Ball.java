/**
 *      This program creates a Ball object and returns volume and size as a toString
 *
 *      Date Last Modified: 9/7/2023
 *      @author Zach Drumheller, Gabriel Hayden
 *
 *      CS1122, Fall 2023
 *      Lab Section 03
 */
public class Ball {
    private double radius; //radius for the ball

    /**
     * Constructor for initializing the radius of the Ball.
     * @param radius : initial value assigned to the radius of the ball.
     */
    public Ball(double radius){
        this.radius = radius;
    }

    /**
     * Method for determining the volume of the Ball.
     */
    public double getVolume(){
        return ((double)4/3)*Math.PI*Math.pow(radius,3);
    }

    //returns the radius
    public double getRadius() {
        return radius;
    }

    //sets the radius, intakes a double input
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Each Ball should be stringified as follows:
     *
     * SIZE Ball volume
     *
     * Where SIZE is equal to:
     * TINY when the radius < 10
     * SMALL when the radius < 50
     * MEDIUM when the radius < 100
     * BIG when the radius < 500
     * HUGE otherwise
     *
     * Ball is the data type of the object.
     *
     * volume is the result of calling getVolume()
     */
    public String toString() {
        double v = getVolume();
        String size = "SIZE";
        if(v < 10)
           size = "TINY" ;
        else if(v < 50)
            size = "SMALL" ;
        else if(v < 100)
            size = "MEDIUM" ;
        else if(v < 500)
            size = "BIG" ;
        else
            size = "HUGE" ;

        return size + " Ball " + String.format("%.3f",getVolume());
    }
}
