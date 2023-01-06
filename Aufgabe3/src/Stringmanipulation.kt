
fun main() {
    val zungenbrecher : String = "Aslronaulen kauten und kauten während sie blaugrüne Mondsteine klaubten."
    korrekturEinfach(zungenbrecher)
    korrekturErstesWort(zungenbrecher)
}

fun korrekturEinfach(zungenbrecher: String){
    var ergebnis = zungenbrecher.replaceRange(0.."Aslronaulen".length-1, zungenbrecher.slice(0.."Aslronaulen".length-1).replace("l", "t"))
    println(ergebnis)
}

fun korrekturErstesWort(text: String){
    var splittedText = text.split(" ")
    var neuerText: String = ""

    for(i in (0..splittedText.size-1)){
        if(splittedText[i] == "Aslronaulen"){
            var ersatz = splittedText[i].replace("l" , "t")
            neuerText += ersatz + " "
        }else {
            neuerText += splittedText[i] + " "
        }
    }

    println(neuerText)
}











