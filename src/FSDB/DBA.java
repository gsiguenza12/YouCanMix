package FSDB;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class DBA {
    public static void main(String[] args) throws IOException {
       /*
        //C:/Users/umana/Desktop/SCHOOL/YCM211f9.json
        FirebaseOptions Foptions = FirebaseOptions.builder()
                .setCredentials(GoogleCredentials.getApplicationDefault())
                .setDatabaseUrl("https://youcanmix-211f9-default-rtdb.firebaseio.com")
                .build();


        FirebaseApp.initializeApp(Foptions);




        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ref = database.getReference("server/saving-data/fireblog");

        DatabaseReference usersRef = ref.child("users");

        Map<String, User> users = new HashMap<>();
        //usersRef.child("alanisawesome").setValueAsync(new User("June 23, 1912", "Alan Turing"));
        //usersRef.child("gracehop").setValueAsync(new User("December 9, 1906", "Grace Hopper"));

        //users.put("alanisawesome", new User("June 23, 1912", "Alan Turing"));
        //users.put("gracehop", new User("December 9, 1906", "Grace Hopper"));

        usersRef.setValueAsync(users);

        DatabaseReference dataRef = ref.child("data");
        dataRef.setValue("I'm writing data", new DatabaseReference.CompletionListener() {
            @Override
            public void onComplete(DatabaseError databaseError, DatabaseReference databaseReference) {
                if (databaseError != null) {
                    System.out.println("Data could not be saved " + databaseError.getMessage());
                } else {
                    System.out.println("Data saved successfully.");
                }
            }
        });


    }

        */
// Fetch the service account key JSON file contents
        FileInputStream serviceAccount = new FileInputStream("C:/Users/umana/Desktop/SCHOOL/YCM211f9.json");

// Initialize the app with a service account, granting admin privileges
        FirebaseOptions options = FirebaseOptions.builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                // The database URL depends on the location of the database
                .setDatabaseUrl("https://youcanmix-211f9-default-rtdb.firebaseio.com")
                .build();
        FirebaseApp.initializeApp(options);

// As an admin, the app has access to read and write all data, regardless of Security Rules
        DatabaseReference ref = FirebaseDatabase.getInstance()
                .getReference("restricted_access/secret_document");
        ref.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Object document = dataSnapshot.getValue();
                System.out.println(document);
            }

            @Override
            public void onCancelled(DatabaseError error) {
            }
        });


        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ref = database.getReference("server/saving-data/fireblog");

        DatabaseReference dataRef = ref.child("data");
        dataRef.setValue("I'm writing data", new DatabaseReference.CompletionListener() {
            @Override
            public void onComplete(DatabaseError databaseError, DatabaseReference databaseReference) {
                if (databaseError != null) {
                    System.out.println("Data could not be saved " + databaseError.getMessage());
                } else {
                    System.out.println("Data saved successfully.");
                }
            }

    });

}