package team.laundrywale.androidcustomerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import team.laundrywale.androidcustomerapp.R;

public class OrderActivity extends AppCompatActivity {

    public static int displayHour;
    public static int displayMinute;
    public static int displayDayOfMonth;
    public static String displayMonth = " ";
    public static int displayYear;
    public static int totalAmount;
    public static String orderNumberToShow = " ";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        TextView orderNo = findViewById(R.id.orderNo);
        TextView eta = findViewById(R.id.eta);
        TextView total = findViewById(R.id.total);


        boolean fromBar = getIntent().getBooleanExtra("from_bar", false);

        if(!fromBar){
            Bundle bundle = getIntent().getExtras();
            displayHour = bundle.getInt("display_hour");
            displayMinute=  bundle.getInt("display_min");;
            displayDayOfMonth = bundle.getInt("display_day");;
            displayMonth = bundle.getString("display_month");
            displayYear = bundle.getInt("display_year");;
            totalAmount = bundle.getInt("total_amount");
            orderNumberToShow = "129";

            orderNo.setText("Order No. : " + orderNumberToShow);
            eta.setText("Delivery ETA  : " + "0"+displayHour+":"+displayMinute+" "+displayDayOfMonth+" "+displayMonth+" "+displayYear);
            total.setText("Total Amount: Rs."+totalAmount);

        }else{
            orderNo.setText("Order No. : " + orderNumberToShow);
            eta.setText("Delivery ETA  : " + "0"+displayHour+":"+displayMinute+" "+displayDayOfMonth+" "+displayMonth+" "+displayYear);
            total.setText("Total Amount: Rs."+totalAmount);
        }

    }
}