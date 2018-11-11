package com.ayuan.autocompletetextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {


    //1.声明一个数组
    private static final String[] COUNTRIES = new String[]{
            "laofang", "laozhang", "laoli", "laobi", "laojin", "laoli", "laowang"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2.找到控件
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.auto_text);

        //3.创建数据适配器
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, COUNTRIES);
        //4.设置数据适配器
        autoCompleteTextView.setAdapter(adapter);

    }
}
