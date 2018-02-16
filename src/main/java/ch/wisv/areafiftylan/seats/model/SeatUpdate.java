package ch.wisv.areafiftylan.seats.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SeatUpdate {
    private final String group;
    private final Integer number;
    private final SeatUpdateStatus status;

    public SeatUpdate(String group, Integer number, SeatUpdateStatus status) {
        this.group = group;
        this.number = number;
        this.status = status;
    }

    public enum SeatUpdateStatus {
        RESERVED
    }
}
