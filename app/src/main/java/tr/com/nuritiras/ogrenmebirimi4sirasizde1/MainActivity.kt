package tr.com.nuritiras.ogrenmebirimi4sirasizde1

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Switch
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun onClickOnayla(view: View) {
        val editTextYas = findViewById<EditText>(R.id.editTextNumberYas)
        val yas = editTextYas.text.toString().toInt()
        val switchKurs=findViewById<Switch>(R.id.switchKurs).isChecked
        if (switchKurs && yas>=18) Toast.makeText(this,"Ehliyet Alabilirsiniz",Toast.LENGTH_LONG).show()
        else Toast.makeText(this,"Ehliyet Alamazsınız",Toast.LENGTH_LONG).show()
    }
}