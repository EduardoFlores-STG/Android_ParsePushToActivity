package eduardoflores.com.test_parsepush;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * @author Eduardo Flores
 */
public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);


        Button buttonToInbox = (Button)findViewById(R.id.button_start_inbox);
        buttonToInbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, InboxActivity.class);
                startActivity(intent);
            }
        });
    }
}
