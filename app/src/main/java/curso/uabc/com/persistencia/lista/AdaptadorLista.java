package curso.uabc.com.persistencia.lista;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import curso.uabc.com.persistencia.R;

/**
 * Created by xhendor on 4/19/15.
 */
public class AdaptadorLista extends ArrayAdapter<ElementoLista>{

    private final ElementoLista[] objects;
    private Context context;

    public AdaptadorLista(Context context, int resource, ElementoLista[] objects) {

        super(context, resource, objects);

    this.context=context;
       this. objects=objects;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View renglon = inflater.inflate(R.layout.renglon, parent, false);
        TextView titulo = (TextView) renglon.findViewById(R.id.titulo);
        TextView subtitulo = (TextView) renglon.findViewById(R.id.subtitulo);
        TextView texto = (TextView) renglon.findViewById(R.id.texto);


        titulo.setText(objects[position].getTitulo());
        subtitulo.setText(objects[position].getSubtitulo());
        texto.setText("22/01/15");
        return renglon;
    }
}
