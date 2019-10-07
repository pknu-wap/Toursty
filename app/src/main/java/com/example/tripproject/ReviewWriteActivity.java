package com.example.tripproject;

import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class ReviewWriteActivity extends AppCompatActivity {

    final static String foldername = Environment.getExternalStorageDirectory().getAbsolutePath()+"/reviews_";
    public static String filename = "review.txt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_write);

        final EditText text_id = (EditText)findViewById(R.id.review_text);
        final EditText title_id = (EditText)findViewById(R.id.review_title);
        Button button = (Button)findViewById(R.id.review_complete_btn);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = title_id.getText().toString();
                String text = text_id.getText().toString();

                FileOutputStream fos = null;
                try {
                    fos = openFileOutput(title + ".text", Context.MODE_PRIVATE);
                    fos.write(text.getBytes());
                    fos.close();;

                } catch (FileNotFoundException e){
                    e.printStackTrace();
                } catch(IOException e) {
                    e.printStackTrace();
                }

                Intent intet2 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intet2);
            }

        });

    }
    public void WriteTextFile(String foldername, String filename, String contents) {
        try {
            File dir = new File(foldername);
            //디렉토리 폴더가 없으면 생성함
            if (!dir.exists()) {
                dir.mkdir();
            }
            //파일 output stream 생성
            FileOutputStream fos = new FileOutputStream(foldername + "/" + filename, true);
            //파일쓰기
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fos));
            writer.write(contents);
            writer.flush();

            writer.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
