package fpt.edu.fumic.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import fpt.edu.fumic.R;
import fpt.edu.fumic.utils.MyDemoUnboundService;

public class AdminActivity extends AppCompatActivity {

    private EditText editTextMessage;
    private Button buttonSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        editTextMessage = findViewById(R.id.editTextMessage);
        buttonSend = findViewById(R.id.buttonSend);

        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = editTextMessage.getText().toString();
                // Gửi thông báo đến dịch vụ để xử lý
                sendNotification(message);
            }
        });
    }

    private void sendNotification(String message) {
        Intent serviceIntent = new Intent(this, MyDemoUnboundService.class);
        serviceIntent.putExtra("MSG", message);
        startService(serviceIntent);
    }
}
