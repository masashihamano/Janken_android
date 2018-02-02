package pre.practice.janken;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by masashihamano on 2018/01/20.
 */


public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onJankenButtonTapped(View view) {
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("MY_HAND", view.getId());
        startActivity(intent);
    }

}
