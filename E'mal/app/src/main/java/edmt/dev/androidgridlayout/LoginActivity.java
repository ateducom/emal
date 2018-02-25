package edmt.dev.androidgridlayout;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        EditText pswd,usrusr;
        TextView sup,lin;

            lin = (TextView) findViewById(R.id.lin);
            usrusr = (EditText) findViewById(R.id.usrusr);
            pswd = (EditText) findViewById(R.id.pswrdd);
            sup = (TextView) findViewById(R.id.sup);
            Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/LatoLight.ttf");
            Typeface custom_font1 = Typeface.createFromAsset(getAssets(), "fonts/LatoRegular.ttf");
            lin.setTypeface(custom_font1);
            sup.setTypeface(custom_font);
            usrusr.setTypeface(custom_font);
            pswd.setTypeface(custom_font);




            lin.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {

                    Intent it = new Intent(LoginActivity.this, SignUpActivity.class);
                    startActivity(it);
                }
            });



            sup.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    Intent it = new Intent(LoginActivity.this, SignUpActivity.class);
                    startActivity(it);
                }
            });




        }
}


