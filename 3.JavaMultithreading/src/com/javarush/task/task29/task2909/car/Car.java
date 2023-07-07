package com.javarush.task.task29.task2909.car;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public abstract class Car {
    static public final int TRUCK = 0;
    static public final int SEDAN = 1;
    static public final int CABRIOLET = 2;

    public double fuel;

    public double summerFuelConsumption;
    public double winterFuelConsumption;
    public double winterWarmingUp;

    private int type;
    @Getter
    @Setter
    private boolean driverAvailable;
    private int numberOfPassengers;

    protected Car(int type, int numberOfPassengers) {
        this.type = type;
        this.numberOfPassengers = numberOfPassengers;
    }

    public static Car create(int type, int numberOfPassengers){
        if(type == 0){
            return new Truck(numberOfPassengers);
        } else if (type == 1) {
            return new Sedan(numberOfPassengers);
        } else if (type == 2) {
            return new Cabriolet(numberOfPassengers);
        }else {
            return null;
        }
    }

    public void fill(double numberOfLiters) {
        if (numberOfLiters < 0)
            throw new IndexOutOfBoundsException();
        fuel += numberOfLiters;
    }

    public double getTripConsumption(Date date, int length, Date SummerStart, Date SummerEnd) {
        return isSummer(date, SummerStart, SummerEnd) ?
                getSummerConsumption(length) : getWinterConsumption(length);
    }

    public double getWinterConsumption(int length){
        return length * winterFuelConsumption + winterWarmingUp;
    }

    public double getSummerConsumption(int length){
        return length * summerFuelConsumption;
    }


    public int getNumberOfPassengersCanBeTransferred() {
        if (!canPassengersBeTransferred())
            return 0;
        return numberOfPassengers;
    }

    public void startMoving() {
        if (numberOfPassengers > 0) {
            fastenPassengersBelts();
        }
        fastenDriverBelt();
    }

    public void fastenPassengersBelts() {
    }

    public void fastenDriverBelt() {
    }

    public abstract int getMaxSpeed();

    public boolean isSummer(Date date, Date summerStart, Date summerEnd){
        return date.after(summerStart) && date.before(summerEnd);
    }

    private boolean canPassengersBeTransferred(){
        return isDriverAvailable() && fuel > 0;
    }
}