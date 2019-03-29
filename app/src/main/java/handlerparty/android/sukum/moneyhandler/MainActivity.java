package handlerparty.android.sukum.moneyhandler;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import handlerparty.android.sukum.moneyhandler.views.HomeActivity;

public class MainActivity extends AppCompatActivity {
    Button btnLogin;
    EditText userName;
    EditText passWord;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userName = findViewById(R.id.userName);
        passWord = findViewById(R.id.passWord);
        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(userName.getText().toString() != "sukum" && passWord.getText().toString() != "1234") {
                    Intent intent = new Intent(MainActivity.this , HomeActivity.class);
                    startActivity(intent);
                }
            }
        });

    }
}
