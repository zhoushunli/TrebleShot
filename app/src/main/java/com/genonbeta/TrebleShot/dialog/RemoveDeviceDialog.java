package com.genonbeta.TrebleShot.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;

import com.genonbeta.TrebleShot.R;
import com.genonbeta.TrebleShot.object.NetworkDevice;
import com.genonbeta.TrebleShot.util.AppUtils;

public class RemoveDeviceDialog extends AlertDialog.Builder
{
    public RemoveDeviceDialog(@NonNull final Context context, final NetworkDevice device)
    {
        super(context);

        setTitle(R.string.ques_removeDevice);
        setMessage(R.string.text_removeDeviceSummary);
        setNegativeButton(R.string.butn_cancel, null);
        setPositiveButton(R.string.butn_proceed, new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                AppUtils.getDatabase(context).remove(device);
            }
        });
    }
}
