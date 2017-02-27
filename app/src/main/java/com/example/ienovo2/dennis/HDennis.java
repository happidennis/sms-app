package com.example.ienovo2.dennis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class HDennis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hdennis);
    }
    public void sendmsg(View view){
        EditText ed1=(EditText)findViewById(R.id.msg);
        TextView tv1=(TextView)findViewById(R.id.show);

        String text=ed1.getText().toString();
        tv1.setText("I said "+text+" to you");
    }
}
