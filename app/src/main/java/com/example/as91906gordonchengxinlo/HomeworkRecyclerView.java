package com.example.as91906gordonchengxinlo;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HomeworkRecyclerView extends RecyclerView.Adapter<HomeworkRecyclerView.ViewHolder>
{
    //define the object for recyclerview
    Context context;
    List<HomeworkList> mHomeworkLists;

    //  apply value into list
    public HomeworkRecyclerView(Context context,List<HomeworkList> homeworkLists) {
        this.context = context;
        this.mHomeworkLists = homeworkLists;
    }

    @NonNull
    @Override
    //set the object for recyclerview
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.homework_recycler_view,parent,false);
        return new ViewHolder(view);
    }

    @SuppressLint({"LongLogTag", "SetTextI18n"})
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {
        //  set text for the page/activity
        holder.DataView_Date.setText(mHomeworkLists.get(position).getDate());
        holder.DataView_ClassName.setText(mHomeworkLists.get(position).getClassName());
        holder.DataView_Name.setText(mHomeworkLists.get(position).getName());
        holder.DataView_Information.setText(mHomeworkLists.get(position).getInformation());
        holder.DataView_Date_Label.setText("Date");
        holder.DataView_ClassName_Label.setText("Class");
        holder.DataView_Name_Label.setText("Name");
        holder.DataView_Information_Label.setText("Detail");
        holder.EditHMButton.setOnClickListener(new View.OnClickListener() {
            //  function go through to next page/activity
            @Override
            public void onClick(View v) {
                Log.d("click","Click");
                Intent Edit = new Intent(context,EditHomeWork.class);
                //  get value from the page/activity
                Edit.putExtra("Class_MESSAGE",mHomeworkLists.get(position).getClassName());
                Edit.putExtra("Name_MESSAGE",mHomeworkLists.get(position).getName());
                Edit.putExtra("Date_MESSAGE",mHomeworkLists.get(position).getDate());
                Edit.putExtra("Inform_MESSAGE",mHomeworkLists.get(position).getInformation());
                /*Edit.putExtra()*/
                context.startActivity(Edit);
            }
        });
        holder.DeleteHMButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("LongLogTag")
            //  delete function
            @Override
            public void onClick(View v) {
//                Log.d("Delete Button click>>>>>>>>>>>>>>>>>>>>>","Delete ButtonClick");

                mHomeworkLists.toString();
                String DeleteClass = String.valueOf(mHomeworkLists.get(position).getName());
                //  set up a pop up window for the page/activity
                AlertDialog.Builder Warning = new AlertDialog.Builder(context);
                Warning.setMessage("Is that you want to Delete \n"+DeleteClass+" \nHomework Form the Phone");
                Warning.setPositiveButton("Delete", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
//                        Log.d("Position of the list===================","The position of the string  value is " + position);
                    }
                });
                Warning.show();
            }
        });
    }

    //set the length of recyclerview
    @Override
    public int getItemCount() {
        return mHomeworkLists.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder
    {
        //set the object for page/activity
        TextView DataView_Date;
        TextView DataView_Date_Label;
        TextView DataView_ClassName;
        TextView DataView_ClassName_Label;
        TextView DataView_Name;
        TextView DataView_Name_Label;
        TextView DataView_Information;
        TextView DataView_Information_Label;
        Button EditHMButton;
        Button DeleteHMButton;

        //  define the layout of the page/activity
        ViewHolder(View itemView)
        {
            super(itemView);
            DataView_Date= itemView.findViewById(R.id.HM_Date);
            DataView_Date_Label= itemView.findViewById(R.id.HM_Date_Label);
            DataView_ClassName= itemView.findViewById(R.id.HM_Class);
            DataView_ClassName_Label= itemView.findViewById(R.id.HM_Class_Label);
            DataView_Name= itemView.findViewById(R.id.HM_Title);
            DataView_Name_Label= itemView.findViewById(R.id.HM_Title_Label);
            DataView_Information= itemView.findViewById(R.id.HM_Information);
            DataView_Information_Label= itemView.findViewById(R.id.HM_Information_Label);
            EditHMButton=itemView.findViewById(R.id.EditButton);
            DeleteHMButton=itemView.findViewById(R.id.DeleteButton);
        }


    }






}

