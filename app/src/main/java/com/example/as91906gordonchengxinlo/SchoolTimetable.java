package com.example.as91906gordonchengxinlo;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SchoolTimetable extends AppCompatActivity {

    GridView gridView;

    public static final String ClassName_MESSAGE = "Text Entry App";
    public static final String Location_MESSAGE = "Text Entry App";
    public static final String Day_MESSAGE = "Text Entry App";
    public static final String StartTime_MESSAGE = "Text Entry App";
    public static final String EndTime_MESSAGE = "Text Entry App";
    public static final String Image_MESSAGE = "Text Entry App";
    public static final String Position_MESSAGE = "Text Entry App";

    String[] ClassName = {"Photo1","aaa","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","AAA","","CCC","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo","Photo"};
    String[] ClassDay = {"Monday","Tuesday","Wednesday","Thursday","Friday","Monday","Tuesday","Wednesday","Thursday","Friday","Monday","Tuesday","Wednesday","Thursday","Friday","Monday","Tuesday","Wednesday","Thursday","Friday","Monday","Tuesday","Wednesday","Thursday","Friday","Monday","Tuesday","Wednesday","Thursday","Friday","Monday","Tuesday","Wednesday","Thursday","Friday","Monday","Tuesday","Wednesday","Thursday","Friday","Monday","Tuesday","Wednesday","Thursday","Friday"};

    int[] image = {R.drawable.img8458,R.drawable.img8460,R.drawable.img8461,R.drawable.img8463,R.drawable.img8464,R.drawable.img8465,R.drawable.img8467,R.drawable.img8468,R.drawable.img8471,R.drawable.img8472,R.drawable.img8474,R.drawable.img8475,R.drawable.img8478,R.drawable.img8483,R.drawable.img8484,R.drawable.img8485,R.drawable.img8493,R.drawable.img8494,R.drawable.img8495,R.drawable.img8458,R.drawable.img8460,R.drawable.img8463,R.drawable.img8464,R.drawable.img8465,R.drawable.img8467,R.drawable.img8468,R.drawable.img8471,R.drawable.img8472,R.drawable.img8474,R.drawable.img8475,R.drawable.img8478,R.drawable.img8483,R.drawable.img8484,R.drawable.img8485,R.drawable.img8493,R.drawable.img8494,R.drawable.img8495,R.drawable.img8495,R.drawable.img8458,R.drawable.img8460,R.drawable.img8461,R.drawable.img8463,R.drawable.img8464,R.drawable.img8465,R.drawable.img8467,R.drawable.img8468,R.drawable.img8471,R.drawable.img8472,R.drawable.img8474,R.drawable.img8475,R.drawable.img8478,R.drawable.img8483,R.drawable.img8484,R.drawable.img8485,R.drawable.img8493,R.drawable.img8494,R.drawable.img8495,R.drawable.img8458,R.drawable.img8460,R.drawable.img8463,R.drawable.img8464,R.drawable.img8465,R.drawable.img8467,R.drawable.img8468,R.drawable.img8471,R.drawable.img8472,R.drawable.img8474,R.drawable.img8475,R.drawable.img8478,R.drawable.img8483,R.drawable.img8484,R.drawable.img8485,R.drawable.img8493,R.drawable.img8494,R.drawable.img8495,R.drawable.img8495};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_timetable);
        gridView = findViewById(R.id.SchoolTimeTbale_GridView);

        CustomerAdapter customerAdapter = new CustomerAdapter(ClassName,ClassDay,image,this);
        gridView.setAdapter(customerAdapter);
    }

    public void New_Homework(View aView) {
        Intent New_Homework_Function = new Intent(this,NewSchoolTimeTable.class);
        startActivity(New_Homework_Function);
    }

    public class CustomerAdapter extends BaseAdapter {
        private String[] ClassName;
        private String[] ClassDay;
        private int[] imagesPhoto;
        private Context context;
        private LayoutInflater layoutInflater;

        public CustomerAdapter(String[] ClassName,String[] Day, int[] imagesPhoto, Context context) {
            this.ClassName = ClassName;
            this.ClassDay = Day;
            this.imagesPhoto = imagesPhoto;
            this.context = context;
            this.layoutInflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);

        }

        @Override
        public int getCount() {
            return ClassName.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @SuppressLint("LongLogTag")
        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            if( view == null) {
                view = layoutInflater.inflate(R.layout.schooltimetable_girdview,viewGroup,false);
            }

            TextView ClassNameView = view.findViewById(R.id.ClassNameGirdView);
            TextView DayView = view.findViewById(R.id.ClassTimeGirdView);
            TextView LocationView = view.findViewById(R.id.ClassLocationGirdView);
            TextView StartingTimeView = view.findViewById(R.id.ClassStartTimeGirdView);
            TextView EndTimeView = view.findViewById(R.id.ClassEndTimeGirdView);
            ImageView imageView = view.findViewById(R.id.imageView);




            Log.d("ClassNamelenght========================"+i,ClassName[i]+"     length"+String.valueOf(ClassName[i].length()));



            if ( i <= ClassName.length){
                if (ClassName[i].length()>=1) {
                    Log.d("Mission sucess","Mission sucess!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                    ClassNameView.setText(ClassName[i]);
                    DayView.setText(ClassDay[i]);
                    LocationView.setText("location");
                    StartingTimeView.setText("Start at");
                    EndTimeView.setText("End in");
                    imageView.setImageResource(imagesPhoto[i]);

                    view.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Log.d("View Clicked========","view Name =======>"+ClassName[i]);
                            AlertDialog.Builder Detail = new AlertDialog.Builder(SchoolTimetable.this);
                            Detail.setMessage("Class ==>" + ClassName[i] + "\nDetail\nDay ==>" + ClassDay[i] +"\nLocation ==>" + ClassName[i] +"\nStart at ==>" + ClassName[i] +"\nEnd in ==>" + ClassName[i]);
                            Detail.setPositiveButton("Edit Schedule", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    Log.d("click", "Click");
                                    Log.d("click", ClassName[i]+ClassDay[i]);
                                    Intent Edit = new Intent(context,EditSchoolTimetable.class);
                                    Edit.putExtra(Image_MESSAGE, String.valueOf(ClassName[i]));
                                    Edit.putExtra(ClassName_MESSAGE,String.valueOf(ClassName[i]));
                                    Edit.putExtra(Location_MESSAGE,String.valueOf(ClassName[i]));
                                    Edit.putExtra(Day_MESSAGE,String.valueOf(ClassDay[i]));
                                    Edit.putExtra(StartTime_MESSAGE,String.valueOf(ClassName[i]));
                                    Edit.putExtra(EndTime_MESSAGE,String.valueOf(ClassName[i]));
                                    Edit.putExtra(Position_MESSAGE,String.valueOf(i));
                                    Log.d("click", ClassName_MESSAGE+"\n"+Location_MESSAGE+"\n"+Day_MESSAGE+"\n"+StartTime_MESSAGE+"\n"+EndTime_MESSAGE+"\n"+Position_MESSAGE);
                                    context.startActivity(Edit);
                                    }
                            });
                            Detail.show();
                        }
                    });
                }
                else {
                    Log.d("OnClick Mission Fall","Mission Fall!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                }}
            else {
                Log.d("Gid View Mission Faill>>>>>>>>>>>>>>>>>>>>>","Mission Fall");
            }

            return view;
        }
    }



    public void Homepage (View aView) {
        Intent Homepage_function = new Intent(this,MainActivity.class);
        startActivity(Homepage_function);
        finishAffinity();
    }

    public void Return (View aView) {
        finish();
    }
}