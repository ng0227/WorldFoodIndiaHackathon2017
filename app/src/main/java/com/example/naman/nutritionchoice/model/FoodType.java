package com.example.naman.nutritionchoice.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by naman on 27-Oct-17.
 */

public class FoodType implements Parcelable{

    @SerializedName(" Name")
    @Expose
    private String name;
    @SerializedName("Type")
    @Expose
    private String type;
    @SerializedName("Energy")
    @Expose
    private double energy;
    @SerializedName("Moisture")
    @Expose
    private double moisture;
    @SerializedName("Protein")
    @Expose
    private double protein;
    @SerializedName("Fat")
    @Expose
    private double fat;
    @SerializedName("Mineral")
    @Expose
    private double mineral;
    @SerializedName("Fibre")
    @Expose
    private double fibre;
    @SerializedName("Carbohydrates")
    @Expose
    private double carbohydrates;
    @SerializedName("Calcium")
    @Expose
    private double calcium;
    @SerializedName("Phosphorus")
    @Expose
    private double phosphorus;
    @SerializedName("Iron")
    @Expose
    private double iron;

    protected FoodType(Parcel in) {
        name = in.readString();
        type = in.readString();
        energy = in.readDouble();
        moisture = in.readDouble();
        protein = in.readDouble();
        fat = in.readDouble();
        mineral = in.readDouble();
        fibre = in.readDouble();
        carbohydrates = in.readDouble();
        calcium = in.readDouble();
        phosphorus = in.readDouble();
        iron = in.readDouble();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(type);
        dest.writeDouble(energy);
        dest.writeDouble(moisture);
        dest.writeDouble(protein);
        dest.writeDouble(fat);
        dest.writeDouble(mineral);
        dest.writeDouble(fibre);
        dest.writeDouble(carbohydrates);
        dest.writeDouble(calcium);
        dest.writeDouble(phosphorus);
        dest.writeDouble(iron);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<FoodType> CREATOR = new Creator<FoodType>() {
        @Override
        public FoodType createFromParcel(Parcel in) {
            return new FoodType(in);
        }

        @Override
        public FoodType[] newArray(int size) {
            return new FoodType[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getEnergy() {
        return energy;
    }

    public void setEnergy(double energy) {
        this.energy = energy;
    }

    public double getMoisture() {
        return moisture;
    }

    public void setMoisture(double moisture) {
        this.moisture = moisture;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public double getMineral() {
        return mineral;
    }

    public void setMineral(double mineral) {
        this.mineral = mineral;
    }

    public double getFibre() {
        return fibre;
    }

    public void setFibre(double fibre) {
        this.fibre = fibre;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public double getCalcium() {
        return calcium;
    }

    public void setCalcium(double calcium) {
        this.calcium = calcium;
    }

    public double getPhosphorus() {
        return phosphorus;
    }

    public void setPhosphorus(double phosphorus) {
        this.phosphorus = phosphorus;
    }

    public double getIron() {
        return iron;
    }

    public void setIron(double iron) {
        this.iron = iron;
    }
}
