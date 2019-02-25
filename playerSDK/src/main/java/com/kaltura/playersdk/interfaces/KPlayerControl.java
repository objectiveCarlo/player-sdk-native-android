package com.kaltura.playersdk.interfaces;

import android.app.Activity;

import com.kaltura.playersdk.tracks.KTrackActions;
import com.kaltura.playersdk.widevine.LicenseResource;

/**
 * Created by carloluismb on 11/10/16.
 */

public interface KPlayerControl extends KMediaControl {
    void destroy();

    void savePlayerState();

    void recoverPlayerState();

    void initIMA(String adsURL, String adMimeType, int adPreferredBitrate, Activity activity);

    void changeMedia();

    void reset();

    void setWidevineClassicLicenseDataSource(LicenseResource widevineClassicDataSource);

    void setCurrentPlaybackTime(float mStartPosition);

    void setSrc(String videoLicenseUrl);

    void setLicenseUri(String license);

    void recoverPlayer();

    void setTracksEventListener(KTrackActions.EventListener tracksEventListener);

    void setVideoTrackEventListener(KTrackActions.VideoTrackEventListener videoTrackEventListener);

    void setAudioTrackEventListener(KTrackActions.AudioTrackEventListener audioTrackEventListener);

    void setTextTrackEventListener(KTrackActions.TextTrackEventListener textTrackEventListener);

    int getCurrentPossibleBitRate();

    void toggleMaximizeMode();

    void setMaxVideoSize(int width, int height);
}
