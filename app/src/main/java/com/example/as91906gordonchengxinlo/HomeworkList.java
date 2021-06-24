package com.example.as91906gordonchengxinlo;

import java.net.IDN;
//  define value and their type
public class HomeworkList {
    public int ID;
    public String Date;
    public String ClassName;
    public String Name;
    public String Information;

    //  apply value into list
    public HomeworkList(int ID,String Date,String ClassName, String Name, String Information){
        this.ID = ID;
        this.Date = Date;
        this.ClassName = ClassName;
        this.Name = Name;
        this.Information = Information;
    }

    //  get function use in other page/activity
    public int getID() {
        return ID;
    }

    public void setID(int id) {
        ID = id;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String className) {
        ClassName = className;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getInformation() {
        return Information;
    }

    public void setInformation(String information) {
        Information = information;
    }

    @Override
    public String toString() {
        return "HomeworkList{" +
                "Date='" + Date + '\'' +
                ", ClassNmae='" + ClassName + '\'' +
                ", Name='" + Name + '\'' +
                ", Information='" + Information + '\'' +
                ", id='" + ID + '\'' +
                '}';
    }
}
