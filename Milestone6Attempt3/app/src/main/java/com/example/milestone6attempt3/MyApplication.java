package com.example.milestone6attempt3;

import android.app.Application;

public class MyApplication extends Application {



    private AddressBook theList = new AddressBook();

    public AddressBook getTheList() {
        return theList;
    }

    public void setTheList(AddressBook theList) {
        this.theList = theList;
    }


}
