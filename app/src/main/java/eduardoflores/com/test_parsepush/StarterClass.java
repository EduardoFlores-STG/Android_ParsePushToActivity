package eduardoflores.com.test_parsepush;

import com.parse.Parse;
import com.parse.ParseInstallation;

import android.app.Application;

/**
 * @author Eduardo Flores
 */
public class StarterClass extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Setup Parse
        Parse.initialize(this, "...", "...");
        ParseInstallation.getCurrentInstallation().saveInBackground();
    }
}
