package com.example.picture;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView likes;
    private Button like;
    private Button save;
    private Button delete;
    private int likesamount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        like = findViewById(R.id.Like);
        save = findViewById(R.id.Save);
        delete = findViewById(R.id.Delete);
        likes = findViewById(R.id.Likes);

        like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                liked();
            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deleted();
            }
        });
    }

    private void updateLikesDisplay() {
        likes.setText(likesamount + " polubień.");
    }
    private void liked() {
        likesamount++;
        updateLikesDisplay();
    }

    private void deleted() {
        if (likesamount > 0) {
            likesamount--;
            updateLikesDisplay();
        }
    }


}