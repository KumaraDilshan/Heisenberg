package com.company;

import org.junit.Test;

import static org.junit.Assert.*;


/**
 * Created by Gerrie on 7/7/2016.
 */
public class BallTest {
    @Test
    public void updateTime() throws Exception {
        //fail("This hasn't implemented yet");

        Ball b1 = new Ball(0.0, 1.0, 10.0, 45.0);
        Ball.updateTime(10.0);
        Ball b2= new Ball(70.71067811865476, 71.71067811865474,5.0,75);

        boolean actual=b1.willCollide(b2);
        boolean expected=true;

        assertEquals(actual,expected);

    }

    @Test
    public void showAll() throws Exception {
       // fail("This hasn't implemented yet");
    }

    @Test
    public void willCollide() throws Exception {
        //fail("This hasn't implemented yet");

        //test 1
        Ball b1 = new Ball(2.35689741, 1214.3569874521, 10.0, 45.4);
        Ball b2 = new Ball(2.35689741, 1214.3569874521, 23.56, 145.5);

        boolean actual1=b1.willCollide(b2);
        boolean expected1=true;

        assertEquals(expected1, actual1);


        //test 2
        Ball b3 = new Ball(2.37589741, 1214.3569874521, 10.0, 45.4);
        Ball b4 = new Ball(2.35689781, 1214.3569874521, 23.56, 145.5);

        boolean actual2=b3.willCollide(b4);
        boolean expected2=false;

        assertEquals(expected2,actual2);


        //test 3
        Ball b5 = new Ball(20.37589741, 1214.356945521, 10.0, 45.4);
        Ball b6 = new Ball(20.37589741, 1214.3569874521, 23.56, 145.5);

        boolean actual3=b6.willCollide(b5);
        boolean expected3=false;

        assertEquals(expected3,actual3);


        //test 4
        Ball b7 = new Ball(30.37589741, 1214.356945521, 10.0, 45.4);
        Ball b8 = new Ball(20.37589741, 1214.3569874521, 23.56, 145.5);

        boolean actual4=b6.willCollide(b5);
        boolean expected4=false;

        assertEquals(expected4,actual4);

    }

}