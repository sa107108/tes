package tw.edu.tut.mis.sa107108;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private final String TAG ="ooxx MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG,"this is a book");
        Log.d(TAG,"this is a book");
        super.onCreate(savedInstanceState);
        Log.v(TAG,"this is a book");
        setContentView(R.layout.activity_main);
    }
}
