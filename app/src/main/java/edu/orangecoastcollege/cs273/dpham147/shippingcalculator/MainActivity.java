package edu.orangecoastcollege.cs273.dpham147.shippingcalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    private static NumberFormat currency = NumberFormat.getCurrencyInstance();

    private EditText weightEditText;
    private TextView costNumTextView;
    private TextView addedNumTextView;
    private TextView totalNumTextView;

    ShipItem currentItem = new ShipItem();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weightEditText = (EditText) findViewById(R.id.weightEditText);
        costNumTextView = (TextView) findViewById(R.id.costNumTextView);
        addedNumTextView = (TextView) findViewById(R.id.addedCostNumTextView);
        totalNumTextView = (TextView) findViewById(R.id.totalNumTextView);

        weightEditText.addTextChangedListener(weightListener);

        updateViews();
    }

    private TextWatcher weightListener = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            try {
                if (s.length() != 0){
                    currentItem.setWeight(Double.parseDouble(s.toString()));
                }
                else {
                    currentItem.setWeight(0);
                }

            } catch (NumberFormatException e) {
                weightEditText.setText("");
            }
            updateViews();
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

    private void updateViews(){
        costNumTextView.setText(currency.format(currentItem.getBaseCost()));
        addedNumTextView.setText(currency.format(currentItem.getAddedCost()));
        totalNumTextView.setText(currency.format(currentItem.getTotalCost()));
    }
}
