package com.example.thagadur.android_session9_assignment1;

import android.graphics.Color;
import android.renderscript.ScriptGroup;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView hello;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Initialising textview
        hello=(TextView)findViewById(R.id.hello);
    }

    //For creating option Menu we should overload the onCreateOptionsMenu(Menu menu)
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //getting menu Inflater for menu.colors file
        getMenuInflater().inflate(R.menu.menu_colors,menu);
        //menu.findItem(R.id.menu).setTitle("TEXT COLOR");
        return true;
    }

    //Setting what should happen on ItemSelected of respective menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.blue_color:
                //setting textcolor of the text view
                hello.setTextColor(Color.BLUE);
                break;
            case R.id.green_color:
                //setting textcolor of the text view
                hello.setTextColor(Color.GREEN);
                break;
            case R.id.red_color:
                //setting textcolor of the text view
                hello.setTextColor(Color.RED);
        }
        return true;
    }
}
