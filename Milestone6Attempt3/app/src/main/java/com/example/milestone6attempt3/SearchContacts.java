package com.example.milestone6attempt3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class SearchContacts extends AppCompatActivity {

    AddressBook theList;
    AddressBook searchList;
    AddressBookAdapaterAndroid adapter;


    ListView lv_contactsSearched;

    Button btn_search, btn_cancle;
    EditText txt_searchText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_contacts);

        lv_contactsSearched = findViewById(R.id.lv_contactsSearched);
        btn_search = findViewById(R.id.btn_search);
        btn_cancle = findViewById(R.id.btn_cancel);
        txt_searchText = findViewById(R.id.txt_searchText);


        searchList = new AddressBook();
        adapter = new AddressBookAdapaterAndroid(SearchContacts.this, searchList);


        btn_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String search = txt_searchText.getText().toString();

           //     adapter = new AddressBookAdapaterAndroid(SearchContacts.this,

lv_contactsSearched.setAdapter(adapter);

adapter.notifyDataSetChanged();

                }

      //  }
  //  } ;
   // };
       });
    }
}


