
fun main() {
    val gedicht : String = "Der erste Blick\n" +
            "\n" +
            "Ich hatte Dich vorher noch nie gesehen,\n" +
            "beim ersten Blick war es geschehen.\n" +
            "\n" +
            "Mit diesem Moment hat sich alles gedreht,\n" +
            "meine Sorgen waren wie weggeweht.\n" +
            "\n" +
            "Mein Herz schlug plötzlich immer schneller,\n" +
            "mein Mut sank aber in den Keller.\n" +
            "\n" +
            "Dennoch will ich verlieren keine Zeit,\n" +
            "ich bin für diesen Schritt bereit.\n" +
            "\n" +
            "Du hast nicht nur mein Lächeln erhellt,\n" +
            "sondern mein Leben auf den Kopf gestellt.\n" +
            "\n" +
            "Ich liebe Dich, das sage ich Dir,\n" +
            "mit diesen Worten jetzt und hier."

    buchstabenAnzahl(gedicht, "Lisa")
}

fun buchstabenAnzahl(gedicht: String, name: String){
    var gedichtLowercase: String = gedicht.lowercase()
    var nameCharacters = name.lowercase().toCharArray()

    for(i in nameCharacters){
        var count = gedichtLowercase.length - gedichtLowercase.replace(i.toString(), "").length
        println("$i kommt insgesamt $count mal vor!")
    }
}