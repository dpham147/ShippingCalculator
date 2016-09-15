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
        mBaseCost = 3.0;
        mAddedCost = 0.0;
        mTotalCost = 0.0;
    }

    public ShipItem(double weight) {
        this.mWeight = weight;
        recalculate();
    }

    public double getWeight() {
        return mWeight;
    }

    public void setWeight(double mWeight) {
        this.mWeight = mWeight;
        recalculate();
    }

    public double getBaseCost() {
        return mBaseCost;
    }

    public double getAddedCost() {
        return mAddedCost;
    }

    public double getTotalCost() {
        return mTotalCost;
    }

    public void recalculate(){
        if (mWeight > 16.0){
            mAddedCost = 0.5 * Math.ceil((mWeight - 16.0) / 4.0);
            mTotalCost = mBaseCost + mAddedCost;
        }
        else{
            mAddedCost = 0.0;
            mTotalCost = mBaseCost;
        }
    }
}
