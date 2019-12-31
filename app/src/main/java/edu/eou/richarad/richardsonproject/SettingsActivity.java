package edu.eou.richarad.richardsonproject;


import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.SeekBar;

public class SettingsActivity extends AppCompatActivity {
    private static String TAG = "MainActivity";
    private final static int MAX_VOLUME = 100;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_back:
                    Intent intent = new Intent(SettingsActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.nav_setting);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);


        //sets the seekbar to seekBar id
        SeekBar mSeekBar = (SeekBar) findViewById(R.id.seekBar);
        //sets up the seekbar listener
        mSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            /*  onProgressChanged
                Description:
                    Notification that the user's clicked or touched gesture on the seekBar is over
                Parameters:
                    SeekBar seekBar - the seekBar object
                    int progress - where on the seekbar the new volume is which is between 0-100
                    boolean fromUser - true if a user adjusted the seekbar
                Return:
                    void
            */
            @Override
            public void onProgressChanged(SeekBar seekbar, int progress, boolean fromUser) {
                //converts progress to float and divides by 100 to get percentage
                float volume = (( float)progress) / MAX_VOLUME;
                //sets the Volume for mSong
                Singleton.setVolume(volume);
                //prints a message to the log window stating the new volume
                Log.d(TAG, "User Pressed: Background volume adjusted to " + progress);
            }//end of onProgressChanged

            /*  onStartTrackingTouch
                Description:
                    Notification that the user clicked or touched the seekBar
                Parameters:
                    SeekBar - the seekbar object
                Return:
                    void
             */
            @Override
            public void onStartTrackingTouch(SeekBar seekbar) {
            }//end of onStartTrackingTouch

            /*  onStopTrackingTouch
                Description:
                    Notification that the user's clicked or touched gesture on the seekBar is over
                Parameters:
                    SeekBar - the seekbar object
                Return:
                    void
             */
            @Override
            public void onStopTrackingTouch(SeekBar seekbar) {
            }//end of onStopTrackingTouch
        });

        //sets initial volume to 75
        mSeekBar.setProgress((int)(Singleton.getVolume()*100));
    }//end of onCreate
}//end of MainActivity

