package br.edu.ifsp.scl.contactlist

import android.os.Bundle
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.edu.ifsp.scl.contactlist.Contato.Contato
import br.edu.ifsp.scl.contactlist.ui.theme.ContactListTheme

 class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var contactAdapter: ContatoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

                val listaContatos = listOf(
            Contato("Ridalvo", "(84) 99999-9999"),
            Contato("Maria", "(21) 98888-8888"),
            Contato("Carlos", "(31) 97777-7777")
        )

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        contactAdapter = ContatoAdapter(listaContatos)
        this.contactAdapter.also { contatoAdapter -> recyclerView.adapter = contatoAdapter }
    }

     private fun LinearLayoutManager(mainActivity: MainActivity): LinearLayoutManager {

     }

     private fun findViewById(recyclerView: Int): RecyclerView {
         TODO("Not yet implemented")
     }

     private fun setContentView(activityMain: Int) {
         TODO("Not yet implemented")
     }
 }

class ContatoAdapter(listaContatos: List<Contato>) {

}

open class AppCompatActivity {
    fun onCreate(savedInstanceState: Bundle?) {
        TODO("Not yet implemented")
    }

}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ContactListTheme {
        Greeting("Android")
    }
}