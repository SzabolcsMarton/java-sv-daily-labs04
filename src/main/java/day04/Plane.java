package day04;

import java.util.ArrayList;
import java.util.List;

public class Plane {

    private int maxCapacity;
    private List<Passenger> passangerOnBoard = new ArrayList<>();

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public List<Passenger> getPassangerOnBoard() {
        return passangerOnBoard;
    }

    public Plane(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public boolean addPassenger(Passenger passenger) {
        if (maxCapacity > passangerOnBoard.size()) {
            passangerOnBoard.add(passenger);
        } else {
            return false;
        }
        return true;
    }

    public int numberOfPackages() {
        int count = 0;
        for (Passenger passenger : passangerOnBoard) {
            count += passenger.getLagguages();
        }
        return count;
    }


}
