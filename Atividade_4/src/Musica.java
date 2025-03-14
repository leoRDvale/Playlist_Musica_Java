public class Musica {
    private String titulo;
    private String artista;

    public Musica(String titulo, String artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public String toString() {
        return "Música: " + titulo + " - Artista: " + artista;
    }
}
