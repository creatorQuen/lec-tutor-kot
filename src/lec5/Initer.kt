package lec5

fun main() {
    val list = mutableListOf<String>()
    val found = list.find {
        it == "a"
    }

    if (found == null) {

    } else {
        val index = list.indexOf("a")
    }

    //another
    val index = list.indexOf("a")
    if (index == -1) {
        // not contains
    } else {
        //contains
    }

}