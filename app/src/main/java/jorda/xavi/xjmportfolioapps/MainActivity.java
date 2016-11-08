package jorda.xavi.xjmportfolioapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    Button btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOne = (Button) findViewById(R.id.button);
        btnOne.setOnClickListener(this); // calling onClick() method

        btnTwo = (Button) findViewById(R.id.button2);
        btnTwo.setOnClickListener(this); // calling onClick() method

        btnThree = (Button) findViewById(R.id.button3);
        btnThree.setOnClickListener(this); // calling onClick() method

        btnFour = (Button) findViewById(R.id.button4);
        btnFour.setOnClickListener(this); // calling onClick() method

        btnFive = (Button) findViewById(R.id.button5);
        btnFive.setOnClickListener(this); // calling onClick() method

        btnSix = (Button) findViewById(R.id.button6);
        btnSix.setOnClickListener(this); // calling onClick() method
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.button:
                triggerToast(getString(R.string.Popular_Movies));
                break;

            case R.id.button2:
                triggerToast(getString(R.string.Stock_Hawk));
                break;

            case R.id.button3:
                triggerToast(getString(R.string.Build_it_Bigger));
                break;

            case R.id.button4:
                triggerToast(getString(R.string.Make_Your_App_Material));
                break;

            case R.id.button5:
                triggerToast(getString(R.string.Go_Ubiquitous));
                break;

            case R.id.button6:
                triggerToast(getString(R.string.Capstone));
                break;

            default:
                break;
        }
    }

    /**
     * Show a toas msg depending of the pressed button
     * @param prj part of the msg to show containing the project name.
     */
    private void triggerToast(String prj)
    {
        Toast.makeText(this, getString(R.string.toastA) + prj + getString(R.string.toastB),
                Toast.LENGTH_LONG).show();

    }
}
