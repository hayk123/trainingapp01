package am.mlab.trainingapp2.activities;

import am.mlab.trainingapp2.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Second extends Activity implements OnClickListener {
	
	Button secondButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);

		String text = getIntent().getStringExtra("key");
		
		Button firstButton = (Button) findViewById(R.id.second_first_button);
		secondButton = (Button) findViewById(R.id.second_second_button);

		secondButton.setText(text);
		
		firstButton.setOnClickListener(this);
		secondButton.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.second_first_button:
			finish();
			break;
		case R.id.second_second_button:
			secondButton.setVisibility(View.GONE);
			break;
		default:
			break;
		}
	}
}
