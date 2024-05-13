package com.example.recylcerview_assignment;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //active status image and name arrays

    private ArrayList<String> user_name = new ArrayList<>();
    private ArrayList<String> user_image_url = new ArrayList<>();

    private ArrayList<String> name = new ArrayList<>();
    private ArrayList<String> image = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });



        initImageBitmaps();


    }


    private void initImageBitmaps(){


        initRecyclerView();
        chat_adap();
    }


    private void chat_adap(){
        //new code
        RecyclerView recyclerView_1 = findViewById(R.id.chat_section_recyclerView);
        recyclerView_1.setLayoutManager(new LinearLayoutManager(this));

        ChatSectionAdapter adapter_1 = new ChatSectionAdapter(this, name, image);
        recyclerView_1.setAdapter(adapter_1);

        //horizontal design
        //recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        image.add("https://images.unsplash.com/photo-1438761681033-6461ffad8d80?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8cGVyc29ufGVufDB8fDB8fHww");
        name.add("Jenny");

        image.add("https://images.unsplash.com/photo-1506748686214-e9df14d4d9d0?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTB8fHBlcnNvbnxlbnwwfHwwfHx8MA%3D%3D");
        name.add("David");

        image.add("https://images.unsplash.com/photo-1499952127939-9bbf5af6c51c?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTJ8fHBlcnNvbnxlbnwwfHwwfHx8MA%3D%3D");
        name.add("Neela");

     image.add("https://images.unsplash.com/photo-1491349174775-aaafddd81942?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTF8fHBlcnNvbnxlbnwwfHwwfHx8MA%3D%3D");
     name.add("Sara");
        image.add("https://images.unsplash.com/photo-1438761681033-6461ffad8d80?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8cGVyc29ufGVufDB8fDB8fHww");
        name.add("Jenny");

        image.add("https://images.unsplash.com/photo-1506748686214-e9df14d4d9d0?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTB8fHBlcnNvbnxlbnwwfHwwfHx8MA%3D%3D");
        name.add("David");

        image.add("https://images.unsplash.com/photo-1499952127939-9bbf5af6c51c?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTJ8fHBlcnNvbnxlbnwwfHwwfHx8MA%3D%3D");
        name.add("Neela");

        image.add("https://images.unsplash.com/photo-1491349174775-aaafddd81942?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTF8fHBlcnNvbnxlbnwwfHwwfHx8MA%3D%3D");
        name.add("Sara");


    }
    private void initRecyclerView() {
        //Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.active_status_recylerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ActiveStatusAdapter adapter = new ActiveStatusAdapter(this, user_name, user_image_url);
        recyclerView.setAdapter(adapter);

        //horizontal design
         recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));





        user_image_url.add("https://images.unsplash.com/photo-1438761681033-6461ffad8d80?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8cGVyc29ufGVufDB8fDB8fHww");
        user_name.add("Jenny");

        user_image_url.add("https://images.unsplash.com/photo-1506748686214-e9df14d4d9d0?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTB8fHBlcnNvbnxlbnwwfHwwfHx8MA%3D%3D");
        user_name.add("David");

        user_image_url.add("https://images.unsplash.com/photo-1506748686214-e9df14d4d9d0?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTB8fHBlcnNvbnxlbnwwfHwwfHx8MA%3D%3D");
        user_name.add("David");

        user_image_url.add("https://images.unsplash.com/photo-1506748686214-e9df14d4d9d0?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTB8fHBlcnNvbnxlbnwwfHwwfHx8MA%3D%3D");
        user_name.add("David");

        user_image_url.add("https://images.unsplash.com/photo-1506748686214-e9df14d4d9d0?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTB8fHBlcnNvbnxlbnwwfHwwfHx8MA%3D%3D");
        user_name.add("David");

        user_image_url.add("https://images.unsplash.com/photo-1506748686214-e9df14d4d9d0?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTB8fHBlcnNvbnxlbnwwfHwwfHx8MA%3D%3D");
        user_name.add("David");

        user_image_url.add("https://images.unsplash.com/photo-1506748686214-e9df14d4d9d0?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTB8fHBlcnNvbnxlbnwwfHwwfHx8MA%3D%3D");
        user_name.add("David");

        user_image_url.add("https://images.unsplash.com/photo-1506748686214-e9df14d4d9d0?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTB8fHBlcnNvbnxlbnwwfHwwfHx8MA%3D%3D");
        user_name.add("David");
    }
}