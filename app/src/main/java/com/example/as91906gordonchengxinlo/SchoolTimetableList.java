package com.example.as91906gordonchengxinlo;

public class SchoolTimetableList {
    public int ID;
    public String Day;
    public String ClassName;
    public String Location;
    public String StartTime;
    public String EndTime;

    public SchoolTimetableList(int ID, String Day, String Location, String ClassName, String StartTime, String EndTime){
        this.ID = ID;
        this.Day = Day;
        this.ClassName = ClassName;
        this.Location = Location;
        this.StartTime = StartTime;
        this.EndTime = EndTime;
    }

    public int getSTID() {
        return ID;
    }

    public void setSTID(int id) {
        ID = id;
    }

    public String getDay() {
        return Day;
    }

    public void setDay(String day) {
        Day = day;
    }

    public String getSTClassName() {
        return ClassName;
    }

    public void setSTClassName(String className) {
        ClassName = className;
    }

    public String getLocation() {
        return Location;
    }

    public void setName(String location) {
        Location = location;
    }

    public String getStartTime() {
        return StartTime;
    }

    public void setStartTime(String starttime) {
        StartTime = starttime;
    }

    public String getEndTime() {
        return EndTime;
    }

    public void setEndTime(String endtime) {
        EndTime = endtime;
    }

    @Override
    public String toString() {
        return "HomeworkList{" +
                "Day='" + Day + '\'' +
                ", ClassNmae='" + ClassName + '\'' +
                ", Location='" + Location + '\'' +
                ", StartTime='" + StartTime + '\'' +
                ", EndTime='" + EndTime + '\'' +
                ", id='" + ID + '\'' +
                '}';
    }
}
