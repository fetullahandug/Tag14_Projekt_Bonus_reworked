////////////////////////////////////////////////////////////
// Bonusaufgabe: Message of the Day
////////////////////////////////////////////////////////////
// Wir wollen für unsere App eine Willkommensnachricht an
// den User schicken, eine sogenannte "Message of the day".
// Diese besteht aus Nutzernamen, Wetter und Stadt.
////////////////////////////////////////////////////////////


// TODO: wähle geeignete Parameter und Rückgabetyp
fun holeNutzerNamen(): String {
    println("Geben Sie Ihren Benutzernamen ein: ")
    val username = readln()
    return username
}

// TODO: wähle geeignete Parameter und Rückgabetyp
fun holeNutzerOrt(): String {
    println("Geben Sie Ihren Wohnort ein: ")
    val ort = readln()
    return ort
}


fun holeTemperatur(): Int {
    var temperaturen = listOf(23, 24, 29, 21, 25, -10)
    return temperaturen.random()
}

// TODO: wähle geeignete Parameter und Rückgabetyp
fun printMessageOfTheDay() {

    var name = holeNutzerNamen()
    var temperatur = holeTemperatur()
    var ort = holeNutzerOrt()

    var message = "Hallo $name! Es sind $temperatur Grad in $ort."
    println(message)
}

fun main() {
    printMessageOfTheDay()
}