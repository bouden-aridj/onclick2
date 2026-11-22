package com.example.onclick;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }


    public void loginEvent(View V) {
        EditText nameTxt = (EditText) findViewById(R.id.nameTxt);
        String name = nameTxt.getText().toString();
        EditText pwdTxt = (EditText) findViewById(R.id.PwdTxt);
        String pwd = pwdTxt.getText().toString();
        if (name.equalsIgnoreCase("Ali") && pwd.equalsIgnoreCase("Algeria")) {
            Toast.makeText(this, "Login correct", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Login incorrect", Toast.LENGTH_LONG).show();
        }
    }
public void CancelEvent(View V){
    EditText nameTxt = (EditText) findViewById(R.id.nameTxt);
    EditText pwdTxt = (EditText) findViewById(R.id.PwdTxt);
    nameTxt.setText("");
    pwdTxt.setText("");

 }
}