package org.kod5.android;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity {

	private ImageView img;
	private ImageView img2;

	@Override
	protected void onCreate(Bundle savedInstanceState) { // Bu metod uygulama
															// aç›ld›€›nda
															// çal›ﬂt›r›lan
															// metod.
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		img=(ImageView) findViewById(R.id.imageView1);
		img.setVisibility(View.INVISIBLE);
		img2=(ImageView) findViewById(R.id.imageView2);
		Button button = (Button) findViewById(R.id.button1);
		Button button2 = (Button) findViewById(R.id.button2);
		
		final Animation logoMoveAnimation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.logoanimation); 
		
		logoMoveAnimation.setAnimationListener(new AnimationListener() {
			
			@Override
			public void onAnimationStart(Animation animation) {
				img2.setVisibility(View.INVISIBLE);
				img.setVisibility(View.VISIBLE);
			}
			
			@Override
			public void onAnimationRepeat(Animation animation) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onAnimationEnd(Animation animation) {
				// TODO Auto-generated method stub
				
			}
		});
		
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				
				img.startAnimation(logoMoveAnimation);
				
				
			}
		});
		
		button2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				img.setVisibility(View.INVISIBLE);
				img2.setVisibility(View.VISIBLE);
			}
		});
		
		
		
	

	}
}
