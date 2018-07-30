package sg.edu.rp.c346.practicalquizp11;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etNum;
    Button btnSubmit;
    Spinner spn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNum= findViewById(R.id.editText);
        btnSubmit = findViewById(R.id.button);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder myBuilder = new AlertDialog.Builder(MainActivity.this);


                final String AC = etNum.getText().toString();

                final Spinner spn = findViewById(R.id.spinner);

                //Set the dialog details
                myBuilder.setTitle("Account's Submission");
                myBuilder.setMessage("Submit: " + AC);
                myBuilder.setCancelable(false);

                spn.setId(0);


                myBuilder.setPositiveButton("Confirm", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        String msg = AC + " submitted";
                        Toast toast = Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT);
                        toast.show();
                    }
                });


                myBuilder.setNegativeButton("Cancel", null);


                AlertDialog myDialog = myBuilder.create();
                myDialog.show();
            }
        });
    }
}
