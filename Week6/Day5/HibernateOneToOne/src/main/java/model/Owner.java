package model;

import javax.persistence.*;

@Entity
@Table
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ownerId;
    private String ownerName;
    @OneToOne
    @JoinColumn(name = "carId")
    private Car car;

    public Owner() {
    }

    public Owner(int ownerId, String ownerName, Car car) {
        this.ownerId = ownerId;
        this.ownerName = ownerName;
        this.car = car;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "ownerId=" + ownerId +
                ", ownerName='" + ownerName + '\'' +
                ", car=" + car +
                '}';
    }
}
