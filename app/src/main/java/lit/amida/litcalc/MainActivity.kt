package lit.amida.litcalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var sum = 0
    var operand1 = 0
    var operand2 = 0
    var currentOperator = 0
    val PLUS = 1
    val MINUS = 2
    val MUL = 3

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonClear.setOnClickListener {
            disableOperator()
            operand1 = 0
            operand2 = 0
            currentOperator = 0
            sum = 0
            textView.text = sum.toString()
        }

        buttonEqual.setOnClickListener {
            when(currentOperator){
                PLUS -> sum = operand1 + operand2
                MINUS -> sum = operand1 - operand2
                MUL -> sum = operand1 * operand2
            }

            disableOperator()
            textView.text = sum.toString()
            operand1 = 0
            operand2 = 0
            currentOperator = 0
            sum = 0
        }

        buttonPlus.setOnClickListener {
            disableOperator()
            buttonPlus.isClickable = true
            buttonPlus.setBackgroundResource(R.drawable.round_red)
            currentOperator = PLUS
            textView.text = operand2.toString()
        }

        buttonMinus.setOnClickListener {
            disableOperator()
            buttonMinus.isClickable = true
            buttonMinus.setBackgroundResource(R.drawable.round_red)
            currentOperator = MINUS
            textView.text = operand2.toString()
        }

        buttonMul.setOnClickListener {
            disableOperator()
            buttonMul.isClickable = true
            buttonMul.setBackgroundResource(R.drawable.round_red)
            currentOperator = MUL
            textView.text = operand2.toString()
        }

        button0.setOnClickListener {
            if(currentOperator == 0) {
                operand1 = operand1 * 10 + 0
                textView.text = operand1.toString()
                enableOperator()
                buttonEqual.isClickable = false
                buttonEqual.setBackgroundResource(R.drawable.round_gray)
            }
            else {
                operand2 = operand2 * 10 + 0
                textView.text = operand2.toString()
                disableOperator()
                buttonEqual.isClickable = true
                buttonEqual.setBackgroundResource(R.drawable.round_yellow)
            }
        }

        button1.setOnClickListener {
            if(currentOperator == 0) {
                operand1 = operand1 * 10 + 1
                textView.text = operand1.toString()
                enableOperator()
                buttonEqual.isClickable = false
                buttonEqual.setBackgroundResource(R.drawable.round_gray)
            }
            else {
                operand2 = operand2 * 10 + 1
                textView.text = operand2.toString()
                disableOperator()
                buttonEqual.isClickable = true
                buttonEqual.setBackgroundResource(R.drawable.round_yellow)
            }
        }

        button2.setOnClickListener {
            if(currentOperator == 0) {
                operand1 = operand1 * 10 + 2
                textView.text = operand1.toString()
                enableOperator()
                buttonEqual.isClickable = false
                buttonEqual.setBackgroundResource(R.drawable.round_gray)
            }
            else {
                operand2 = operand2 * 10 + 2
                textView.text = operand2.toString()
                disableOperator()
                buttonEqual.isClickable = true
                buttonEqual.setBackgroundResource(R.drawable.round_yellow)
            }
        }

        button3.setOnClickListener {
            if(currentOperator == 0) {
                operand1 = operand1 * 10 + 3
                textView.text = operand1.toString()
                enableOperator()
                buttonEqual.isClickable = false
                buttonEqual.setBackgroundResource(R.drawable.round_gray)
            }
            else {
                operand2 = operand2 * 10 + 3
                textView.text = operand2.toString()
                disableOperator()
                buttonEqual.isClickable = true
                buttonEqual.setBackgroundResource(R.drawable.round_yellow)
            }
        }

        button4.setOnClickListener {
            if(currentOperator == 0) {
                operand1 = operand1 * 10 + 4
                textView.text = operand1.toString()
                enableOperator()
                buttonEqual.isClickable = false
                buttonEqual.setBackgroundResource(R.drawable.round_gray)
            }
            else {
                operand2 = operand2 * 10 + 4
                textView.text = operand2.toString()
                disableOperator()
                buttonEqual.isClickable = true
                buttonEqual.setBackgroundResource(R.drawable.round_yellow)
            }
        }

        button5.setOnClickListener {
            if(currentOperator == 0) {
                operand1 = operand1 * 10 + 5
                textView.text = operand1.toString()
                enableOperator()
                buttonEqual.isClickable = false
                buttonEqual.setBackgroundResource(R.drawable.round_gray)
            }
            else {
                operand2 = operand2 * 10 + 5
                textView.text = operand2.toString()
                disableOperator()
                buttonEqual.isClickable = true
                buttonEqual.setBackgroundResource(R.drawable.round_yellow)
            }
        }

        button6.setOnClickListener {
            if(currentOperator == 0) {
                operand1 = operand1 * 10 + 6
                textView.text = operand1.toString()
                enableOperator()
                buttonEqual.isClickable = false
                buttonEqual.setBackgroundResource(R.drawable.round_gray)
            }
            else {
                operand2 = operand2 * 10 + 6
                textView.text = operand2.toString()
                disableOperator()
                buttonEqual.isClickable = true
                buttonEqual.setBackgroundResource(R.drawable.round_yellow)
            }
        }

        button7.setOnClickListener {
            if(currentOperator == 0) {
                operand1 = operand1 * 10 + 7
                textView.text = operand1.toString()
                enableOperator()
                buttonEqual.isClickable = false
                buttonEqual.setBackgroundResource(R.drawable.round_gray)
            }
            else {
                operand2 = operand2 * 10 + 7
                textView.text = operand2.toString()
                disableOperator()
                buttonEqual.isClickable = true
                buttonEqual.setBackgroundResource(R.drawable.round_yellow)
            }
        }

        button8.setOnClickListener {
            if(currentOperator == 0) {
                operand1 = operand1 * 10 + 8
                textView.text = operand1.toString()
                enableOperator()
                buttonEqual.isClickable = false
                buttonEqual.setBackgroundResource(R.drawable.round_gray)
            }
            else {
                operand2 = operand2 * 10 + 8
                textView.text = operand2.toString()
                disableOperator()
                buttonEqual.isClickable = true
                buttonEqual.setBackgroundResource(R.drawable.round_yellow)
            }
        }

        button9.setOnClickListener {
            if(currentOperator == 0) {
                operand1 = operand1 * 10 + 9
                textView.text = operand1.toString()
                enableOperator()
                buttonEqual.isClickable = false
                buttonEqual.setBackgroundResource(R.drawable.round_gray)
            }
            else {
                operand2 = operand2 * 10 + 9
                textView.text = operand2.toString()
                disableOperator()
                buttonEqual.isClickable = true
                buttonEqual.setBackgroundResource(R.drawable.round_yellow)
            }
        }

    }

    fun disableOperator(){
        buttonPlus.setBackgroundResource(R.drawable.round_gray)
        buttonPlus.isClickable = false
        buttonMinus.setBackgroundResource(R.drawable.round_gray)
        buttonMinus.isClickable = false
        buttonMul.setBackgroundResource(R.drawable.round_gray)
        buttonMul.isClickable = false
        buttonEqual.setBackgroundResource(R.drawable.round_gray)
        buttonEqual.isClickable = false
    }

    fun enableOperator(){
        buttonPlus.setBackgroundResource(R.drawable.round_yellow)
        buttonPlus.isClickable = true
        buttonMinus.setBackgroundResource(R.drawable.round_yellow)
        buttonMinus.isClickable = true
        buttonMul.setBackgroundResource(R.drawable.round_yellow)
        buttonMul.isClickable = true
        buttonEqual.setBackgroundResource(R.drawable.round_yellow)
        buttonEqual.isClickable = true
    }
}