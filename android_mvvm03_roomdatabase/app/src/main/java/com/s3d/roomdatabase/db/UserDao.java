package com.s3d.roomdatabase.db;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface UserDao {

    @Query( "select * from user")
    public List<User> getAllUsers();

    @Insert
    public void insert(User... user);

    @Delete
    public void delete(User user);

    @Query("delete from user")
    public void deleteAll();
}
