//TODO : Fuege in den String die zugehoerigen escape-characters ein, um es in die richtige form zu bringen.
// für jedes '|' im String musst du einen Zeilenumbruch einfügen.
// Gib das Ergebnis in der Konsole aus um zu sehen ob die Formatierung richtig ist.

fun main(){
    var gedicht = "Ich wünsche, dass dein Glück | sich jeden Tag erneue, | dass eine gute Tat | dich jede Stund' erfreue! "
    gedicht = gedicht.replace("|", "\n")
    println(gedicht)
}