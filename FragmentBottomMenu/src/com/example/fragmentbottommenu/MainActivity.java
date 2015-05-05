package com.example.fragmentbottommenu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button btn1 = (Button) findViewById(R.id.button1);
		Button btn2 = (Button) findViewById(R.id.button2);
		btn1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
                 Intent intent = new Intent(MainActivity.this, FragmentBottomTab.class);
                 startActivity(intent);
			}
		});

		btn2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(MainActivity.this, FragmentBottomTabPager.class);
				startActivity(intent);
			}
		});

	}

}
