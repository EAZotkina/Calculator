package com.eazot.calculatorazot;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DarkActivity extends AppCompatActivity implements CalculatorView{

    private CalculatePresenter presenter;

    public DarkActivity(TextView resultText) {
        this.resultText = resultText;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dark);
        presenter = new CalculatePresenter(this, new CalculatorImpl());

        findViewById(R.id.button1).setOnClickListener(v -> presenter.keyOnePressed());
        findViewById(R.id.button2).setOnClickListener(v -> presenter.keyTwoPressed());
        findViewById(R.id.button3).setOnClickListener(v -> presenter.keyTreePressed());
        findViewById(R.id.button4).setOnClickListener(v -> presenter.keyFourPressed());
        findViewById(R.id.button5).setOnClickListener(v -> presenter.keyFivePressed());
        findViewById(R.id.button6).setOnClickListener(v -> presenter.keySixPressed());
        findViewById(R.id.button7).setOnClickListener(v -> presenter.keySevenPressed());
        findViewById(R.id.button8).setOnClickListener(v -> presenter.keyEightPressed());
        findViewById(R.id.button9).setOnClickListener(v -> presenter.keyNinePressed());
        findViewById(R.id.button0).setOnClickListener(v -> presenter.keyZeroPressed());
        findViewById(R.id.button_equal).setOnClickListener(v -> presenter.keyEqualPressed());
        findViewById(R.id.button_multi).setOnClickListener(v -> presenter.keyMultiPressed());
        findViewById(R.id.button_divide).setOnClickListener(v -> presenter.keyDividePressed());
        findViewById(R.id.button_add).setOnClickListener(v -> presenter.keyAddPressed());
        findViewById(R.id.button_sub).setOnClickListener(v -> presenter.keySubPressed());
        findViewById(R.id.button_clear).setOnClickListener(v -> presenter.keyClearPressed());
        findViewById(R.id.button_dot).setOnClickListener(v -> presenter.keyDotPressed());
        findViewById(R.id.button_para1).setOnClickListener(v -> presenter.keyPara1Pressed());
        findViewById(R.id.button_para2).setOnClickListener(v -> presenter.keyPara2Pressed());
    }
    private final TextView resultText;

    @Override
    public void showResult(String result){
        resultText.setText(result);
    }

}