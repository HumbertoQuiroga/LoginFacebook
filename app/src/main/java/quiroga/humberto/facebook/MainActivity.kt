package quiroga.humberto.facebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_registro: Button = findViewById(R.id.button_registro)
        var et_nombre: EditText = findViewById(R.id.et_nombre)
        var et_apellido: EditText = findViewById(R.id.et_apelido)

        btn_registro.setOnClickListener {
            var nombre: String = et_nombre.text.toString()
            var apellido: String = et_apellido.text.toString()

            //Toast.makeText(this, "$nombre $apellido", Toast.LENGTH_LONG).show()

            val intent: Intent = Intent(this,BienvenidoActivity::class.java)
            intent.putExtra("nombre", nombre)
            intent.putExtra("apellido", apellido)
            startActivity(intent)


        }


    }
}