package com.github.shadowsocks;

import android.app.Activity;
import android.content.Intent;
// import android.support.v7.app.ActionBarActivity;
import android.os.Handler;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);


        setContentView(R.layout.first_layout);

        Button button1 = (Button)findViewById(R.id.mybutton);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//            Toast.makeText(FirstActivity.this, "lkkk",Toast.LENGTH_SHORT).show();
 
                    new Handler().postDelayed(new Runnable() {
                         @Override
                         public void run() {
                           try{
                                   Intent intent = new Intent(FirstActivity.this,Shadowsocks.class );
                                   intent.putExtra("url","http://weibo.com");
                                   startActivity(intent);
                                   // finish();
                          }catch(Exception e){
                             
                          }
                        }
                  }, 5);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        // getMenuInflater().inflate(R.menu.menu_first, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        // int id = item.getItemId();
 //
 //        //noinspection SimplifiableIfStatement
 //        if (id == R.id.action_settings) {
 //            return true;
 //        }

        return super.onOptionsItemSelected(item);
    }
}
