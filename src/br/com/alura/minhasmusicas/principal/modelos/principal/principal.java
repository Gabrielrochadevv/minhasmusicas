package br.com.alura.minhasmusicas.principal.modelos.principal;

import br.com.alura.minhasmusicas.principal.modelos.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.principal.modelos.modelos.Musica;
import br.com.alura.minhasmusicas.principal.modelos.modelos.Podcast;


public class principal {
    public static void main(String[] args) {

        Musica minhaMusica = new Musica();

        minhaMusica.setTitulo("Forever");
        minhaMusica.setArtista("Kiss");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setApresentador("Marcus Mendes");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }


}
