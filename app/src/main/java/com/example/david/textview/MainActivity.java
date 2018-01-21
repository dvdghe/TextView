package com.example.david.textview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText edtInputName;
    TextView txtShowName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtInputName = (EditText) findViewById(R.id.edtInputName);
        txtShowName = (TextView) findViewById(R.id.txtShowName);

        edtInputName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                txtShowName.setText( edtInputName.getText().toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
}
