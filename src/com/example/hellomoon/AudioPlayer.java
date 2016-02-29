package com.example.hellomoon;

import android.content.Context;
import android.media.MediaPlayer;

public class AudioPlayer {
	private MediaPlayer mPlayer;
	private boolean isPause; 
	
	public void setFile(Context c) {
		mPlayer = MediaPlayer.create(c, R.raw.one_small_step);
	}
	
	public void play(Context c) {
		if (isPause) {
			isPause = false;
			mPlayer.start();
		} else {
			setFile(c);
			mPlayer.start();
		}
		
		mPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
			
			@Override
			public void onCompletion(MediaPlayer mp) {
				release();
			}
		});

	}
	
	public void pause() {
		if((mPlayer != null) && mPlayer.isPlaying()) {
			mPlayer.pause();
			isPause = true;
		}
	}
	
	public void stop() {
		if (mPlayer != null) {
			release();
		}
	}
	
	public void release() {
		if (mPlayer != null) {
			mPlayer.release();
			mPlayer = null;
			isPause = false;
		}
	}
}
