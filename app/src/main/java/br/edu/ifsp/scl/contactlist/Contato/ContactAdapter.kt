package br.edu.ifsp.scl.contactlist.Contato

class ContactAdapter(private val listaContatos: List<Contato>) :
    RecyclerView.Adapter<ContactAdapter.ContatoViewHolder>() {

    class ContatoViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nomeTextView: TextView = view.findViewById(R.id.nomeTextView)
        val telefoneTextView: TextView = view.findViewById(R.id.telefoneTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContatoViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_contato, parent, false)
        return ContatoViewHolder(view)
    }

    override fun onBindViewHolder(holder: ContatoViewHolder, position: Int) {
        val contato = listaContatos[position]
        holder.nomeTextView.text = contato.nome
        holder.telefoneTextView.text = contato.telefone
    }

    override fun getItemCount(): Int {
        return listaContatos.size
    }
}


