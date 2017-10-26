package com.example.naman.nutritionchoice.activity;

import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import com.example.naman.nutritionchoice.R;
import com.example.naman.nutritionchoice.utils.KeyboardUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CreateFoodGiveawayPostActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.bt_post)
    Button btPost;
    @BindView(R.id.et_name_of_place_person)
    EditText etNameOfThePlace;
    @BindView(R.id.et_address)
    EditText etAddress;
    @BindView(R.id.et_phone_number)
    EditText etPhoneNumber;
    @BindView(R.id.et_description)
    EditText etFoodDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_food_giveaway_post);

        ButterKnife.bind(this);
        setupToolbar();
    }

    @OnClick(R.id.bt_post)
    public void onClickPost() {
        KeyboardUtils.hideSoftInput(this);
        if (checkValidation()) {
            //TODO: do post request
        }
    }

    private boolean checkValidation() {
        return validateName(etNameOfThePlace) &
                validateName(etPhoneNumber) &
                validateName(etAddress) &
                validateName(etFoodDescription);
    }

    private boolean validateName(EditText et) {
        if (et.getText().toString().trim().isEmpty()) {
            et.setError(this.getString(R.string.err_msg_empty));
            return false;
        }
        return true;
    }

    private void setupToolbar() {
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.create_food_giveaway_post);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            getWindow().setStatusBarColor(ContextCompat.getColor(this, R.color.colorPrimaryDark));
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}