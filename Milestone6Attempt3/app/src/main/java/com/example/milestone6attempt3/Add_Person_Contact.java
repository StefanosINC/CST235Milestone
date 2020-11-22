package com.example.milestone6attempt3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Add_Person_Contact extends AppCompatActivity {
    Button btn_ok, btn_cancel;
    EditText txt_name, txt_streetAddress, txt_city, txt_state, txt_zipCode, txt_country,
            txt_phoneNumber, txt_email, txt_nickname ;
    TextView tv_name;
AddressBookAdapaterAndroid adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_person);
        btn_ok = findViewById(R.id.btn_ok);
        txt_name = findViewById(R.id.txt_name);
        txt_city = findViewById(R.id.txt_city);
        txt_country = findViewById(R.id.txt_country);
        txt_email = findViewById(R.id.txt_email);
        txt_nickname = findViewById(R.id.txt_nickname);
        txt_state = findViewById(R.id.txt_state);
        txt_zipCode = findViewById(R.id.txt_zipCode);
        txt_phoneNumber = findViewById(R.id.txt_phoneNumber);



        Bundle incommingIntent = getIntent().getExtras();

            if( incommingIntent != null){
                String name = incommingIntent.getString("name");
                String city = incommingIntent.getString("city");
                String state = incommingIntent.getString("state");
                String country = incommingIntent.getString("country");
                String postalcode = incommingIntent.getString("postalcode");
                String email = incommingIntent.getString("email");
                String phonenumber = incommingIntent.getString("phone");
                String nickname= incommingIntent.getString("nickname");

                tv_name.setText(name);
                txt_city.setText(city);
                txt_country.setText(country);
                txt_email.setText(email);
                txt_nickname.setText(nickname);
                txt_state.setText(state);
                txt_zipCode.setText(postalcode);
                txt_phoneNumber.setText(phonenumber);


        }

        btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 String newname = txt_name.getText().toString();
                   String newcity = txt_city.getText().toString();
                  String newstate =  txt_state.getText().toString();
                   String newcountry = txt_country.getText().toString();
                   String newpostalCode = txt_zipCode.getText().toString();
                  String newphoneNumber =  txt_phoneNumber.getText().toString();
                  String newemail =  txt_email.getText().toString();
                  String newnickname =  txt_nickname.getText().toString();





                Intent i = new Intent(v.getContext(), MainActivity.class);


                i.putExtra("name", newname);
                i.putExtra("city", newcity);
                i.putExtra("state", newstate);
                i.putExtra("zipCode", newpostalCode);
                i.putExtra("phoneNumber", newphoneNumber);
                i.putExtra("email", newemail);
                i.putExtra("nickname", newnickname);
                i.putExtra("country", newcountry);

                startActivity(i);

                }



        });
    }
}