package com.example.proyectojunio.provider

import com.example.proyectojunio.R
import com.example.proyectojunio.models.Superheroes

object SuperheroesProvider {

    val misSuperheroes = arrayListOf<Superheroes>(
        Superheroes("Daredevil", "Matt Murdock", R.drawable.daredevil,
            "Matt Murdock creció en el peligroso barrio de Hell's Kitchen." +
                "Cuando al intentar salvar a un anciano de ser atropellado," +
                " unos tanques con productos qúimicos se le vuelcan en los ojos, dejandolo" +
                " completamente ciego pero agudizando sus demás sentidos." +
                "Cuando su padre es asesinado al negarse a perder en un combate de boxeo," +
                " Matt decide emprender un camino contra la injusticia y la corrupción," +
                " convirtiéndose en el diablo guardián de Hell's Kitchen: Daredevil.",
                "Daredevil #1(abril de 1964)"),

        Superheroes("Superman", "Clark Kent, KAL-EL", R.drawable.superman, "Enviado desde un planeta al borde de la destrucción y criado por una familia de rancheros," +
                "Clark Kent se convierte en el mayor héroe de todos los tiempos: Superman.", "Action Comics #1(abril de 1938"),

        Superheroes("Batman", "Bruce Wayne", R.drawable.batman, "Al prsenciar la muerte de sus padres a manos de un delincuente de poca monta," +
                "el joven Bruce Wayne emprenderá un camino de venganza contra aquellos criminales que corrompen su ciudad natal: Gotham.",
            "Detective Comics #27(abril de 1939)"),

        Superheroes("Spider-man", "Peter Parker", R.drawable.spiderman,
            "Tras ser mordido por una araña genéticamente modificada, el joven Peter Parker adquiere poderes extraordinarios," +
                    "como pegarse a las paredes, fuerza y reflejos sobrehumanos y un gran sentido del humor. Sin embargo, la muerte de su tío de Ben" +
                    "a manos de un criminal al que él dejó escapar le dará una importante lección:" +
                    "Un gran poder conlleva una gran responsabilidad.", "Amazing Fantasy #15(agosto de 1962"),

        Superheroes("Hulk", "Bruce Banner", R.drawable.hulk,
            "Cuando el científico Bruce Banner, tratando de salvar a un joven llamado Rick Jones," +
                    "sufre el impacto de una explosión de rayos gamma, su vida cambia para siempre." +
                    "Cada vez que se enfafa os ufre una situacíon de gran estrés, se transforma en un enorme e incontrolable" +
                    "monstruo verde con fuerza sobrehumana y una rabia incontrolable.",
            "The Incredible Hulk #1(mayo de 1962)"),

        Superheroes("Iron Man", "Tony Stark", R.drawable.iron_man,
            "Cuando el fabricante de armas Tony Stark es emboscado y secuestrado en Oriente Medio" +
                    "por un grupo de terroristas que buscan usar sus propias armas para sus planes de destrucción," +
                    "un hombre llamado Jinsen le hará ver que puede ser mejor." +
                    "Tras escapar creando una armadura, Tony dedicará el resto de su vida a crear un sinfín de armaduras" +
                    "que le ayudarán a hacer del mundo un lugar mejor.",
            "Tales of Suspense #39(marzo de 1963)"),

        Superheroes("Lobezno", "James Howlett, Logan", R.drawable.lobezno,
            "Nacido como un mutante con un gran olfato, factor de curación y garras de hueso replegables," +
                    "a Logan se le implantó el metal concoido como adamantium, volviéndolo completamente indestructible." +
                    "Tras vagar durante un tiempo, terminaría uniéndose a los X-Men," +
                    "un grupo de mutantes que lucha por la igualdad entre humanos y mutantes.",
        "The Incredible Hulk #180(octubre de 1974)"),

        Superheroes("Caballero Luna", "Marc Spector, Steven Grant, Jake Lockley", R.drawable.moon_knight,
            "Marc Spector, un conocido mercenario, es asesinado por su antiguo socio, Bushman." +
                    "Sin embargo, es revivido por el antiguo dios egipcio Khonsu," +
                    "convirtiéndolo en su avatar de la luna, su puño de la venganza." +
                    "O al menos eso cree, ya que su trastorno de personalidad múltiple le hace cuestionarse" +
                    "si realmente fue revivido o todo fue una fantasía.",
                    "Werewolf by Night #32(agosto de 1975)"),

        Superheroes("Wonder Woman", "Princesa Diana", R.drawable.wonder_woman,
            "Themyscira es una isla habitada por mujeres bendecidas por los dioses." +
                    "Estas mujeres son conocidas como las amazonas." +
                    "Un día, Hipólita, reina de las amazonas, esculpió una muñeca de barro para pedirle a los dioses" +
                    "que le dieran vida. Ellos aceptaron y conviertieron a la muñeca en una niña llamada Diana," +
                    "quien crecería como una amazona y guardiana de la paz en el mundo de los hombres.",
                    "Wonder Woman Vol 1 #1(agosto de 1942)"),

        Superheroes("Aquaman", "Arthur Curry", R.drawable.aquaman,
            "Mitad humano y mitad atlante, Aquaman es el rey de Atlantis y protector de los siete mares." +
                    "Posee habilidades como superfuerza, supervelocidad, piel impenetrable y la capacidad de comunicarse con la flora marina." +
                    "Es uno de los miembros más venerados de la Liga de la Justicia.",
            "More Fun Comics #73(noviembre de 1941)"),

        Superheroes("Capitán América", "Steve Rogers", R.drawable.capitan_america,
            "Alistándose en el ejército a pesar de su débil condición física," +
                    "Steve Rogers recibe el suero del supersoldado, el cuál le dará fuerza y agilidad sobrehumana." +
                    "Combatiendo a los nazis en la Segunda Guerra Mundial, en una de sus misiones " +
                    "Steve resultaría caído en combate y congelado en estado criogénico." +
                    "Al despertar 70 años después, descubre que el mundo ha cambiado.",
            "Captain America Comics #1(marzo de 1941)"),

        Superheroes("Thor", "Odinson, Donald Blake", R.drawable.thor,
            "Thor, hijo de Odín, " +
                    "futuro rey del reino de Aasgard, " +
                    "protector de los nueve reinos." +
                    "Miembro honorable de los Vengadores." +
                    "El Dios del Trueno y su martillo Mjolnir son el temor de sus enemigos.",
            "Journey Into Mystery #85(agosto de 1962)"),

        Superheroes("Los Cuatro Fantásticos", "Reed Richards, Sue Storm, Johny Storm, Ben Grim",
            R.drawable.cuatro_fantasticos, "La primera gran familia de Marvel." +
                    "Tras ser alcanzados por una tormenta cósmica, " +
                    "Reed Richards adquiere el poder de estirar cualquier parte de su cuerpo, " +
                    "Sue Storm obtiene la capacidad de hacerse invisible," +
                    "Johny Storm puede prender su cuerpo de fuego " +
                    "y Ben Grim se transforma en una grotesca criatura rocosa. " +
                    "Juntos son los Cuatro Fantásticos", "The Fantastic Four #1(noviembre de 1961)")

    )

}