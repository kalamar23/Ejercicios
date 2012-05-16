package ica.ami.namespacej;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class TestActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    
    Button b = (Button) findViewById(R.id.button1);
    
    b.setOnClickListener(new View.OnClickListener() {
	
		public void onClick(View view) {
			
			Pantalla();
		}
	});
    }
    private void Pantalla(){
    
    	Intent lanzar = new Intent(TestActivity.this, Activity2.class);
    	startActivity(lanzar);
    }
    
    }
