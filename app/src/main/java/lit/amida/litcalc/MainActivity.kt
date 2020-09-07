package lit.amida.litcalc

import android.content.res.ColorStateList
import android.graphics.Color
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

        disableOperator()

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
            tapOperatorButton(PLUS)
        }

        buttonMinus.setOnClickListener {
            tapOperatorButton(MINUS)
        }

        buttonMul.setOnClickListener {
            tapOperatorButton(MUL)
        }

        button0.setOnClickListener {
            tapNumberButton(0)
        }

        button1.setOnClickListener {
            tapNumberButton(1)
        }

        button2.setOnClickListener {
            tapNumberButton(2)
        }

        button3.setOnClickListener {
            tapNumberButton(3)
        }

        button4.setOnClickListener {
            tapNumberButton(4)
        }

        button5.setOnClickListener {
            tapNumberButton(5)
        }

        button6.setOnClickListener {
            tapNumberButton(6)
        }

        button7.setOnClickListener {
            tapNumberButton(7)
        }

        button8.setOnClickListener {
            tapNumberButton(8)
        }

        button9.setOnClickListener {
            tapNumberButton(9)
        }

    }

    fun tapOperatorButton(type:Int){
        disableOperator()
        when(type){
            PLUS ->{
                buttonPlus.isEnabled = true
                buttonPlus.backgroundTintList = ColorStateList.valueOf(Color.parseColor("#F00000"))
                currentOperator = PLUS
            }
            MINUS ->{
                buttonMinus.isEnabled = true
                buttonMinus.backgroundTintList = ColorStateList.valueOf(Color.parseColor("#F00000"))
                currentOperator = MINUS
            }
            MUL ->{
                buttonMul.isEnabled = true
                buttonMul.backgroundTintList = ColorStateList.valueOf(Color.parseColor("#F00000"))
                currentOperator = MUL
            }
        }

        textView.text = operand2.toString()
    }

    fun tapNumberButton(number:Int){
        if(currentOperator == 0) {
            operand1 = operand1 * 10 + number
            textView.text = operand1.toString()
            enableOperator()
            buttonEqual.isEnabled = false
            buttonEqual.backgroundTintList = ColorStateList.valueOf(Color.parseColor("#A0A0A0"))
        }
        else {
            operand2 = operand2 * 10 + number
            textView.text = operand2.toString()
            disableOperator()
            buttonEqual.isEnabled = true
            buttonEqual.backgroundTintList = ColorStateList.valueOf(Color.parseColor("#F0F000"))
        }
    }

    fun disableOperator(){
        buttonPlus.backgroundTintList = ColorStateList.valueOf(Color.parseColor("#A0A0A0"))
        buttonPlus.isEnabled = false
        buttonMinus.backgroundTintList = ColorStateList.valueOf(Color.parseColor("#A0A0A0"))
        buttonMinus.isEnabled = false
        buttonMul.backgroundTintList = ColorStateList.valueOf(Color.parseColor("#A0A0A0"))
        buttonMul.isEnabled = false
        buttonEqual.backgroundTintList = ColorStateList.valueOf(Color.parseColor("#A0A0A0"))
        buttonEqual.isEnabled = false
    }

    fun enableOperator(){
        buttonPlus.backgroundTintList = ColorStateList.valueOf(Color.parseColor("#F0F000"))
        buttonPlus.isEnabled = true
        buttonMinus.backgroundTintList = ColorStateList.valueOf(Color.parseColor("#F0F000"))
        buttonMinus.isEnabled = true
        buttonMul.backgroundTintList = ColorStateList.valueOf(Color.parseColor("#F0F000"))
        buttonMul.isEnabled = true
        buttonEqual.backgroundTintList = ColorStateList.valueOf(Color.parseColor("#F0F000"))
        buttonEqual.isEnabled = true
    }
}