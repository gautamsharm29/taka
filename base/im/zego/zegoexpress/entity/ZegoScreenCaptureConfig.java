package im.zego.zegoexpress.entity;

import android.app.Application;
import android.graphics.*;
import im.zego.zegoexpress.*;
import im.zego.zegoexpress.callback.*;
import im.zego.zegoexpress.constants.*;
import im.zego.zegoexpress.entity.*;
import im.zego.zegoexpress.internal.*;
import java.nio.*;
import java.util.*;
import org.json.*;

/**
 * Screen capture configuration parameters.
 */
public class ZegoScreenCaptureConfig {

    /** Whether to capture video when screen capture. The default is true. */
    public boolean captureVideo;

    /** Whether to capture audio when screen capture. The default is true. */
    public boolean captureAudio;

    /** Set the audio capture parameters during screen capture. (only for Android) */
    public ZegoAudioFrameParam audioParam;

    /** Set the crop rectangle during screen capture. The crop rectangle must be included in the rectangle of the original data, unit is pixel. (only for iOS/Android) */
    public Rect cropRect;

    public ZegoScreenCaptureConfig() {
        captureVideo = true;
        captureAudio = true;
        audioParam = new ZegoAudioFrameParam();
        audioParam.sampleRate = ZegoAudioSampleRate.ZEGO_AUDIO_SAMPLE_RATE_16K;
        audioParam.channel = ZegoAudioChannel.STEREO;
        cropRect = new Rect(0, 0, 0, 0);
    }
}
