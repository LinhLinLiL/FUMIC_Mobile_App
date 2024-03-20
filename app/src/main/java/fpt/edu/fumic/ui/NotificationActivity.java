package fpt.edu.fumic.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import fpt.edu.fumic.R;
public class NotificationActivity extends AppCompatActivity {

    private TextView textViewMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_admin);

        textViewMessage = findViewById(R.id.tv_notification);

        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("Mess")) {
            String message = intent.getStringExtra("Mess");
            textViewMessage.setText(message);
        }
    }
}
