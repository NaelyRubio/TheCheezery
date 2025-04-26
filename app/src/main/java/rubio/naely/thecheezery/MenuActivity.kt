package rubio.naely.thecheezery

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)


        val coldButton = findViewById<AppCompatButton>(R.id.button_cold_drinks)
        val hotButton = findViewById<AppCompatButton>(R.id.button_hot_drinks)
        val sweetsButton = findViewById<AppCompatButton>(R.id.button_sweets)
        val saltiesButton = findViewById<AppCompatButton>(R.id.button_salties)

        coldButton.setOnClickListener {
            abrirCategoria("coldDrinks")
        }

        hotButton.setOnClickListener {
            abrirCategoria("hotDrinks")
        }

        sweetsButton.setOnClickListener {
            abrirCategoria("sweets")
        }

        saltiesButton.setOnClickListener {
            abrirCategoria("salties")
        }
    }

    private fun abrirCategoria(categoria: String) {
        val intent = Intent(this, ProductosActivity::class.java)
        intent.putExtra("categoria", categoria)
        startActivity(intent)
    }

}



