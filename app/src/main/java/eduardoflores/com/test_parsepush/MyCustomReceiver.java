package eduardoflores.com.test_parsepush;

import com.parse.ParsePushBroadcastReceiver;

import android.content.Context;
import android.content.Intent;

/**
 * @author Eduardo Flores
 */
public class MyCustomReceiver extends ParsePushBroadcastReceiver
{
    @Override
    protected void onPushOpen(Context context, Intent intent) {
        super.onPushOpen(context, intent);

        Intent intentToMessage = new Intent(context, MessageDetails.class);
        intentToMessage.putExtras(intent);
        intentToMessage.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intentToMessage);
    }
}
