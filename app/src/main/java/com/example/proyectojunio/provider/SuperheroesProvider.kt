package com.example.proyectojunio.provider

import com.example.proyectojunio.R
import com.example.proyectojunio.models.Superheroes

object SuperheroesProvider {

    val misSuperheroes = arrayListOf<Superheroes>(
        Superheroes("Daredevil", "Matt Murdock", R.drawable.daredevil, "Matt Murdock creció en el peligroso barrio de Hell's Kitchen." +
                "Cuando al intentar salvar a un anciano de ser atropellado, unos tanques con productos qúimicos se le vuelcan en los ojos, dejando completamente ciego pero agudizando sus demás sentidos." +
                "Cuando su padre es asesinado al negarse a perder en un combate de boxeo, Matt decide emprender un camino contra la injusticia y la corrupción, convirtiéndose en el diablo guardián de Hell's Kitchen: Daredevil",
                "Daredevil #1(abril de 1964)"),

        Superheroes("Superman", "Clark Kent, KAL-EL", R.drawable.superman, "Enviado desde un planeta al borde de la destrucción y criado por una familia de rancheros," +
                "Clark Kent se convierte en el mayor héroe de todos los tiempos", "Action Comics #1(abril de 1938"),

        Superheroes("Batman", "Bruce Wayne", R.drawable.batman, "Al prsenciar la muerte de sus padres a manos de un delincuente de poca monta," +
                "el joven Bruce Wayne emprenderá un camino de venganza contra aquellos criminales que corrompen su ciudad natal: Gotham",
            "Detective Comics #27(abril de 1939)"),

        Superheroes("Spider-man", "Peter Parker", R.drawable.spiderman,
            "Tras ser mordido por una araña genéticamente modificada, el joven Peter Parker adquiere poderes extraordinarios," +
                    "como pegarse a las paredes, fuerza y reflejos sobrehumanos y un gran sentido del humor. Sin embargo, la muerte de su tío de Ben" +
                    "a manos de un criminal al que él dejó escapar le dará una importante lección:" +
                    "Un gran poder conlleva una gran responsabilidad", "Amazing Fantasy #15(agosto de 1962"),

        Superheroes("Hulk", "Bruce Banner", R.drawable.hulk,
            "Cuando el científico Bruce Banner, tratando de salvar a un joven llamado Rick Jones," +
                    "sufre el impacto de una explosión de rayos gamma, su vida cambia para siempre." +
                    "Cada vez que se enfafa os ufre una situacíon de gran estrés, se transforma en un enorme e incontrolable" +
                    "monstruo verde con fuerza sobrehumana y con una sed de rabia insaciable",
            "The Incredible Hulk #1(mayo de 1962)"),

        Superheroes("Iron Man", "Tony Stark", R.drawable.iron_man,
            "Cuando el fabricante de armas Tony Stark es emboscado y secuestrado en Oriente Medio" +
                    "por un grupo de terroristas que buscan usar sus propias armas para sus planes de destrucción," +
                    "un hombre llamado Jinsen le hará ver que puede ser mejor." +
                    "Tras escapar creando una armadura, Tony dedicará el resto de su vida a crear un sinfín de armaduras" +
                    "que le ayudarán a hacer del mundo un lugar mejor",
            "Tales of Suspense #39(marzo de 1963)"),

        Superheroes("Lobezno", "James Howlett, Logan", R.drawable.lobezno,
            "Nacido como un mutante con un gran olfato, factor de curación y garras de hueso replegables," +
                    "el hombre conocido como Logan es capturado y usado como sujeto de pruebas en el proyecto Arma X" +
                    "donde se le implantó el metal conocido como adamantium. Tras escapar vagó perdido durante un tiempo" +
                    "hasta que conoció al profesor Charles Xavier, un poderoso telépata que era líder de los X-Men," +
                    "un grupo mutante que lucha por la paz entre mutantes y humanos. Desde entonces, Logan se unió a ellos" +
                    "y se convirtió en el superhéroe conocido como Lobezno",
        "The Incredible Hulk #180(octubre de 1974)"),

        Superheroes("Caballero Luna", "Marc Spector, Steven Grant, Jake Lockley", R.drawable.moon_knight,
            "Marc Spector es un mercenario que trabaja para el mejor postor." +
                    "Al rebelarse contra Bushman, su antiguo jefe y socio, Marc es asesinado." +
                    "Sin embargo, es resucitado y convertido en el avatar de la venganza del dios egipcio Kohnsu." +
                    "Desde ese momento, Marc usará todos sus concimientos de la guerra y la protección de Konshu" +
                    "para luchar contra el crimen. Sin embargo, también debe lidiar con su trastorno de identidad disociativo," +
                    "el cuál le hace adoptar varias personalidades como el millonario Steven Grant o el taxista Jake Lockley.",
                    "Werewolf by Night #32(agosto de 1975)")

    )

}