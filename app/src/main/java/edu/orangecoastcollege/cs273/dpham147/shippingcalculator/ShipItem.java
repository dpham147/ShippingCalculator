package edu.orangecoastcollege.cs273.dpham147.shippingcalculator;

/**
 * Created by dpham147 on 9/13/2016.
 */
public class ShipItem {

    private double mWeight;
    private double mBaseCost;
    private double mAddedCost;
    private double mTotalCost;

    public ShipItem() {
        mWeight = 0.0;
        mBaseCost = 0.0;
        mAddedCost = 0.0;
        mTotalCost = 0.0;
    }

    public ShipItem(double weight) {
        this.mWeight = weight;
    }

    public double getWeight() {
        return mWeight;
    }

    public void setWeight(double mWeight) {
        this.mWeight = mWeight;
    }

    public double getBaseCost() {
        return mBaseCost;
    }

    public void setBaseCost(double mBaseCost) {
        this.mBaseCost = mBaseCost;
    }

    public double getAddedCost() {
        return mAddedCost;
    }

    public void setAddedCost(double mAddedCost) {
        this.mAddedCost = mAddedCost;
    }

    public double getTotalCost() {
        return mTotalCost;
    }

    public void setTotalCost(double mTotalCost) {
        this.mTotalCost = mTotalCost;
    }

    public void recalculate(){

    }
}
