package projectlocker;

import java.time.LocalTime;

/**
 * @author Pacharaporn Ngaosiri It has rentTime and returnTime
 */
public class LockerTime {

    /**
     * rentTime is attribute
     */
    LocalTime rentTime;
    /**
     * returtTime is attribute
     */
    LocalTime returnTime;

    /**
     * @param time this rentTime is current time this returnTime is time to add
     * by import LocalTime
     */
    public LockerTime(int time) {
        this.rentTime = LocalTime.now();
        this.returnTime = rentTime.plusHours(time);
    }

    /**
     * @return rentTime of the lockerTime
     */
    public LocalTime getRentTime() {
        return rentTime;
    }

    /**
     * @return time of the lockerTime
     */
    public LocalTime getRetunTime() {
        return returnTime;
    }

    /**
     * @return LocalTime.now
     */
    public LocalTime getNowTime() {
        return LocalTime.now();
    }

}
