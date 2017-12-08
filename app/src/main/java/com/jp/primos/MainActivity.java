package com.jp.primos;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText inputNumber = (EditText) findViewById(R.id.inputNumber);

        inputNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txtResult = (TextView) findViewById(R.id.txtResult);
                txtResult.setText("");
            }
        });

        Button btnCheck = (Button) findViewById(R.id.btnCheck);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText inputNumber = (EditText) findViewById(R.id.inputNumber);
                TextView txtResult = (TextView) findViewById(R.id.txtResult);

                if (inputNumber.getText().equals(null)) return;

                number = Integer.parseInt( inputNumber.getText().toString() );

                boolean result = isPrime( number );

                if (result == true){
//                    Toast.makeText( getApplicationContext(), "É primo! É primo!", Toast.LENGTH_SHORT )
//                            .show();

                    //Display text message
                    txtResult.setTextColor(Color.GREEN);
                    txtResult.setText("Este é um número primo!");

                }else{
//                    Toast.makeText( getApplicationContext(), "Nãããããããõ!", Toast.LENGTH_SHORT )
//                            .show();

                    //Display text message
                    txtResult.setTextColor(Color.RED);
                    txtResult.setText("Este número não é primo.");
                }
            }
        });
    }

    private static boolean isPrime( int n ){
        int i,m=0;
        m=n/2;

        for(i=2;i<=m;i++){
            if(n%i==0)
                return false;
        }

        return true;
    }
}
