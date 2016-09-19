package com.panda.applydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ItemPasswordLayout apply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        apply = (ItemPasswordLayout)findViewById(R.id.ipl_apply);
        apply.setInputCompleteListener(new ItemPasswordLayout.InputCompleteListener() {
            @Override
            public void inputComplete() {
                Toast.makeText(MainActivity.this, "密码是："+apply.getStrPassword(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
