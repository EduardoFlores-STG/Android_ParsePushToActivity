package eduardoflores.com.test_parsepush;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * @author Eduardo Flores
 */
public class InboxActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inbox_activity);


        Button buttonToMessageDetails = (Button)findViewById(R.id.button_message_details);
        buttonToMessageDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InboxActivity.this, MessageDetails.class);
                startActivity(intent);
            }
        });
    }
}
