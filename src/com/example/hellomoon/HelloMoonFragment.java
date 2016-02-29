package com.example.hellomoon;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

public class HelloMoonFragment extends Fragment {
	public static final String TAG ="HelloMoonFragment";
	private VideoView mVideoView;
	private MediaController mMediaController;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.fragment_hello_moon, parent, false);
		
		mVideoView = (VideoView) v.findViewById(R.id.hellomoon_videoView);
		Uri videoUri = Uri.parse("android.resource://"+getContext().getPackageName()+"/"+R.raw.past_ense_song);
		Log.d(TAG, videoUri.toString());
		mVideoView.setVideoURI(videoUri);
		mMediaController = new MediaController(getContext());
		mVideoView.setMediaController(mMediaController);
		return v;
	}
	
	@Override 
	public void onDestroy() {
		super.onDestroy();
	}
}
