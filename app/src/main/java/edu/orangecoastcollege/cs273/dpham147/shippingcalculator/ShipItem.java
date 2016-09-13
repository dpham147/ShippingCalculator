package edu.orangecoastcollege.cs273.dpham147.shippingcalculator;

/**
 * Created by dpham147 on 9/13/2016.
 */
public class ShipItem {

    private double mWeightAmount;
    private double mBaseCost;
    private double mAddedCost;
    private double mTotalCost;

    public ShipItem() {
        mWeightAmount = 0.0;
        mBaseCost = 0.0;
        mAddedCost = 0.0;
        mTotalCost = 0.0;
    }

    public double getWeightAmount() {
        return mWeightAmount;
    }

    public void setWeightAmount(double mWeightAmount) {
        this.mWeightAmount = mWeightAmount;
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
