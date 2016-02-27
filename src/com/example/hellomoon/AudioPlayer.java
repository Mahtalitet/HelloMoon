package com.example.hellomoon;

import android.content.Context;
import android.media.MediaPlayer;

public class AudioPlayer {
	private MediaPlayer mPlayer;
	
	public void play(Context c) {
		stop();
		mPlayer = MediaPlayer.create(c, R.raw.one_small_step);
		mPlayer.start();
		
		mPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
			
			@Override
			public void onCompletion(MediaPlayer mp) {
				stop();
				
			}
		});
		
	}
	
	public void stop() {
		if (mPlayer != null) {
			mPlayer.release();
			mPlayer = null;
		}
	}
}
