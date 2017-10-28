package com.example.naman.nutritionchoice.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.naman.nutritionchoice.R;
import com.example.naman.nutritionchoice.adapter.FoodTypeListAdapter;
import com.example.naman.nutritionchoice.model.FoodType;
import com.example.naman.nutritionchoice.model.FoodTypeModel;
import com.example.naman.nutritionchoice.utils.rawDataUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FoodTypeFragment extends Fragment {

    @BindView(R.id.rv_food_type)
    RecyclerView recyclerView;

    FoodTypeListAdapter foodTypeListAdapter;
    ArrayList<FoodType> foodTypes;

    public FoodTypeFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_food_type, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);
        parseFoodTypeData();
        setupRecylerView(view);
    }

    private void setupRecylerView(View view) {
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        foodTypeListAdapter = new FoodTypeListAdapter(foodTypes, getContext());
        recyclerView.setAdapter(foodTypeListAdapter);
    }

    private void parseFoodTypeData() {
        try {
            String jsonObject = rawDataUtil.loadJSONFromAsset(getContext(), "foodType.json");
            Gson gson = new GsonBuilder().create();
            FoodTypeModel foodTypeModel = gson.fromJson(jsonObject, FoodTypeModel.class);
            foodTypes = new ArrayList<>();
            foodTypes.addAll(foodTypeModel.getData());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
