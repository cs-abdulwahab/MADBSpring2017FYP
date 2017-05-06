package com.example.abdul_wahab.madbspring2017fyp;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.abdul_wahab.madbspring2017fyp.model.User;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MTAG";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//       new CustomASyncTask().execute();

/*

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                //.url("http://publicobject.com/helloworld.txt")
                .url("http://192.168.8.104/")
                .build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Log.d(TAG, "onFailure: ");

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {

                Log.d(TAG, "onResponse: " + response.body().toString());
            }
        });
*/




    }

    class CustomASyncTask extends AsyncTask<Void, Void, Void> {

        @Override
        protected Void doInBackground(Void... voids) {


            OkHttpClient okHttpClient = new OkHttpClient();
            Request request = new Request.Builder()
                    .url("http://192.168.8.104/testLara/public/user/1")
                    .build();

            Response response = null;
            try {
                response = okHttpClient.newCall(request).execute();


                System.out.println(response.body().string());

            } catch (IOException e) {
                e.printStackTrace();
            }


            return null;
        }
    }


}
