package handlerparty.android.sukum.moneyhandler.views;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import handlerparty.android.sukum.moneyhandler.R;


public class HomeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_income);
        this.setTitle("Home Income");


        homePageF();
        btnClickF();
    }


    private void homePageF() {

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.layout_fragment_containerH, HomePageFragment.newInstance())
                .commit();
    }

    private void savePageF() {

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.layout_fragment_containerH, SaveFragment.newInstance())
                .commit();
    }

    private void billPageF() {

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.layout_fragment_containerH, BillFragment.newInstance())
                .commit();
    }

    private void btnClickF() {
        findViewById(R.id.btnHome).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                homePageF();
            }
        });
        findViewById(R.id.btnSave).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                savePageF();
            }

        });
        findViewById(R.id.btnBill).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                billPageF();
            }
        });
    }

}
