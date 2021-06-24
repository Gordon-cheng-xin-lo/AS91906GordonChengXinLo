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
    //set the object for page/activity
    GridView gridView;
    int[] image = {R.drawable.img8458, R.drawable.img8460, R.drawable.img8461, R.drawable.img8463, R.drawable.img8464, R.drawable.img8465, R.drawable.img8467, R.drawable.img8468, R.drawable.img8471, R.drawable.img8472, R.drawable.img8474, R.drawable.img8475, R.drawable.img8478, R.drawable.img8483, R.drawable.img8484, R.drawable.img8485, R.drawable.img8493, R.drawable.img8494, R.drawable.img8495, R.drawable.img8458, R.drawable.img8460, R.drawable.img8463, R.drawable.img8464, R.drawable.img8465, R.drawable.img8467, R.drawable.img8468, R.drawable.img8471, R.drawable.img8472, R.drawable.img8474, R.drawable.img8475, R.drawable.img8478, R.drawable.img8483, R.drawable.img8484, R.drawable.img8485, R.drawable.img8493, R.drawable.img8494, R.drawable.img8495, R.drawable.img8495, R.drawable.img8458, R.drawable.img8460, R.drawable.img8461, R.drawable.img8463, R.drawable.img8464, R.drawable.img8465, R.drawable.img8467, R.drawable.img8468, R.drawable.img8471, R.drawable.img8472, R.drawable.img8474, R.drawable.img8475, R.drawable.img8478, R.drawable.img8483, R.drawable.img8484, R.drawable.img8485, R.drawable.img8493, R.drawable.img8494, R.drawable.img8495, R.drawable.img8458, R.drawable.img8460, R.drawable.img8463, R.drawable.img8464, R.drawable.img8465, R.drawable.img8467, R.drawable.img8468, R.drawable.img8471, R.drawable.img8472, R.drawable.img8474, R.drawable.img8475, R.drawable.img8478, R.drawable.img8483, R.drawable.img8484, R.drawable.img8485, R.drawable.img8493, R.drawable.img8494, R.drawable.img8495, R.drawable.img8495};
    public List<SchoolTimetableList> SchoolTimetableListsInformation = new ArrayList<SchoolTimetableList>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //  define the layout of the page/activity
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_timetable);
        //  set the testing data
        fillSchoolTimetableListsInformation();
        //define the object in the xml
        gridView = findViewById(R.id.SchoolTimeTbale_GridView);
        //define the object for recyclerview
        CustomerAdapter customerAdapter = new CustomerAdapter(SchoolTimetableListsInformation, image, this);
        gridView.setAdapter(customerAdapter);
    }

    //  set the testing data into list
    private void fillSchoolTimetableListsInformation() {
        SchoolTimetableList ST1 = new SchoolTimetableList(1,"Wednesday","P1","PHT","6789","1111");
        SchoolTimetableList ST2 = new SchoolTimetableList(2,"Monday","B4","CSC","3747","5955");
        SchoolTimetableList ST3 = new SchoolTimetableList(3,"Monday","N5","CAL","4747","2347");
        SchoolTimetableList ST4 = new SchoolTimetableList(4,"Tuesday","M4","ACC","4567","4574");
        SchoolTimetableList ST5 = new SchoolTimetableList(5,"Friday","H4","ART","4747","4848");
        SchoolTimetableList ST6 = new SchoolTimetableList(6,"Wednesday","F7","LST","3737","6558");
        SchoolTimetableList ST7 = new SchoolTimetableList(7,"Thursday","V6","BAA","1111","3453");
        SchoolTimetableList ST8 = new SchoolTimetableList(8,"Monday","P4","PHY","3737","2455");
        SchoolTimetableList ST9 = new SchoolTimetableList(9,"Friday","A3","DTG","3573","2524");
        SchoolTimetableList ST10 = new SchoolTimetableList(10,"Wednesday","E6","PHT","3737","2452");
        SchoolTimetableList ST11 = new SchoolTimetableList(11,"Friday","B3","FT","5363","3563");
        SchoolTimetableList ST12 = new SchoolTimetableList(12,"Monday","M3","ACC","3536","3634");
        SchoolTimetableList ST13 = new SchoolTimetableList(13,"Tuesday","L1","BYO","3637","5436");
        SchoolTimetableList ST14 = new SchoolTimetableList(14,"Wednesday","Y4","BIO","3563","2432");
        SchoolTimetableList ST15 = new SchoolTimetableList(15,"Thursday","S5","CHE","5678","2452");
        SchoolTimetableList ST16 = new SchoolTimetableList(16,"Monday","B7","STA","2425","3563");
        SchoolTimetableList ST17 = new SchoolTimetableList(17,"Friday","N3","LSS","5699","3533");
        SchoolTimetableList ST18 = new SchoolTimetableList(18,"Tuesday","V5","","4764","5785");
        SchoolTimetableList ST19 = new SchoolTimetableList(19,"","","N2","4737","5785");
        SchoolTimetableList ST20 = new SchoolTimetableList(20,"Monday","J7","","4567","5788");
        SchoolTimetableList ST21 = new SchoolTimetableList(1,"Wednesday","P1","PHT","6574","4764");
        SchoolTimetableList ST22 = new SchoolTimetableList(2,"Monday","B4","CSC","4568","3733");
        SchoolTimetableList ST23 = new SchoolTimetableList(3,"Monday","N5","CAL","7367","4586");
        SchoolTimetableList ST24 = new SchoolTimetableList(4,"Tuesday","M4","ACC","5865","4744");
        SchoolTimetableList ST25 = new SchoolTimetableList(5,"Friday","H4","ART","5978","4674");
        SchoolTimetableList ST26 = new SchoolTimetableList(6,"Wednesday","F7","LST","5855","4876");
        SchoolTimetableList ST27 = new SchoolTimetableList(7,"Thursday","V6","BAA","2423","4844");
        SchoolTimetableList ST28 = new SchoolTimetableList(8,"Monday","P4","PHY","7096","5855");
        SchoolTimetableList ST29 = new SchoolTimetableList(9,"Friday","A3","DTG","2343","3463");
        SchoolTimetableList ST30 = new SchoolTimetableList(10,"Wednesday","E6","PHT","4786","3546");
        SchoolTimetableList ST31 = new SchoolTimetableList(11,"Friday","B3","FT","9326","2525");
        SchoolTimetableList ST32 = new SchoolTimetableList(12,"Monday","M3","ACC","7844","6573");
        SchoolTimetableList ST33 = new SchoolTimetableList(13,"Tuesday","L1","BYO","2620","5686");
        SchoolTimetableList ST34 = new SchoolTimetableList(14,"Wednesday","Y4","BIO","1111","1111");
        SchoolTimetableList ST35 = new SchoolTimetableList(15,"Thursday","S5","CHE","1111","1111");
        SchoolTimetableList ST36 = new SchoolTimetableList(16,"Monday","B7","STA","1111","1111");
        SchoolTimetableList ST37 = new SchoolTimetableList(17,"Friday","N3","LSS","1111","");
        SchoolTimetableList ST38 = new SchoolTimetableList(18,"Tuesday","V5","","1111","");
        SchoolTimetableList ST39 = new SchoolTimetableList(19,"","","N2","1111","1111");
        SchoolTimetableList ST40 = new SchoolTimetableList(20,"Monday","J7","","1111","1111");

        SchoolTimetableListsInformation.addAll(Arrays.asList(ST1,ST2,ST3,ST4,ST5,ST6,ST7,ST8,ST9,ST10,ST11,ST12,ST13,ST14,ST15,ST16,ST17,ST18,ST19,ST20,ST21,ST22,ST23,ST24,ST25,ST26,ST27,ST28,ST29,ST30,ST31,ST32,ST33,ST34,ST35,ST36,ST37,ST38,ST39,ST40));
    }
    //  go through to next page/activity
    public void New_Homework(View aView) {
        Intent New_Homework_Function = new Intent(this, NewSchoolTimeTable.class);
        startActivity(New_Homework_Function);
    }
    //define the object for recyclerview
    public class CustomerAdapter extends BaseAdapter {
        private int[] imagesPhoto;
        private Context context;
        private List schoolTimetableListsInformation;
        private LayoutInflater layoutInflater;
        //  apply value into list
        public CustomerAdapter(List<SchoolTimetableList> schoolTimetableListsInformation, int[] image, Context context) {
            this.schoolTimetableListsInformation = schoolTimetableListsInformation;
            this.imagesPhoto = image;
            this.context = context;
            this.layoutInflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);
        }
        //set the length of gridview
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
            //  define the layout of the page/activity
            TextView ClassNameView = view.findViewById(R.id.ClassNameGirdView);
            TextView DayView = view.findViewById(R.id.ClassTimeGirdView);
            TextView LocationView = view.findViewById(R.id.ClassLocationGirdView);
            TextView StartingTimeView = view.findViewById(R.id.ClassStartTimeGirdView);
            TextView EndTimeView = view.findViewById(R.id.ClassEndTimeGirdView);
//            Log.d("Size>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>", String.valueOf(SchoolTimetableListsInformation.get(i).getSTClassName().length()));

            if (i <= SchoolTimetableListsInformation.size()) {
                if (SchoolTimetableListsInformation.get(i).getSTClassName().length() >= 1) {
//                    Log.d("Mission sucess", "Mission success!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                    //  set text for the page/activity
                    ClassNameView.setText(SchoolTimetableListsInformation.get(i).getSTClassName());
                    DayView.setText(SchoolTimetableListsInformation.get(i).getDay());
                    LocationView.setText(SchoolTimetableListsInformation.get(i).getLocation());
                    StartingTimeView.setText(SchoolTimetableListsInformation.get(i).getStartTime());
                    EndTimeView.setText(SchoolTimetableListsInformation.get(i).getEndTime());
                    view.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
//                            Log.d("View Clicked========", "view Name =======>" + SchoolTimetableListsInformation.get(i).getSTClassName());
                            //  set up a pop up window for the page/activity
                            AlertDialog.Builder Detail = new AlertDialog.Builder(SchoolTimetable.this);
                            Detail.setMessage("Class ==>" + SchoolTimetableListsInformation.get(i).getSTClassName()+
                                    "\nDetail\nDay ==>" + SchoolTimetableListsInformation.get(i).getDay()+
                                    "\nLocation ==>" + SchoolTimetableListsInformation.get(i).getLocation()+
                                    "\nStart at ==>" + SchoolTimetableListsInformation.get(i).getStartTime()+
                                    "\nEnd in ==>" + SchoolTimetableListsInformation.get(i).getEndTime());
                            Detail.setPositiveButton("Edit Schedule", new DialogInterface.OnClickListener() {
                                //  function go through to next page/activity
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
//                                    Log.d("click", "Click");
//                                    Log.d("click", SchoolTimetableListsInformation.get(i).getSTClassName() + SchoolTimetableListsInformation.get(i).getDay());
                                    Intent Edit = new Intent(context, EditSchoolTimetable.class);
                                    //  get value from the page/activity
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
    //  go through to next page/activity
    public void Homepage(View aView) {
        Intent Homepage_function = new Intent(this, MainActivity.class);
        startActivity(Homepage_function);
        finishAffinity();
    }
    //  go through to next page/activity
    public void Return(View aView) {
        finish();
    }
}