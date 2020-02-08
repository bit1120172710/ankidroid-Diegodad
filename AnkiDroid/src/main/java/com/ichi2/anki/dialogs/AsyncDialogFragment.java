package com.ichi2.anki.dialogs;
import android.content.res.Resources;
import android.os.Message;

import com.ichi2.anki.AnkiDroidApp;
import com.ichi2.anki.analytics.AnalyticsDialogFragment;

public abstract class AsyncDialogFragment extends AnalyticsDialogFragment {
    /* provide methods for text to show in notification bar when the DialogFragment
       can't be shown due to the host activity being in stopped state.
       This can happen when the DialogFragment is shown from 
       the onPostExecute() method of an AsyncTask */

    // 当一些DialogFragment由于host activity停止而无法正常显示的时候出现的提示对话框。
    // 应该是在异步线程调用onPostExecute()方法后创建这个Dialog

    public abstract String getNotificationMessage();
    public abstract String getNotificationTitle();

    public Message getDialogHandlerMessage() {
        return null;
    }

    protected Resources res() {
        return AnkiDroidApp.getAppResources();
    }
} 