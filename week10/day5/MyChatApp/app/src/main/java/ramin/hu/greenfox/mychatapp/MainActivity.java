package ramin.hu.greenfox.mychatapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 //   Button sendButton;
 //   EditText editText;
 //   ListView messageList;
    MessageAdapter messageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        messageAdapter = new MessageAdapter(this);

        Button sendButton = (Button) findViewById(R.id.button);
        final EditText editText = (EditText) findViewById(R.id.editText);
        ListView messageList = (ListView) findViewById(R.id.messageList);

        messageList.setAdapter(messageAdapter);
 //       messageAdapter.add(new Message("Ramin", "Hello World"));
 //       messageAdapter.add(new Message("Norbi", "Hello Eagles"));
  //      messageAdapter.add(new Message("Szilvi", "Hello, Surprise!"));
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                messageAdapter.add(new Message("Ramin", editText.getText().toString()));
            }
        });
    }


    public void onButtonTap(View v) {
        Toast myToast = Toast.makeText(
                getApplicationContext(),
                "Oops, message sent!",
                Toast.LENGTH_LONG);
        myToast.show();
    }

}
