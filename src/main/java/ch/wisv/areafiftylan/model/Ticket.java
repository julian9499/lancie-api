package ch.wisv.areafiftylan.model;

import ch.wisv.areafiftylan.model.util.TicketType;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class Ticket {

    @Id
    @GeneratedValue
    Long id;

    String key;

    @ManyToOne
    User owner;

    @ManyToOne
    User previousOwner;

    @Enumerated(EnumType.STRING)
    TicketType type;

    boolean pickupService;

    boolean lockedForTransfer;

    public Ticket(User owner, TicketType type, Boolean pickupService) {
        this.owner = owner;
        this.previousOwner = null;
        this.type = type;
        this.pickupService = pickupService;
        lockedForTransfer = false;
        key = UUID.randomUUID().toString();
    }

    public User getOwner() {
        return owner;
    }

    public TicketType getType() {
        return type;
    }

    public float getPrice() {
        return type.getPrice();
    }

    public boolean hasPickupService() {
        return pickupService;
    }
}
