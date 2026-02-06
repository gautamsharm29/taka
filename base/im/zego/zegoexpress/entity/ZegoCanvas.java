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
 * View object.
 *
 * Configure view object, view Mode, background color
 */
public class ZegoCanvas {

    /** View object */
    public Object view;

    /** View mode, default is ZegoViewModeAspectFit */
    public ZegoViewMode viewMode;

    /** Background color, the format is 0xRRGGBB, default is black, which is 0x000000 */
    public int backgroundColor;

    /** If enable alpha blend render, default is false. */
    public boolean alphaBlend;

    public ZegoCanvas(Object view) {
        this.view = view;
        this.viewMode = ZegoViewMode.ASPECT_FIT;
        this.backgroundColor = 0x000000;
        this.alphaBlend = false;
    }
}
