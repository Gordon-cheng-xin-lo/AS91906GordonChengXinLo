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
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
//  RecyclerView for Homework.class
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
        holder.mDataViewDate.setText(mHomeworkLists.get(position).getDate());
        holder.mDataViewClassName.setText(mHomeworkLists.get(position).getClassName());
        holder.mDataViewName.setText(mHomeworkLists.get(position).getName());
        holder.mDataViewInformation.setText(mHomeworkLists.get(position).getInformation());
        holder.mDataViewDateLabel.setText("Date");
        holder.mDataViewClassNameLabel.setText("Class");
        holder.mDataViewNameLabel.setText("Name");
        holder.mDataViewInformationLabel.setText("Detail");
        holder.mEditHMButton.setOnClickListener(new View.OnClickListener() {
            //  function go through to next page/activity
            @Override
            public void onClick(View v) {
                Log.d("click","Click");
                Intent edit = new Intent(context,EditHomeWork.class);
                //  get value from the page/activity
                edit.putExtra("Class_MESSAGE",mHomeworkLists.get(position).getClassName());
                edit.putExtra("Name_MESSAGE",mHomeworkLists.get(position).getName());
                edit.putExtra("Date_MESSAGE",mHomeworkLists.get(position).getDate());
                edit.putExtra("Inform_MESSAGE",mHomeworkLists.get(position).getInformation());
                /*edit.putExtra()*/
                context.startActivity(edit);
            }
        });
        holder.mDeleteHMButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("LongLogTag")
            //  delete function
            @Override
            public void onClick(View v) {
//                Log.d("Delete Button click>>>>>>>>>>>>>>>>>>>>>","Delete ButtonClick");

                mHomeworkLists.toString();
                String deleteClass = String.valueOf(mHomeworkLists.get(position).getName());
                //  set up a pop up window for the page/activity
                AlertDialog.Builder warning = new AlertDialog.Builder(context);
                warning.setMessage("Is that you want to Delete \n"+deleteClass+" \nHomework Form the Phone");
                warning.setPositiveButton("Delete", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
//                        Log.d("Position of the list===================","The position of the string  value is " + position);
                    }
                });
                warning.show();
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
        TextView mDataViewDate;
        TextView mDataViewDateLabel;
        TextView mDataViewClassName;
        TextView mDataViewClassNameLabel;
        TextView mDataViewName;
        TextView mDataViewNameLabel;
        TextView mDataViewInformation;
        TextView mDataViewInformationLabel;
        Button mEditHMButton;
        Button mDeleteHMButton;

        //  define the layout of the page/activity
        ViewHolder(View itemView)
        {
            super(itemView);
            mDataViewDate = itemView.findViewById(R.id.HM_Date);
            mDataViewDateLabel = itemView.findViewById(R.id.HM_Date_Label);
            mDataViewClassName = itemView.findViewById(R.id.HM_Class);
            mDataViewClassNameLabel = itemView.findViewById(R.id.HM_Class_Label);
            mDataViewName = itemView.findViewById(R.id.HM_Title);
            mDataViewNameLabel = itemView.findViewById(R.id.HM_Title_Label);
            mDataViewInformation = itemView.findViewById(R.id.HM_Information);
            mDataViewInformationLabel = itemView.findViewById(R.id.HM_Information_Label);
            mEditHMButton =itemView.findViewById(R.id.EditButton);
            mDeleteHMButton =itemView.findViewById(R.id.DeleteButton);
        }


    }






}

