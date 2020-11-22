package com.example.milestone6attempt3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Add_Business_Contact extends AppCompatActivity {
    Button btn_ok, btn_cancel;
    EditText txt_name,  txt_city, txt_state, txt_zipCode, txt_country,
            txt_phoneNumber, txt_email, txt_companyName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add__business__contact);

            btn_ok = findViewById(R.id.btn_ok);
            txt_name = findViewById(R.id.txt_name);
            txt_city = findViewById(R.id.txt_city);
            txt_country = findViewById(R.id.txt_country);
            txt_email = findViewById(R.id.txt_email);
            txt_companyName = findViewById(R.id.txt_companyName);
            txt_state = findViewById(R.id.txt_state);
            txt_zipCode = findViewById(R.id.txt_zipCode);
            txt_phoneNumber = findViewById(R.id.txt_phoneNumber);

            btn_ok.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    String newname = txt_name.getText().toString();
                    String newcity = txt_city.getText().toString();
                    String newstate = txt_state.getText().toString();
                    String newcountry = txt_country.getText().toString();
                    String newpostalCode = txt_zipCode.getText().toString();
                    String newphoneNumber = txt_phoneNumber.getText().toString();
                    String newemail = txt_email.getText().toString();
                    String newcompanyName = txt_companyName.getText().toString();


                    Intent i = new Intent(v.getContext(), MainActivity.class);


                    i.putExtra("name", newname);
                    i.putExtra("city", newcity);
                    i.putExtra("state", newstate);
                    i.putExtra("zipCode", newpostalCode);
                    i.putExtra("phoneNumber", newphoneNumber);
                    i.putExtra("email", newemail);
                    i.putExtra("companyName", newcompanyName);
                    i.putExtra("country", newcountry);


                    startActivity(i);

                }

            });
        }
    }


