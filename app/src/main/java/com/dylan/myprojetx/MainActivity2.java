package com.dylan.myprojetx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

import Model.App;
import Model.Game;
import Model.User;

public class MainActivity2 extends AppCompatActivity {

    private EditText pseudoEdit;
    private Button validationButton;
    private User user =  new User("dylan", "funity");
    private List<App> listApp = new ArrayList<>();
    private App app1;
    private App app2;
    private App app3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        app1 = new Game("","","");
        app2 = new Game("","","");
        app3 = new Game("","","");
        listApp.add(app1);
        listApp.add(app2);
        listApp.add(app3);
        user.setListApp(listApp);
        pseudoEdit = findViewById(R.id.pseudoEdit);
        validationButton = findViewById(R.id.validationButton);

        user.getListApp();
        for (App app: user.getListApp()) {
            Log.i("AppInfos" , app.toString());
        }

    }
}