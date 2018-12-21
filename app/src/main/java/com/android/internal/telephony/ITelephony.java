package com.android.internal.telephony;
/**
 * Created by Amit Tiwari on 01-12-2018.
 */

public interface ITelephony {
    boolean endCall();
    void answerRingingCall();
    void silenceRinger();
}
