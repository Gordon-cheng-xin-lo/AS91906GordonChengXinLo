package com.example.as91906gordonchengxinlo;

public class HomeworkList {
    public String Data;
    public String ClassName;
    public String Name;
    public String Information;

    public HomeworkList(String Data,String ClassName, String Name, String Information){
        this.Data = Data;
        this.ClassName = ClassName;
        this.Name = Name;
        this.Information = Information;
    }



    public String getData() {
        return Data;
    }

    public void setData(String data) {
        Data = data;
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
                "Data='" + Data + '\'' +
                ", ClassNmae='" + ClassName + '\'' +
                ", Name='" + Name + '\'' +
                ", Information='" + Information + '\'' +
                '}';
    }
}
