package nanodegree.course.applauncher;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void runApp(View view){
        Button button = (Button) view;
        Toast.makeText(this, "This will launch " + button.getText().toString(), Toast.LENGTH_SHORT).show();
    }
}
