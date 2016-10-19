package com.example.activitylifecycletest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.view.View;
public class MainActivity extends Activity {
   public static final String TAG="MainActivity";
   protected void onCreate(Bundle savedInstanceState){
	   super.onCreate(savedInstanceState);
	   Log.d(TAG, "onCreate");
	   requestWindowFeature(Window.FEATURE_NO_TITLE);
	   setContentView(R.layout.activity_main);
	   if (savedInstanceState!=null){
		   String tempData=savedInstanceState.getString("data_key");
		   Log.d(TAG, tempData);
	   }
	   Button startNormalActivity=(Button) findViewById(R.id.start_normal_activity);
	   Button startDialogActivity=(Button) findViewById(R.id.start_dialog_activity);
	   startNormalActivity.setOnClickListener( new OnClickListener(){
		  public void onClick(View v){
			  Intent intent=new Intent(MainActivity.this, NomalActivity.class);
			  startActivity(intent);
			  
		  }  
	   });
	   startDialogActivity.setOnClickListener(new OnClickListener(){
		   public void onClick(View v){
			   Intent intent=new Intent(MainActivity.this,DialogActivity.class);
			   startActivity(intent);
		   }
	   });
	  
   }
   protected void onSaveInstanceState(Bundle outState){
	   super.onSaveInstanceState(outState);
	   String tempData="Something you just typed";
	   outState.putString("data_key", tempData);
   }
   protected void onStart(){
	   super.onStart();
	   Log.d(TAG, "onStart");
	   
   }
   protected void onResume(){
	   super.onResume();
	   Log.d(TAG,"onResume");
	   
   }
   protected void onPause(){
	   super.onPause();
	   Log.d(TAG, "onPause");
   }
   protected void onStop(){
	   super.onStop();
	   Log.d(TAG,"onStop");
   }
   protected void onDestroy(){
	   super.onDestroy();
	   Log.d(TAG, "onDestroy");
   }
   protected void onRestart(){
	   super.onRestart();
	   Log.d(TAG, "onRestart");
   }
}
