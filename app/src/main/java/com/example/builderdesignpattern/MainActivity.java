package com.example.builderdesignpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.builderdesignpattern.withbuilderpattern.Employee;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Employee employee = new Employee.Builder("ABC","XYZ")
                .Age(20)
                .EmpId(100)
                .build();

        Log.v("===>>>","Epployee:"+ employee.toString());
    }
}