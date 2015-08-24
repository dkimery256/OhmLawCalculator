package kimery.com.ohmlawcalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class OhmsLawCalculator extends Activity {

    private TextView voltLabel;
    private TextView resLabel;
    private TextView currentLabel;
    private RelativeLayout selectLayout;
    private RelativeLayout voltsLayout;
    private RelativeLayout currentLayout;
    private RelativeLayout resistanceLayout;

    public OhmsLawCalculator() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ohms_law_calculator);
        //Get reference IDs
        voltLabel = (TextView) findViewById(R.id.voltLabel);
        resLabel = (TextView) findViewById(R.id.resLabel);
        currentLabel = (TextView) findViewById(R.id.currentLabel);
        //Set listeners
        voltLabel.setOnClickListener(imageClickListener);
        resLabel.setOnClickListener(imageClickListener);
        currentLabel.setOnClickListener(imageClickListener);
        //Set Layouts
        selectLayout = (RelativeLayout)findViewById(R.id.select_layout);
        voltsLayout = (RelativeLayout)findViewById(R.id.volts_layout);
        currentLayout = (RelativeLayout)findViewById(R.id.current_layout);
        resistanceLayout = (RelativeLayout)findViewById(R.id.resistance_layout);
        selectLayout.setVisibility(View.VISIBLE);
        voltsLayout.setVisibility(View.GONE);
        currentLayout.setVisibility(View.GONE);
        resistanceLayout.setVisibility(View.GONE);
    }

    private OnClickListener imageClickListener = new OnClickListener() {

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.voltLabel:
                    voltsLayout.setVisibility(View.VISIBLE);
                    selectLayout.setVisibility(View.GONE);
                    currentLayout.setVisibility(View.GONE);
                    resistanceLayout.setVisibility(View.GONE);
                    break;
                case R.id.resLabel:
                    resistanceLayout.setVisibility(View.VISIBLE);
                    voltsLayout.setVisibility(View.GONE);
                    selectLayout.setVisibility(View.GONE);
                    currentLayout.setVisibility(View.GONE);
                    break;
                case R.id.currentLabel:
                    currentLayout.setVisibility(View.VISIBLE);
                    voltsLayout.setVisibility(View.GONE);
                    selectLayout.setVisibility(View.GONE);
                    resistanceLayout.setVisibility(View.GONE);
                    break;
            }
        }
    };
    @Override
    public void onBackPressed() {
        selectLayout.setVisibility(View.VISIBLE);
        voltsLayout.setVisibility(View.GONE);
        currentLayout.setVisibility(View.GONE);
        resistanceLayout.setVisibility(View.GONE);
    }
}

