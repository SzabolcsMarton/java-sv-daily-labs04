package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ActorTest {
    @Test
    public void createActor(){
        Actor actor = new Actor("John Doe", 1980);

        assertEquals("John Doe", actor.getName());
        assertEquals(1980, actor.getYearOfBirth());
    }

}