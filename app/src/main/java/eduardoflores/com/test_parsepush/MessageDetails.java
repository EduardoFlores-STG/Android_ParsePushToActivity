package eduardoflores.com.test_parsepush;

import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

/**
 * @author Eduardo Flores
 */
public class MessageDetails extends Activity {

    /*
    Parse is now sending this JSON:

    {
        "alert": "Test push 14",
        "badge": "Increment",
        "sound": "chime",
        "title": "Hey! You got a new notification!",
        "body": "Hello, this is a test push notification from Parse, coming to you via an android app"
    }
     */
    TextView messageDetailsTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.message_details_activity);

        String messageContent = "NO DATA";
        if (getIntent() != null && getIntent().getExtras() != null && getIntent().getExtras().getString("com.parse.Data") != null)
        {
            try
            {
                JSONObject json = new JSONObject(getIntent().getExtras().getString("com.parse.Data"));
                Log.i("MY_APP", json.toString());
                messageContent = json.getString("body");

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        messageDetailsTextView = (TextView)findViewById(R.id.tv_message);
        messageDetailsTextView.setText(messageContent);
    }
}
