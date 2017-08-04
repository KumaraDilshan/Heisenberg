package com.company;
/* Your E/13/004 */

/* If you want to import any pkgs you need*/

import java.lang.Math;
import java.util.ArrayList;

public class Ball {

    /* What data should we have ? */    //fields
    private double x;
    private double y;
    private double speed;
    private double angleOfSpeed;

    private static ArrayList<Ball> ballslist = new ArrayList<>();   //arraylist

    public Ball(double x, double y, double speed, double angleOfSpeed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.angleOfSpeed = angleOfSpeed;
        ballslist.add(this);    //The adding elements to arraylist is also done inside the constructor itself
    }




    public static void updateTime(double time) { /* return type? should this be static? */ /*from this method all the created ball
        object's x and y cordinates are updates.this is static beacause all the objects are update from this method.Not a particular
        object*/
        double distance;
        for(Ball p: ballslist) {
            distance = p.speed* time;
            p.x=(p.x+distance * Math.cos(Math.toRadians(p.angleOfSpeed)));
            p.y=(p.y+distance * Math.sin(Math.toRadians(p.angleOfSpeed)));
        }
    }


    //@Override
    public String toString(int num) {  //this is connected to showall method.This method return a particular Ball object's status
        return "Ball" +num+
                " : (" + this.x +
                ", " + this.y +
                ')';
    }

    public static void showAll(int num_ball) { /* should this be static? */
    /* Go through all the balls that are there in the system and display them */
    /* May be you can have a function within the class to display */

        /*This method also static  because this is also relevant to all ball objects.Not only one object.To string method has been
        connected to this method*/
        int counter=num_ball+1;
        for(Ball p: ballslist) {
            System.out.println(p.toString(counter));
            counter++;
        }
    }

    public Boolean willCollide(Ball ball) {//This method return true if the given to object's both X and Y cordinates are same.Else false
        if(this.x==ball.x && this.y==ball.y)
            return true;
        else
            return false;
    }

}