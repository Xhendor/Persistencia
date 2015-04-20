package curso.uabc.com.persistencia.lista;

/**
 * Created by xhendor on 4/19/15.
 */
public class ElementoLista {


    public ElementoLista(String titulo,String subtitulo){
        this.titulo=titulo;
        this.subtitulo=subtitulo;
    }
    private String titulo;
    private String subtitulo;


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }
}
