package edu.eou.richarad.richardsonproject;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private static String TAG = "MainActivity";
    private Button c3Button;
    private Button d3Button;
    private Button e3Button;
    private Button f3Button;
    private Button g3Button;
    private Button a3Button;
    private Button b3Button;
    private Button c4Button;
    private MediaPlayer c3Note;
    private MediaPlayer d3Note;
    private MediaPlayer e3Note;
    private MediaPlayer f3Note;
    private MediaPlayer g3Note;
    private MediaPlayer a3Note;
    private MediaPlayer b3Note;
    private MediaPlayer c4Note;
    private static final String c3key = "C3";
    private static final String d3key = "D3";
    private static final String e3key = "E3";
    private static final String f3key = "F3";
    private static final String g3key = "G3";
    private static final String a3key = "A3";
    private static final String b3key = "B3";
    private static final String c4key = "C4";
    private String previousKey = "";
    private ImageView sheetTitle;
    private ImageView sheetMusic;
   // private ImageView infoNote;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        //sets up the R.id's for the Button and the MediaPlayer objects
        idSetUp();
        float currentVolume = Singleton.getVolume();
        adjustVolume(currentVolume);

        //creates a listener for the c3 button
        c3Button.setOnClickListener(new View.OnClickListener(){
            /*  onClick
                Description:
                    If the C3 button was pressed it checks if another mp3 is playing, stops it if it
                    is, and plays conekey.mp3
                Parameters:
                    View v - a rectangular area, in this case a button
                Return:
                    void
            */
            @Override
            public void onClick(View v){
                //plays c3 key not
                playKey(c3key);
                //log message
                Log.d(TAG, "User Pressed: C3 Button");

            }//end of onClicked
        });//end of View.OnClickListener


        //creates a listener for the d3 button
        d3Button.setOnClickListener(new View.OnClickListener(){
            /*  onClick
                Description:
                    If the D3 button was pressed it checks if another mp3 is playing, stops it if it
                    is, and plays dkey.mp3
                Parameters:
                    View v - a rectangular area, in this case a button
                Return:
                    void
            */
            @Override
            public void onClick(View v){
                //plays d3 key not
                playKey(d3key);
                //log message
                Log.d(TAG, "User Pressed: D3 Button");

            }//end of onClicked
        });//end of View.OnClickListener


        //creates a listener for the e3 button
        e3Button.setOnClickListener(new View.OnClickListener(){
            /*  onClick
                Description:
                    If the E3 button was pressed it checks if another mp3 is playing, stops it if it
                    is, and plays ekey.mp3
                Parameters:
                    View v - a rectangular area, in this case a button
                Return:
                    void
            */
            @Override
            public void onClick(View v){
                //plays e3 key not
                playKey(e3key);
                //log message
                Log.d(TAG, "User Pressed: E3 Button");

            }//end of onClicked
        });//end of View.OnClickListener


        //creates a listener for the f3 button
        f3Button.setOnClickListener(new View.OnClickListener(){
            /*  onClick
                Description:
                    If the F3 button was pressed it checks if another mp3 is playing, stops it if it
                    is, and plays fkey.mp3
                Parameters:
                    View v - a rectangular area, in this case a button
                Return:
                    void
            */
            @Override
            public void onClick(View v){
                //plays f3 key not
                playKey(f3key);
                //log message
                Log.d(TAG, "User Pressed: F3 Button");

            }//end of onClicked
        });//end of View.OnClickListener


        //creates a listener for the g3 button
        g3Button.setOnClickListener(new View.OnClickListener(){
            /*  onClick
                Description:
                    If the G3 button was pressed it checks if another mp3 is playing, stops it if it
                    is, and plays gkey.mp3
                Parameters:
                    View v - a rectangular area, in this case a button
                Return:
                    void
            */
            @Override
            public void onClick(View v){
                //plays g3 key not
                playKey(g3key);
                //log message
                Log.d(TAG, "User Pressed: G3 Button");

            }//end of onClicked
        });//end of View.OnClickListener


        //creates a listener for the a3 button
        a3Button.setOnClickListener(new View.OnClickListener(){
            /*  onClick
                Description:
                    If the A3 button was pressed it checks if another mp3 is playing, stops it if it
                    is, and plays akey.mp3
                Parameters:
                    View v - a rectangular area, in this case a button
                Return:
                    void
            */
            @Override
            public void onClick(View v){
                //plays a3 key not
                playKey(a3key);
                //log message
                Log.d(TAG, "User Pressed: A3 Button");

            }//end of onClicked
        });//end of View.OnClickListener


        //creates a listener for the b3 button
        b3Button.setOnClickListener(new View.OnClickListener(){
            /*  onClick
                Description:
                    If the B3 button was pressed it checks if another mp3 is playing, stops it if it
                    is, and plays bkey.mp3
                Parameters:
                    View v - a rectangular area, in this case a button
                Return:
                    void
            */
            @Override
            public void onClick(View v){
                //plays b3 key not
                playKey(b3key);
                //log message
                Log.d(TAG, "User Pressed: B3 Button");

            }//end of onClicked
        });//end of View.OnClickListener


        //creates a listener for the c4 button
        c4Button.setOnClickListener(new View.OnClickListener(){
            /*  onClick
                Description:
                    If the C4 button was pressed it checks if another mp3 is playing, stops it if it
                    is, and plays cfourkey.mp3
                Parameters:
                    View v - a rectangular area, in this case a button
                Return:
                    void
            */
            @Override
            public void onClick(View v){
                //plays c4 key not
                playKey(c4key);
                //log message
                Log.d(TAG, "User Pressed: C4 Button");

            }//end of onClicked
        });//end of View.OnClickListener
    }//end of onCreate

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_help) {
            Intent intent = new Intent(MainActivity.this, HelpActivity.class);
            startActivity(intent);
            finish();
            return true;
        }
        if (id == R.id.action_about) {
            Intent intent = new Intent(MainActivity.this, AboutActivity.class);
            startActivity(intent);
            finish();
            return true;
        }
        if (id == R.id.action_settings) {
            Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
            startActivity(intent);
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.teaPot) {
            sheetMusic.setImageResource(R.drawable.teapot);
            sheetTitle.setImageResource(R.drawable.teapottitle);
        } else if (id == R.id.starWars) {
            sheetMusic.setImageResource(R.drawable.starwars);
            sheetTitle.setImageResource(R.drawable.starwarstitle);
        } else if (id == R.id.littleLamb) {
            sheetMusic.setImageResource(R.drawable.littlelamb);
            sheetTitle.setImageResource(R.drawable.lambtitle);
        } else if (id == R.id.twinkleStar) {
            sheetMusic.setImageResource(R.drawable.twinkle);
            sheetTitle.setImageResource(R.drawable.twinkletitle);
        } else if (id == R.id.macDonald) {
            sheetMusic.setImageResource(R.drawable.macdonald);
            sheetTitle.setImageResource(R.drawable.macdonaldtitle);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    /*  idSetUp
    Description:
        Sets Button objects to the appropriate R.id and the MediaPlayer objects to the right mp3
        file.
    Parameters:
        Not Applicable
    Return:
        void
    */
    private void idSetUp(){
        c3Button = (Button) findViewById(R.id.keyC3);
        d3Button = (Button) findViewById(R.id.keyD3);
        e3Button = (Button) findViewById(R.id.keyE3);
        f3Button = (Button) findViewById(R.id.keyF3);
        g3Button = (Button) findViewById(R.id.keyG3);
        a3Button = (Button) findViewById(R.id.keyA3);
        b3Button = (Button) findViewById(R.id.keyB3);
        c4Button = (Button) findViewById(R.id.keyC4);
        sheetTitle = (ImageView) findViewById(R.id.sheetTitle);
        sheetMusic = (ImageView)findViewById(R.id.sheetMusic);
        c3Note = MediaPlayer.create(this, R.raw.conekey);
        d3Note = MediaPlayer.create(this, R.raw.dkey);
        e3Note = MediaPlayer.create(this, R.raw.ekey);
        f3Note = MediaPlayer.create(this, R.raw.fkey);
        g3Note = MediaPlayer.create(this, R.raw.gkey);
        a3Note = MediaPlayer.create(this, R.raw.akey);
        b3Note = MediaPlayer.create(this, R.raw.bkey);
        c4Note = MediaPlayer.create(this, R.raw.ctwokey);
    }

    /*  playKey
    Description:
        Plays the mp3 for the button key that was pressed by the user.
    Parameters:
        String - keyNote - A string of the key note button that was pressed by the user.
    Return:
        void
    */
    private void playKey(String keyNote){
        switch (keyNote){
            case "C3":
                if (c3Note.isPlaying()){stopKey("C3");}
                c3Note.start();
                break;
            case "D3":
                if (c3Note.isPlaying()){stopKey("D3");}
                d3Note.start();
                break;
            case "E3":
                if (c3Note.isPlaying()){stopKey("E3");}
                e3Note.start();
                break;
            case "F3":
                if (c3Note.isPlaying()){stopKey("F3");}
                f3Note.start();
                break;
            case "G3":
                if (c3Note.isPlaying()){stopKey("G3");}
                g3Note.start();
                break;
            case "A3":
                if (c3Note.isPlaying()){stopKey("A3");}
                a3Note.start();
                break;
            case "B3":
                if (c3Note.isPlaying()){stopKey("B3");}
                b3Note.start();
                break;
            case "C4":
                if (c3Note.isPlaying()){stopKey("D3");}
                c4Note.start();
                break;
        }//end of swtich
        previousKey = keyNote;
    }//end of playKey()

    /*  stopKey()
    Description:
        If there is an audio playing it'ss stop it and re-prepare i
    Parameters:
        Not Applicable
    Return:
        void
    */
    private void stopKey(String key) {
        switch (key) {
            case "C3":
                c3Note.stop();
                try {
                    c3Note.prepare();
                }//end of try
                    catch(Exception e){
                    e.printStackTrace();
                }//end of catch
                break;
            case "D3":
                d3Note.stop();
                try {
                    d3Note.prepare();
                }//end of try
                catch(Exception e){
                    e.printStackTrace();
                }//end of catch
                break;
            case "E3":
                e3Note.stop();
                try {
                    e3Note.prepare();
                }//end of try
                catch(Exception e){
                    e.printStackTrace();
                }//end of catch
                break;
            case "F3":
                f3Note.stop();
                try {
                    f3Note.prepare();
                }//end of try
                catch(Exception e){
                    e.printStackTrace();
                }//end of catch
                break;
            case "G3":
                g3Note.stop();
                try {
                    g3Note.prepare();
                }//end of try
                catch(Exception e){
                    e.printStackTrace();
                }//end of catch
                break;
            case "A3":
                a3Note.stop();
                try {
                    a3Note.prepare();
                }//end of try
                catch(Exception e){
                    e.printStackTrace();
                }//end of catch
                break;
            case "B3":
                b3Note.stop();
                try {
                    b3Note.prepare();
                }//end of try
                catch(Exception e){
                    e.printStackTrace();
                }//end of catch
                break;
            case "C4":
                c4Note.stop();
                try {
                    c4Note.prepare();
                }//end of try
                catch(Exception e){
                    e.printStackTrace();
                }//end of catch
                break;
        }//end of switch
    }//end of stopKey

    /*  adjustVolume()
    Description:
        Adjusts the volume of the zylophone buttons
    Parameters:
        float - volume setting
    Return:
        void
    */
    private void adjustVolume(float vol) {
        System.out.println("he volume is " + vol);
        c3Note.setVolume(vol, vol);
        d3Note.setVolume(vol, vol);
        e3Note.setVolume(vol, vol);
        f3Note.setVolume(vol, vol);
        g3Note.setVolume(vol, vol);
        a3Note.setVolume(vol, vol);
        b3Note.setVolume(vol, vol);
        c4Note.setVolume(vol, vol);
    }
}//end of MainActivity
