package com.example.asus.pizza;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    CheckBox avocado, brocolli, onions, zuchinni, lobster, oyster, salmon, tuna, bacon, duck, ham, sausage;
    RadioButton small, medium, large, pizza1, pizza2, pizza3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pizza1 = (RadioButton) findViewById(R.id.price1);
        pizza1.setOnClickListener(this);
        pizza2 = (RadioButton) findViewById(R.id.price2);
        pizza2.setOnClickListener(this);
        pizza3 = (RadioButton) findViewById(R.id.price3);
        pizza3.setOnClickListener(this);

        small = (RadioButton) findViewById(R.id.small);
        small.setOnClickListener(this);
        medium = (RadioButton) findViewById(R.id.medium);
        medium.setOnClickListener(this);
        large = (RadioButton) findViewById(R.id.large);
        large.setOnClickListener(this);

        avocado = (CheckBox) findViewById(R.id.avocado);
        avocado.setOnClickListener(this);
        brocolli = (CheckBox) findViewById(R.id.brocolli);
        brocolli.setOnClickListener(this);
        onions = (CheckBox) findViewById(R.id.onions);
        onions.setOnClickListener(this);
        zuchinni = (CheckBox) findViewById(R.id.zuchinni);
        zuchinni.setOnClickListener(this);

        lobster = (CheckBox) findViewById(R.id.lobster);
        lobster.setOnClickListener(this);
        oyster = (CheckBox) findViewById(R.id.oyster);
        oyster.setOnClickListener(this);
        salmon = (CheckBox) findViewById(R.id.salmon);
        salmon.setOnClickListener(this);
        tuna = (CheckBox) findViewById(R.id.tuna);
        tuna.setOnClickListener(this);

        bacon = (CheckBox) findViewById(R.id.bacon);
        bacon.setOnClickListener(this);
        duck = (CheckBox) findViewById(R.id.duck);
        duck.setOnClickListener(this);
        ham = (CheckBox) findViewById(R.id.ham);
        ham.setOnClickListener(this);
        sausage = (CheckBox) findViewById(R.id.sausage);
        sausage.setOnClickListener(this);

        small.setEnabled(false);
        medium.setEnabled(false);
        large.setEnabled(false);

        avocado.setEnabled(false);
        brocolli.setEnabled(false);
        onions.setEnabled(false);
        zuchinni.setEnabled(false);
        lobster.setEnabled(false);
        oyster.setEnabled(false);
        salmon.setEnabled(false);
        tuna.setEnabled(false);
        bacon.setEnabled(false);
        duck.setEnabled(false);
        ham.setEnabled(false);
        sausage.setEnabled(false);
    }

    @Override
    public void onClick(View v) {
        int totalPrice = 0;

        if (pizza1.isChecked()){
            small.setEnabled(true);
            medium.setEnabled(true);
            large.setEnabled(true);

            avocado.setEnabled(true);
            brocolli.setEnabled(true);
            onions.setEnabled(true);
            zuchinni.setEnabled(true);
            tuna.setEnabled(true);
            ham.setEnabled(true);
            lobster.setEnabled(false);
            lobster.setChecked(false);
            oyster.setEnabled(false);
            oyster.setChecked(false);
            salmon.setEnabled(false);
            salmon.setChecked(false);
            bacon.setEnabled(false);
            bacon.setChecked(false);
            duck.setEnabled(false);
            duck.setChecked(false);
            sausage.setEnabled(false);
            sausage.setChecked(false);

            totalPrice += 8;
        }

        if (pizza2.isChecked()){
            small.setEnabled(true);
            medium.setEnabled(true);
            large.setEnabled(true);

            brocolli.setEnabled(true);
            onions.setEnabled(true);
            zuchinni.setEnabled(true);
            lobster.setEnabled(true);
            oyster.setEnabled(true);
            salmon.setEnabled(true);
            bacon.setEnabled(true);
            ham.setEnabled(true);
            avocado.setEnabled(false);
            avocado.setChecked(false);
            tuna.setEnabled(false);
            tuna.setChecked(false);
            duck.setEnabled(false);
            duck.setChecked(false);
            sausage.setEnabled(false);
            sausage.setChecked(false);

            totalPrice += 10;
        }

        if (pizza3.isChecked()){
            small.setEnabled(true);
            medium.setEnabled(true);
            large.setEnabled(true);

            brocolli.setEnabled(true);
            onions.setEnabled(true);
            zuchinni.setEnabled(true);
            tuna.setEnabled(true);
            bacon.setEnabled(true);
            duck.setEnabled(true);
            ham.setEnabled(true);
            sausage.setEnabled(true);
            avocado.setEnabled(false);
            avocado.setChecked(false);
            lobster.setEnabled(false);
            lobster.setChecked(false);
            oyster.setEnabled(false);
            oyster.setChecked(false);
            salmon.setEnabled(false);
            salmon.setChecked(false);

            totalPrice +=12;
        }

        //Size
        if (small.isChecked()){
            totalPrice -= 1;
        }
        if (medium.isChecked()){
            totalPrice += 0;
        }
        if (large.isChecked()){
            totalPrice += 2;
        }

        //Topping
        if (avocado.isChecked()){
            totalPrice += 1;
        }
        if (brocolli.isChecked()){
            totalPrice += 1;
        }
        if (onions.isChecked()){
            totalPrice += 1;
        }
        if (zuchinni.isChecked()){
            totalPrice += 1;
        }
        if (lobster.isChecked()){
            totalPrice += 2;
        }
        if (oyster.isChecked()) {
            totalPrice += 2;
        }
        if (salmon.isChecked()) {
            totalPrice += 2;
        }
        if (tuna.isChecked()) {
            totalPrice += 2;
        }
        if (bacon.isChecked()){
            totalPrice += 3;
        }
        if (duck.isChecked()){
            totalPrice += 3;
        }
        if (ham.isChecked()){
            totalPrice += 3;
        }
        if (sausage.isChecked()){
            totalPrice += 3;
        }

        TextView priceTotal = (TextView) findViewById(R.id.price);
        priceTotal.setText(String.format(Locale.ENGLISH, "$ %d", totalPrice));
    }

    public void sendImage(View v){
        Intent i = new Intent(MainActivity.this,ImageFull.class);
        i.putExtra("resId", R.drawable.pizza1);
        startActivity(i);
    }

    public void sendImage2(View v){
        Intent i = new Intent(MainActivity.this,ImageFull.class);
        i.putExtra("resId", R.drawable.pizza2);
        startActivity(i);
    }

    public void sendImage3(View v){
        Intent i = new Intent(MainActivity.this,ImageFull.class);
        i.putExtra("resId", R.drawable.pizza3);
        startActivity(i);
    }
}
