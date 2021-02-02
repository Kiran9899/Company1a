package menu.kiran.company1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class RetriveDataActivity extends AppCompatActivity
{
    ListView myListView;
    List<Client>clientList;

    DatabaseReference clientDBRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrive_data);

        myListView=findViewById(R.id.myListView);
        clientList =new ArrayList<>();

        clientDBRef = FirebaseDatabase.getInstance().getReference("client");

        clientDBRef.addValueEventListener(new ValueEventListener()
        {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot)
            {
                clientList.clear();
                for (DataSnapshot clientDatasnap:snapshot.getChildren())
                    {
                        Client client=clientDatasnap.getValue(Client.class);
                        clientList.add(client);

                    }
                ListAdapter adapter=new ListAdapter(RetriveDataActivity.this,clientList);
                myListView.setAdapter(adapter);


            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}