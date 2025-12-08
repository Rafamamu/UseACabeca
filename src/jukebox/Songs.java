package jukebox;

import java.util.List;

public class Songs {

    public List<Song> getSongs() {

        return List.of(
                new Song("$10", "Hitchhiker", "Eletronic", 2016, 183),
                new Song("Havana", "Camila Cabello", "R&B", 2017, 324),
                new Song("Cassidy", "Grateful Dead", "Rock",1972, 123),
                new Song("50 ways", "Paul Simon", "Soft Rock",1975, 199),
                new Song("Hurt", "Nine Inch Nails", "Industrial Rock ",1995, 257),
                new Song("Silence", "Delerium", "Eletronic", 1999, 134),
                new Song("Hurt", "Jhony Cash", "Soft Rock", 2002, 392),
                new Song( "Watercolour", "Pendulum", "Eletronic", 1999, 134),
                new Song("Caramel", "Sleep Token", "New Metal", 2025, 800),
                new Song("Damocles", "Sleep Token", "New Metal", 2025, 1000));
    }
}
