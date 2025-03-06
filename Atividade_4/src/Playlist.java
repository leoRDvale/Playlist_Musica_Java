import javax.swing.*;

public class Playlist {
    private NoLista primeiro;

    public Playlist() {
        this.primeiro = null;
    }

    // Adicionar Música

    public void adicionarMusica(Musica musica) {
        NoLista novoNo = new NoLista(musica);
        if (primeiro == null) {
            primeiro = novoNo;
        } else {
            NoLista aux = primeiro;
            while (aux.proximo != null) {
                aux = aux.proximo;
            }
            aux.proximo = novoNo;
        }
        JOptionPane.showMessageDialog(null, "Música adicionada a sua Playlist!");
    }

    // Remover Música

    public void removerMusica(String titulo) {
        if (primeiro == null) {
            JOptionPane.showMessageDialog(null, "Sua Playlist está vazia!");
            return;
        }

        if (primeiro.musica.getTitulo().equals(titulo)) {
            primeiro = primeiro.proximo;
            JOptionPane.showMessageDialog(null, "Música removida!");
            return;
        }

        NoLista aux = primeiro;
        while (aux.proximo != null && !aux.proximo.musica.getTitulo().equals(titulo)) {
            aux = aux.proximo;
        }

        if (aux.proximo == null) {
            JOptionPane.showMessageDialog(null, "Música não encontrada!");
        } else {
            aux.proximo = aux.proximo.proximo;
            JOptionPane.showMessageDialog(null, "Música Removida!");
        }
    }

    // Buscar por música

    public void buscarMusica(String titulo) {
        NoLista aux = primeiro;
        while (aux != null) {
            if (aux.musica.getTitulo().equals(titulo)) {
                JOptionPane.showMessageDialog(null, "Resultado: " + aux.musica);
                return;
            }
            aux = aux.proximo;
        }
        JOptionPane.showMessageDialog(null, "Resultado: Nenhuma música encontrada!");
    }

    // Mostrar Lista

    public void listarMusicas() {
        if (primeiro == null) {
            JOptionPane.showMessageDialog(null, "Sua Playslist está vazia!");
            return;
        }

        NoLista aux = primeiro;
        while (aux != null) {
            JOptionPane.showMessageDialog(null, aux.musica);
            aux = aux.proximo;
        }
    }
}

