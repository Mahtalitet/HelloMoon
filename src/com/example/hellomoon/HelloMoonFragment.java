package com.example.hellomoon;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.VideoView;

public class HelloMoonFragment extends Fragment {
	private Button mPlayButton;
	private Button mStopButton;
	private Button mPauseButton;
	private VideoView mVideoPlayer;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.fragment_hello_moon, parent, false);
		
		mVideoPlayer = (VideoView) v.findViewById(R.id.hellomoon_videoView);
		mVideoPlayer.setVideoURI(Uri.parse("android.resource://"+getContext().getPackageName()+"/"+R.raw.past_tense_song));
		
		mPlayButton = (Button) v.findViewById(R.id.hellomoon_playButton);
		mPlayButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				mVideoPlayer.start();
			}
		});
		
		mStopButton = (Button) v.findViewById(R.id.hellomoon_stopButton);
		mStopButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				mVideoPlayer.seekTo(0);
				mVideoPlayer.pause();
				
			}
		});
		
		mPauseButton = (Button) v.findViewById(R.id.hellomoon_pauseButton);
		mPauseButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				mVideoPlayer.pause();
			}
		});
		
		return v;
	}
	
	@Override 
	public void onDestroy() {
		super.onDestroy();

	}
}
