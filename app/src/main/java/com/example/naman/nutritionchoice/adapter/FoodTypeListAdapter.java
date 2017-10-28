package com.example.naman.nutritionchoice.adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.naman.nutritionchoice.R;
import com.example.naman.nutritionchoice.model.FoodType;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by naman on 27-Oct-17.
 */

public class FoodTypeListAdapter extends RecyclerView.Adapter<FoodTypeListAdapter.FoodListViewHolder> {

    private ArrayList<FoodType> foodType;
    private Context context;

    public FoodTypeListAdapter(ArrayList<FoodType> foodType, Context context) {
        this.foodType = foodType;
        this.context = context;
    }

    @Override
    public FoodListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.food_type_row_layout, parent, false);
        return new FoodListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(FoodListViewHolder holder, int position) {
    //do your work for card
    }

    @Override
    public int getItemCount() {
        return foodType.size();
    }

    public class FoodListViewHolder extends RecyclerView.ViewHolder {

    /*    @BindView(R.id.cardView)
        CardView cardView;
   */     @BindView(R.id.foodTypeImage)
        ImageView foodTypeImage;
        @BindView(R.id.foodTypeName)
        TextView foodTypeName;

        public FoodListViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
