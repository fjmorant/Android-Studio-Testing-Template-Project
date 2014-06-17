package com.morant.testingTemplate.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.morant.testingTemplate.R;


public class HomeActivity extends Activity {

    private int result = 0;
    private TextView resultLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        resultLabel = (TextView) findViewById(R.id.resultTextView);

        findViewById(R.id.add_one).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result++;

                resultLabel.setText(result);
            }
        });

        findViewById(R.id.remove_one).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result > 0) {
                    result--;
                }

                resultLabel.setText(result);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
