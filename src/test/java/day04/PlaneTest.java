package day04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlaneTest {

    @Test
    void testLaguages(){
        Plane plane = new Plane(100);
        plane.addPassenger(new Passenger("Jozsi","fr124",2));
        plane.addPassenger(new Passenger("Jozsi","fr124",1));
        plane.addPassenger(new Passenger("Jozsi","fr124",2));
        plane.addPassenger(new Passenger("Jozsi","fr124",1));

        assertEquals(6,plane.numberOfPackages());
    }

}