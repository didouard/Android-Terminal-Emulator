package com.meuuh.doud.vp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "TelnetLaunchActivity";

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        final Context context = this;

        final EditText hostEdit = (EditText) findViewById(R.id.hostname);
        addClickListener(R.id.launchTelnet, new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(context, TermActivity.class);
                intent.putExtra("type", "telnet");
                String hostname = hostEdit.getText().toString();
                intent.putExtra("host", hostname);
                startActivity(intent);
            }});
    }

    private void addClickListener(int buttonId, View.OnClickListener onClickListener) {
        ((Button) findViewById(buttonId)).setOnClickListener(onClickListener);
    }
}
