package com.myapp.galaxytraining.myapp;

import android.content.Context;
import android.preference.PreferenceFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MaiActivity";

    private EditText mEtUserName;
    private EditText mEtPassword;
    private Button mBtnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"Estamos en OnCreate()");

        mEtUserName = (EditText) findViewById(R.id.et_username);
        mEtPassword = (EditText) findViewById(R.id.et_password);
        mBtnLogin = (Button) findViewById(R.id.btn_Login);

        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Ocultar Teclado
                View v = MainActivity.this.getCurrentFocus();
                if(v != null){
                    InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(v.getWindowToken(),0);
                }
                //Fin Oculta Teclado

                String userName = mEtUserName.getText().toString();
                String password = mEtPassword.getText().toString();

                if(userName.equals("ozner") && password.equals("123456")){
                    Toast.makeText(MainActivity.this, R.string.mensaje_login_ok, Toast.LENGTH_LONG).show();

                }else {
                    Toast.makeText(MainActivity.this, R.string.mensaje_login_wrong, Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"Estamos en onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"Estamos en onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"Estamos en onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"Estamos en onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"Estamos en onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"Estamos en onDestroy");
    }
}
