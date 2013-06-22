package am.mlab.trainingapp2.activities;

import am.mlab.trainingapp2.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Main extends Activity {

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        final Button firstButton = (Button)findViewById(R.id.main_first_button);
        firstButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent startSecond = new Intent(v.getContext(), Second.class);
				startSecond.putExtra("key", firstButton.getText());
				startActivity(startSecond);
			}
		});
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
