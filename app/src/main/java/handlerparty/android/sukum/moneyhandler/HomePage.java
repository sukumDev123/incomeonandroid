package handlerparty.android.sukum.moneyhandler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import handlerparty.android.sukum.moneyhandler.views.HomePageFragment;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, HomePageFragment.newInstance())
                    .commitNow();
        }
    }
}
