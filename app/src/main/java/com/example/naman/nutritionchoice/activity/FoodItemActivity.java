package com.example.naman.nutritionchoice.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.naman.nutritionchoice.R;
import com.example.naman.nutritionchoice.model.FoodTypeModel;
import com.example.naman.nutritionchoice.utils.rawDataUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;

public class FoodItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_item);

        parseFoodTypeData();
    }

    private void parseFoodTypeData() {
        try {
            String jsonObject = rawDataUtil.loadJSONFromAsset(this, "foodType.json");
            Gson gson = new GsonBuilder().create();
            FoodTypeModel foodTypeModel = gson.fromJson(jsonObject, FoodTypeModel.class);

            Log.d("TESTING",foodTypeModel.getData().get(0).getName()+" "+foodTypeModel.getData().get(0).getCalcium());


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}