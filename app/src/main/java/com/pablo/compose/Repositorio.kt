package com.pablo.compose



object Repositorio {
    private val articleList = listOf(
        Article(
            id = 1,
            title = "Nuevo avance científico podría revolucionar la medicina",
            summary = "Un equipo de investigadores ha anunciado un importante avance que podría cambiar el panorama de la medicina moderna.",
            content = "Tras años de investigación, científicos han desarrollado una nueva tecnología que promete revolucionar el tratamiento de enfermedades crónicas. Este avance, basado en la nanotecnología, permite una administración más precisa de medicamentos, reduciendo efectos secundarios y aumentando la eficacia del tratamiento. Expertos creen que este descubrimiento podría tener un impacto significativo en el tratamiento del cáncer, enfermedades cardíacas y otras condiciones médicas.",
            imageUrl = "1",
            publishDate = "2024-02-20"
        ),
        Article(
            id = 2,
            title = "Desarrollan nueva tecnología para combatir el cambio climático",
            summary = "Científicos presentan un innovador enfoque para abordar la crisis climática que enfrenta el planeta.",
            content = "Ante la creciente preocupación por el cambio climático, investigadores han creado una tecnología revolucionaria que podría ayudar a mitigar sus efectos. Se trata de un sistema de captura y almacenamiento de carbono altamente eficiente, capaz de eliminar grandes cantidades de dióxido de carbono de la atmósfera. Esta innovación ofrece nuevas esperanzas en la lucha contra el calentamiento global y podría ser clave para alcanzar los objetivos establecidos en el Acuerdo de París.",
            imageUrl = "2",
            publishDate = "2024-02-21"
        ),
        Article(
            id = 3,
            title = "Descubren nueva especie de vida marina en las profundidades del océano",
            summary = "Científicos han hecho un hallazgo sorprendente que podría cambiar nuestra comprensión de los ecosistemas marinos.",
            content = "Una expedición científica ha revelado la existencia de una especie completamente nueva de criaturas marinas en las profundidades del océano. Estas fascinantes criaturas, que han sido denominadas 'profundisquid', poseen características únicas que desafían las clasificaciones biológicas existentes. Los investigadores creen que este descubrimiento podría tener importantes implicaciones para la conservación marina y el estudio de la biodiversidad.",
            imageUrl = "3",
            publishDate = "2024-02-20"
        ),
        Article(
            id = 4,
            title = "Empresa líder en tecnología anuncia lanzamiento de nuevo dispositivo revolucionario",
            summary = "La compañía ha presentado su último producto, prometiendo cambiar la forma en que interactuamos con la tecnología.",
            content = "La empresa tecnológica más grande del mundo ha sorprendido al público al anunciar el lanzamiento de un dispositivo innovador que promete redefinir la experiencia digital. Este nuevo dispositivo combina características avanzadas de inteligencia artificial con un diseño elegante y funcional. Los expertos predicen que este producto podría marcar el comienzo de una nueva era en la informática personal y la conectividad.",
            imageUrl = "4",
            publishDate = "2024-02-21"
        ),
        Article(
            id = 5,
            title = "Nueva investigación sugiere posible cura para enfermedad neurodegenerativa",
            summary = "Científicos han hecho un avance significativo en la búsqueda de tratamientos para una enfermedad devastadora.",
            content = "Un equipo de investigadores ha anunciado un descubrimiento prometedor que podría llevar a una cura para una enfermedad neurodegenerativa que afecta a millones de personas en todo el mundo. Los resultados de un estudio reciente han revelado un mecanismo clave involucrado en la progresión de la enfermedad, lo que podría abrir nuevas vías terapéuticas. Si bien aún se necesita más investigación, este hallazgo representa un rayo de esperanza para aquellos que luchan contra esta enfermedad debilitante.",
            imageUrl = "5",
            publishDate = "2024-02-20"
        ),
        Article(
            id = 6,
            title = "Nueva ley de protección ambiental entra en vigor",
            summary = "El gobierno ha aprobado una legislación histórica para abordar la crisis ambiental.",
            content = "Después de meses de debate y negociaciones, el gobierno ha promulgado una nueva ley de protección ambiental diseñada para abordar las crecientes preocupaciones sobre la crisis climática y la pérdida de biodiversidad. La ley establece objetivos ambiciosos para reducir las emisiones de carbono, proteger hábitats naturales y promover prácticas sostenibles en todos los sectores de la economía. Los defensores del medio ambiente han elogiado la legislación como un paso crucial hacia un futuro más verde y sostenible.",
            imageUrl = "6",
            publishDate = "2024-02-21"
        ),
        Article(
            id = 7,
            title = "Descubrimiento arqueológico revela civilización antigua perdida",
            summary = "Arqueólogos han hecho un hallazgo asombroso que podría reescribir la historia antigua.",
            content = "Una expedición arqueológica en una región remota ha descubierto evidencia de una civilización antigua previamente desconocida. Los restos de antiguas estructuras, artefactos y jeroglíficos sugieren que esta civilización prosperó hace miles de años, desafiando las narrativas históricas establecidas. Este descubrimiento arroja nueva luz sobre el pasado de la humanidad y plantea fascinantes preguntas sobre el desarrollo cultural y tecnológico en tiempos antiguos.",
            imageUrl = "7",
            publishDate = "2024-02-20"
        ),
        Article(
            id = 8,
            title = "Innovadora vacuna contra enfermedades virales muestra resultados prometedores",
            summary = "Científicos están entusiasmados con los primeros datos de un nuevo enfoque para combatir enfermedades infecciosas.",
            content = "Un equipo de investigadores ha informado resultados alentadores en los ensayos clínicos de una vacuna revolucionaria diseñada para combatir una variedad de enfermedades virales. Esta vacuna utiliza una plataforma innovadora que activa una respuesta inmune más amplia y duradera en comparación con las vacunas tradicionales. Si los resultados continúan siendo positivos, esta vacuna podría cambiar radicalmente la forma en que abordamos las enfermedades infecciosas en el futuro.",
            imageUrl = "8",
            publishDate = "2024-02-21"
        ),
        Article(
            id = 9,
            title = "Nuevo estudio revela beneficios sorprendentes de la dieta mediterránea",
            summary = "Investigadores destacan los impactos positivos de una alimentación basada en la dieta mediterránea en la salud.",
            content = "Un estudio reciente ha arrojado nueva luz sobre los beneficios para la salud de seguir una dieta mediterránea. Los investigadores encontraron que este patrón de alimentación, rico en frutas, verduras, granos enteros y aceite de oliva, está asociado con una reducción significativa del riesgo de enfermedades cardíacas, diabetes tipo 2 y ciertos tipos de cáncer. Estos hallazgos refuerzan la importancia de adoptar hábitos alimenticios saludables para promover el bienestar a largo plazo.",
            imageUrl = "9",
            publishDate = "2024-02-20"
        ),
        Article(
            id = 10,
            title = "Lanzamiento exitoso de la primera misión tripulada a Marte",
            summary = "La humanidad alcanza un hito histórico con el envío de astronautas al planeta rojo.",
            content = "La agencia espacial internacional ha anunciado con éxito la llegada de la primera misión tripulada a Marte. Después de años de preparación y desarrollo de tecnología avanzada, un equipo de astronautas ha aterrizado de manera segura en la superficie marciana. Esta hazaña histórica marca el comienzo de una nueva era en la exploración espacial y abre nuevas posibilidades para la investigación científica en el planeta rojo.",
            imageUrl = "10",
            publishDate = "2024-02-21"
        ),
        Article(
            id = 11,
            title = "Estudio encuentra vínculos entre el sueño y la salud mental",
            summary = "Investigadores descubren conexiones intrigantes entre la calidad del sueño y el bienestar mental.",
            content = "Una investigación reciente ha identificado vínculos significativos entre la calidad del sueño y la salud mental. Los datos sugieren que los problemas crónicos de sueño, como el insomnio y la apnea del sueño, pueden aumentar el riesgo de trastornos mentales como la depresión y la ansiedad. Estos hallazgos subrayan la importancia de abordar los problemas de sueño como parte integral de la atención médica para mejorar el bienestar mental de las personas.",
            imageUrl = "11",
            publishDate = "2024-02-20"
        ),
        Article(
            id = 12,
            title = "Desarrollo de nueva tecnología promete revolucionar la industria energética",
            summary = "Ingenieros presentan una solución innovadora para abordar los desafíos energéticos globales.",
            content = "Un equipo de ingenieros ha presentado una tecnología revolucionaria que podría transformar la forma en que generamos y utilizamos la energía. Esta nueva solución, basada en energía renovable y almacenamiento avanzado, ofrece una alternativa sostenible y rentable a los combustibles fósiles. Los expertos predicen que esta tecnología podría desempeñar un papel crucial en la transición hacia un sistema energético más limpio y resiliente en todo el mundo.",
            imageUrl = "12",
            publishDate = "2024-02-21"
        )
    )

    fun getArticles(): List<Article> {
        return articleList
    }

    fun getArticleById(id: Int): Article {
        return articleList.firstOrNull { it.id == id }
            ?: throw NoSuchElementException("Article with ID $id not found")
    }
}
