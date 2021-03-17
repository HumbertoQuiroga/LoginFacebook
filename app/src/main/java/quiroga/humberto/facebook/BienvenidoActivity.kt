package quiroga.humberto.facebook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BienvenidoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bienvenido)

        var bundle = intent.extras

        var tv_nombre = findViewById(R.id.tv_nombre) as TextView

        if(bundle != null){
            var nombre: String? = bundle.getString("nombre")
            var apellido: String? = bundle.getString("apellido")

            tv_nombre.setText("$nombre $apellido")
        }
    }
}