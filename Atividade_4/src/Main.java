import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //Crie um programa que simule um gerenciador de playlist de músicas utilizando listas encadeadas.
        // O programa deve permitir que o usuário adicione, remova, busque e liste as músicas da playlist.

        Playlist playlist = new Playlist();


        while (true) {
            String menu = JOptionPane.showInputDialog(" ----- Crie Sua Playslist ----- \n***** Selecione uma opção: ***** \n1 - Adicionar Música\n2 - Remover Música\n3 - Buscar Música\n4 - Listar Músicas\n5 - Sair ");

            int opcao = Integer.parseInt(menu);

            switch (opcao) {
                case 1:
                    String titulo = JOptionPane.showInputDialog("Digite o nome da música:");
                    String artista = JOptionPane.showInputDialog("Digite o nome do Cantor(a) ou Banda: ");
                    Musica musica = new Musica(titulo, artista);
                    playlist.adicionarMusica(musica);
                    break;

                case 2:
                    String tituloRemover = JOptionPane.showInputDialog("Qual música deseja remover?");
                    playlist.removerMusica(tituloRemover);
                    break;

                case 3:
                    String tituloBuscar = JOptionPane.showInputDialog("Qual música deseja buscar ?");
                    playlist.buscarMusica(tituloBuscar);
                    break;

                case 4:
                    playlist.listarMusicas();
                    break;

                case 5:
                    int confirm = JOptionPane.showConfirmDialog(null, "Deseja encerrar o programa?");
                    if (confirm == JOptionPane.YES_OPTION){
                        JOptionPane.showMessageDialog(null, "Encerrando...");
                        return;
                    }
                    break;

                default:
                    JOptionPane.showInputDialog("Opção Inválida! Tente Novamente.");

            }
        }
    }
}