package tomb.tafllite;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

	int counter;
	Button addbutton,takebutton;
	TextView display;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        counter=0;
        addbutton = (Button) findViewById(R.id.addbutton);
        takebutton = (Button) findViewById(R.id.takebutton);
        display = (TextView) findViewById(R.id.numbertext);
        
        addbutton.setOnClickListener(new View.OnClickListener() {
    		public void onClick(View v) {
    			counter++;
    			display.setText("new number: "+counter);
    		}
    	});
        takebutton.setOnClickListener(new View.OnClickListener() {
    		public void onClick(View v) {
    			counter--;
    			display.setText("new number: "+counter);
    		}
    	});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
