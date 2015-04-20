package curso.uabc.com.persistencia;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import curso.uabc.com.persistencia.lista.AdaptadorLista;
import curso.uabc.com.persistencia.lista.ElementoLista;


public class MainActivity extends ActionBarActivity {

    private ElementoLista[] elementosElementoListas;
    private AdaptadorLista adaptadorLista;
    private ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ElementoLista elementoListaA=new ElementoLista("SharedPreferences","Fuente: AndroidYa");
        ElementoLista elementoListaB=new ElementoLista("File","Fuente: Examples Google");
        ElementoLista elementoListaC=new ElementoLista("SQLite","Fuente: AndroidYa");
        elementosElementoListas=new ElementoLista[3];
        elementosElementoListas[0]=elementoListaA;
        elementosElementoListas[1]=elementoListaB;
        elementosElementoListas[2]=elementoListaC;
        adaptadorLista=new AdaptadorLista(getApplication(),R.layout.renglon,elementosElementoListas);

        lista=(ListView)findViewById(R.id.lista);
        lista.setAdapter(adaptadorLista);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


                switch (i){

                    case 0:
                        Intent intentA=new Intent(getApplicationContext(),EjemploSharedPreferences.class);
                        startActivity(intentA);

                        break;
                    case 1:
                        Intent intentB=new Intent(getApplicationContext(),EjemploFile.class);
                        startActivity(intentB);

                        break;
                    case 2:
                        Intent intentC=new Intent(getApplicationContext(),EjemploSQLite.class);
                        startActivity(intentC);
                        break;
                }


            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
