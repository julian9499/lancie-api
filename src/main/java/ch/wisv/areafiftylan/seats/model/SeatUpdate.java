package ch.wisv.areafiftylan.seats.model;

public class SeatUpdate {
    public SeatUpdate(String group, Integer number, SeatUpdateStatus status) {
    }

    public enum SeatUpdateStatus {
        RESERVED
    }
}
