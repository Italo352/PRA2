package com.example.agendiario;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "HardSkill")


public class HardSkill {

    

    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "HardSkillId")
    private int mId;

    @Nullable
    @ColumnInfo(name = "HardSkill")
    private String mName;

    private String mProvelt;

    public Museum(@Nullable String Name, String Provelt, Double Value, String creationDate) {
        mName = Name;
        mProvelt = Provelt;
        mValue = Value;
        mCreationDate = creationDate;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setTitle(String Name) {
        mName = Name;
    }

    public String getProvelt() {
        return mProvelt;
    }

    public void setPersonage(String Provelt) {
        mProvelt = provelt;
    }

    public Double getValue() {
        return mValue;
    }

    public void setScore(Double Value) {
        mValue = value;
    }

    public String getCreationDate() {
        return mCreationDate;
    }

    public void setCreationDate(String creationDate) {
        mCreationDate = creationDate;
    }

    private Double mValue;
    private String mCreationDate;

}
