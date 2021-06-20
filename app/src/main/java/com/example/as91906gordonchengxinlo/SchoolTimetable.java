package com.example.as91906gordonchengxinlo;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SchoolTimetable extends AppCompatActivity {

    GridView gridView;




    int[] image = {R.drawable.img8458, R.drawable.img8460, R.drawable.img8461, R.drawable.img8463, R.drawable.img8464, R.drawable.img8465, R.drawable.img8467, R.drawable.img8468, R.drawable.img8471, R.drawable.img8472, R.drawable.img8474, R.drawable.img8475, R.drawable.img8478, R.drawable.img8483, R.drawable.img8484, R.drawable.img8485, R.drawable.img8493, R.drawable.img8494, R.drawable.img8495, R.drawable.img8458, R.drawable.img8460, R.drawable.img8463, R.drawable.img8464, R.drawable.img8465, R.drawable.img8467, R.drawable.img8468, R.drawable.img8471, R.drawable.img8472, R.drawable.img8474, R.drawable.img8475, R.drawable.img8478, R.drawable.img8483, R.drawable.img8484, R.drawable.img8485, R.drawable.img8493, R.drawable.img8494, R.drawable.img8495, R.drawable.img8495, R.drawable.img8458, R.drawable.img8460, R.drawable.img8461, R.drawable.img8463, R.drawable.img8464, R.drawable.img8465, R.drawable.img8467, R.drawable.img8468, R.drawable.img8471, R.drawable.img8472, R.drawable.img8474, R.drawable.img8475, R.drawable.img8478, R.drawable.img8483, R.drawable.img8484, R.drawable.img8485, R.drawable.img8493, R.drawable.img8494, R.drawable.img8495, R.drawable.img8458, R.drawable.img8460, R.drawable.img8463, R.drawable.img8464, R.drawable.img8465, R.drawable.img8467, R.drawable.img8468, R.drawable.img8471, R.drawable.img8472, R.drawable.img8474, R.drawable.img8475, R.drawable.img8478, R.drawable.img8483, R.drawable.img8484, R.drawable.img8485, R.drawable.img8493, R.drawable.img8494, R.drawable.img8495, R.drawable.img8495};

    public List<SchoolTimetableList> SchoolTimetableListsInformation = new ArrayList<SchoolTimetableList>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_timetable);
        fillSchoolTimetableListsInformation();
//        DecimalFormat TimeFormST = new DecimalFormat("##:##");
        gridView = findViewById(R.id.SchoolTimeTbale_GridView);

        CustomerAdapter customerAdapter = new CustomerAdapter(SchoolTimetableListsInformation, image, this);
        gridView.setAdapter(customerAdapter);
    }

    private void fillSchoolTimetableListsInformation() {
        SchoolTimetableList ST1 = new SchoolTimetableList(1,"Wednesday","P1","PHT","1111","1111");
        SchoolTimetableList ST2 = new SchoolTimetableList(2,"Monday","B4","CSC","1111","1111");
        SchoolTimetableList ST3 = new SchoolTimetableList(3,"Monday","N5","CAL","1111","1111");
        SchoolTimetableList ST4 = new SchoolTimetableList(4,"Tuesday","M4","ACC","1111","1111");
        SchoolTimetableList ST5 = new SchoolTimetableList(5,"Friday","H4","ART","1111","1111");
        SchoolTimetableList ST6 = new SchoolTimetableList(6,"Wednesday","F7","LST","1111","1111");
        SchoolTimetableList ST7 = new SchoolTimetableList(7,"Thursday","V6","BAA","1111","1111");
        SchoolTimetableList ST8 = new SchoolTimetableList(8,"Monday","P4","PHY","1111","1111");
        SchoolTimetableList ST9 = new SchoolTimetableList(9,"Friday","A3","DTG","1111","1111");
        SchoolTimetableList ST10 = new SchoolTimetableList(10,"Wednesday","E6","PHT","1111","1111");
        SchoolTimetableList ST11 = new SchoolTimetableList(11,"Friday","B3","FT","1111","1111");
        SchoolTimetableList ST12 = new SchoolTimetableList(12,"Monday","M3","ACC","1111","1111");
        SchoolTimetableList ST13 = new SchoolTimetableList(13,"Tuesday","L1","BYO","1111","1111");
        SchoolTimetableList ST14 = new SchoolTimetableList(14,"Wednesday","Y4","BIO","1111","1111");
        SchoolTimetableList ST15 = new SchoolTimetableList(15,"Thursday","S5","CHE","1111","1111");
        SchoolTimetableList ST16 = new SchoolTimetableList(16,"Monday","B7","STA","1111","1111");
        SchoolTimetableList ST17 = new SchoolTimetableList(17,"Friday","N3","LSS","1111","");
        SchoolTimetableList ST18 = new SchoolTimetableList(18,"Tuesday","V5","","1111","");
        SchoolTimetableList ST19 = new SchoolTimetableList(19,"","","N2","1111","1111");
        SchoolTimetableList ST20 = new SchoolTimetableList(20,"Monday","J7","","1111","1111");

        SchoolTimetableListsInformation.addAll(Arrays.asList(ST1,ST2,ST3,ST4,ST5,ST6,ST7,ST8,ST9,ST10,ST11,ST12,ST13,ST14,ST15,ST16,ST17,ST18,ST19,ST20));
    }

    public void New_Homework(View aView) {
        Intent New_Homework_Function = new Intent(this, NewSchoolTimeTable.class);
        startActivity(New_Homework_Function);
    }

    public class CustomerAdapter extends BaseAdapter {
        private int[] imagesPhoto;
        private Context context;
        private List schoolTimetableListsInformation;
        private LayoutInflater layoutInflater;


        public CustomerAdapter(List<SchoolTimetableList> schoolTimetableListsInformation, int[] image, Context context) {
            this.schoolTimetableListsInformation = schoolTimetableListsInformation;
            this.imagesPhoto = image;
            this.context = context;
            this.layoutInflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public int getCount() {
            return SchoolTimetableListsInformation.size();
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
            if (view == null) {
                view = layoutInflater.inflate(R.layout.schooltimetable_girdview, viewGroup, false);
            }

            TextView ClassNameView = view.findViewById(R.id.ClassNameGirdView);
            TextView DayView = view.findViewById(R.id.ClassTimeGirdView);
            TextView LocationView = view.findViewById(R.id.ClassLocationGirdView);
            TextView StartingTimeView = view.findViewById(R.id.ClassStartTimeGirdView);
            TextView EndTimeView = view.findViewById(R.id.ClassEndTimeGirdView);
//            ImageView imageView = view.findViewById(R.id.imageView);

            Log.d("Size>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>", String.valueOf(SchoolTimetableListsInformation.get(i).getSTClassName().length()));

            if (i <= SchoolTimetableListsInformation.size()) {
                if (SchoolTimetableListsInformation.get(i).getSTClassName().length() >= 1) {
                    Log.d("Mission sucess", "Mission success!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                    ClassNameView.setText(SchoolTimetableListsInformation.get(i).getSTClassName());
                    DayView.setText(SchoolTimetableListsInformation.get(i).getDay());
                    LocationView.setText(SchoolTimetableListsInformation.get(i).getLocation());
                    StartingTimeView.setText(SchoolTimetableListsInformation.get(i).getStartTime());
                    EndTimeView.setText(SchoolTimetableListsInformation.get(i).getEndTime());
//                    imageView.setImageResource(imagesPhoto[i]);
                    view.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
//                            Log.d("View Clicked========", "view Name =======>" + SchoolTimetableListsInformation.get(i).getSTClassName());
                            AlertDialog.Builder Detail = new AlertDialog.Builder(SchoolTimetable.this);
                            Detail.setMessage("Class ==>" + SchoolTimetableListsInformation.get(i).getSTClassName()+
                                    "\nDetail\nDay ==>" + SchoolTimetableListsInformation.get(i).getDay()+
                                    "\nLocation ==>" + SchoolTimetableListsInformation.get(i).getLocation()+
                                    "\nStart at ==>" + SchoolTimetableListsInformation.get(i).getStartTime()+
                                    "\nEnd in ==>" + SchoolTimetableListsInformation.get(i).getEndTime());


                            Detail.setPositiveButton("Edit Schedule", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
//                                    Log.d("click", "Click");
//                                    Log.d("click", SchoolTimetableListsInformation.get(i).getSTClassName() + SchoolTimetableListsInformation.get(i).getDay());
                                    Intent Edit = new Intent(context, EditSchoolTimetable.class);
                                    Edit.putExtra("ClassName_MESSAGE", SchoolTimetableListsInformation.get(i).getSTClassName());
                                    Edit.putExtra("Location_MESSAGE", SchoolTimetableListsInformation.get(i).getLocation());
                                    Edit.putExtra("Day_MESSAGE", SchoolTimetableListsInformation.get(i).getDay());
                                    Edit.putExtra("StartTime_MESSAGE", SchoolTimetableListsInformation.get(i).getStartTime());
                                    Edit.putExtra("EndTime_MESSAGE", SchoolTimetableListsInformation.get(i).getEndTime());
                                    Edit.putExtra("Position_MESSAGE", i);
//                                    Log.d("click>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>", SchoolTimetableListsInformation.get(i).getSTClassName() + "\n" + SchoolTimetableListsInformation.get(i).getLocation() + "\n" + SchoolTimetableListsInformation.get(i).getDay() + "\n" + SchoolTimetableListsInformation.get(i).getStartTime() + "\n" + SchoolTimetableListsInformation.get(i).getEndTime() + "\n" + i);
                                    context.startActivity(Edit);
                                }
                            });
                            Detail.show();
                        }
                    });
                } else {
//                    Log.d("OnClick Mission Fall", "Mission Fall!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                }
            } else {
//                Log.d("Gid View Mission Faill>>>>>>>>>>>>>>>>>>>>>", "Mission Fall");
            }
//            Log.d("Gid View Mission >>>>>>>>>>>>>>>>>>>>>", String.valueOf(SchoolTimetableListsInformation));
            return view;
        }
    }


    public void Homepage(View aView) {
        Intent Homepage_function = new Intent(this, MainActivity.class);
        startActivity(Homepage_function);
        finishAffinity();
    }

    public void Return(View aView) {
        finish();
    }
}