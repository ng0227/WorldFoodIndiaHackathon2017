package com.example.naman.nutritionchoice.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by naman on 27-Oct-17.
 */

public class FoodTypeModel {

    @SerializedName("data")
    @Expose
    private ArrayList<FoodType> data=new ArrayList<>();

    public ArrayList<FoodType> getData() {
        return data;
    }

    public void setData(ArrayList<FoodType> data) {
        this.data = data;
    }
}
