package com.s3d.roomdatabase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.os.Handler;

import com.s3d.roomdatabase.db.User;
import com.s3d.roomdatabase.db.UserDatabase;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    UserDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = Room.databaseBuilder(getApplicationContext(), UserDatabase.class ,"userDatabase").build();

        User user1 = new User("zhimin" , "zhao" , 32 , true);
        User user2 = new User("zhimin1" , "zhao1" , 33 , true);
        User user3 = new User("zhimin2" , "zhao2" , 12 , false);

        //TODO Cannot access database on the main thread since it may potentially lock the UI for a long period of time.
        db.getUserDao().insert(user1);

    }

    private void displayAllUser() {
        List<User> users = db.getUserDao().getAllUsers();


    }
}