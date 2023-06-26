package com.example.practical4task1;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Registration Form (02, 14, 43)");
    }
    public void onRegisterBtnClick(View view)
    {
        TextView output = findViewById(R.id.output);
        EditText edtTxtFirstName = findViewById(R.id.edtTxtFirstName);
        EditText edtTxtLastName = findViewById(R.id.edtTxtLastName);
        EditText edtTxtEmail =findViewById(R.id.edtTxtEmail);
        StringBuilder builder = new StringBuilder();
        builder.append("First name:").append(edtTxtFirstName.getText().toString()).append("\n");
        builder.append("Last name:").append(edtTxtLastName.getText().toString()).append("\n");
        builder.append("Email Address:").append(edtTxtEmail.getText().toString()).append("\n");

        output.setText(builder.toString());
    }
}
