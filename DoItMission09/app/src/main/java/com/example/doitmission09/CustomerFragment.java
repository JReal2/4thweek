package com.example.doitmission09;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.DatePicker;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class CustomerFragment extends Fragment {
    EditText btnName;
    EditText btnAge;
    Button BDay;


    Calendar myCalendar = Calendar.getInstance();
    DatePickerDialog.OnDateSetListener setDate= new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
            myCalendar.set(Calendar.YEAR, i);
            myCalendar.set(Calendar.MONTH,i1);
            myCalendar.set(Calendar.DAY_OF_MONTH,i2);
            updateDate();
        }
    };

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        final ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.fragment_customer,container,false);

        btnName = rootView.findViewById(R.id.name);
        btnAge = rootView.findViewById(R.id.age);
        BDay = rootView.findViewById(R.id.BDay);
        Date currentTime = Calendar.getInstance().getTime();
        BDay.setText(new SimpleDateFormat("yyyy/MM/dd", Locale.getDefault()).format(currentTime));



        BDay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new DatePickerDialog(getContext(), setDate, myCalendar.get(Calendar.YEAR), myCalendar.get(Calendar.MONTH), myCalendar.get(Calendar.DAY_OF_MONTH)).show();

            }
        });

        Button save = rootView.findViewById(R.id.save);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {    //눌렀을 때 이름이 뜨게
                String name = btnName.getText().toString();
                String age = btnAge.getText().toString();
                String date = BDay.getText().toString();

                if(name.length() < 1 | age.length() < 1 | date.length() < 1){
                    Toast.makeText(getContext(), "정보를 모두 입력하세요", Toast.LENGTH_LONG ).show();
                }
                else{   //토스트 뜨게
                    Toast.makeText(getContext(), "이름 : " + name + " 나이 : " + age + " 생년월일 : "+ date, Toast.LENGTH_LONG).show();
                }
            }
        });
        return rootView;
    }

    public void updateDate(){   //날짜 형식 변환
        String format = "yyyy/MM/dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format, Locale.KOREA);
        BDay.setText(simpleDateFormat.format(myCalendar.getTime()));
    }
}
