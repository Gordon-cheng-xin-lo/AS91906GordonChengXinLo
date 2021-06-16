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

    Context context;
    List<HomeworkList> mHomeworkLists;

    public static final String Class_MESSAGE = "Text Entry App";
    public static final String Name_MESSAGE = "Text Entry App";
    public static final String Date_MESSAGE = "Text Entry App";
    public static final String Inform_MESSAGE = "Text Entry App";

    public HomeworkRecyclerView(Context context,List<HomeworkList> homeworkLists) {
        this.context = context;
        this.mHomeworkLists = homeworkLists;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.homework_recycler_view,parent,false);
        return new ViewHolder(view);
    }

    @SuppressLint({"LongLogTag", "SetTextI18n"})
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {
        /*Got problem showing the content on the list solve it later on at school day
         *        *
         * setText is the correct function for the call but the call detail is having problem
         * */


        holder.DataView_Date.setText(mHomeworkLists.get(position).getDate());
        holder.DataView_ClassName.setText(mHomeworkLists.get(position).getClassName());
        holder.DataView_Name.setText(mHomeworkLists.get(position).getName());
        holder.DataView_Information.setText(mHomeworkLists.get(position).getInformation());
        holder.DataView_Date_Label.setText("Date");
        holder.DataView_ClassName_Label.setText("Class");
        holder.DataView_Name_Label.setText("Name");
        holder.DataView_Information_Label.setText("Detail");
        holder.EditHMButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("click","Click");
                Intent Edit = new Intent(context,EditHomeWork.class);

                Edit.putExtra(Class_MESSAGE,mHomeworkLists.get(position).getClass());
                Edit.putExtra(Name_MESSAGE,mHomeworkLists.get(position).getName());
                Edit.putExtra(Date_MESSAGE,mHomeworkLists.get(position).getDate());
                Edit.putExtra(Inform_MESSAGE,mHomeworkLists.get(position).getInformation());
                /*Edit.putExtra()*/
                context.startActivity(Edit);
            }
        });
        holder.DeleteHMButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("LongLogTag")
            @Override
            public void onClick(View v) {
                Log.d("Delete Button click>>>>>>>>>>>>>>>>>>>>>","Delete ButtonClick");

                mHomeworkLists.toString();
                String DeleteClass = String.valueOf(mHomeworkLists.get(position).getName());


                AlertDialog.Builder Warning = new AlertDialog.Builder(context);
                Warning.setMessage("Is that you want to Delete "+DeleteClass+" Homework Form the Phone");
                Warning.setPositiveButton("Delete", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Log.d("Position of the list===================","The position of the string  value is " + position);


                    }
                });
                Warning.show();

            }
        });
    }

    @Override
    public int getItemCount() {
        return mHomeworkLists.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder
    {
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

