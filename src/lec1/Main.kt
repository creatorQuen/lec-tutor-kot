package lec1

object Main {
    const val URL = "https://www.google.com"

    @JvmStatic
    fun main(args: Array<String>) {
        println("hello world")
        println(sum(1,2))

        //-------------------------------------------------
        var str = "string"
        str = "other"

        val line = ""
        // line = ""    Error

        // Default arguments-------------------------------------------------
        log("header1", "", "footer")
        log("header2", footer = "footer2")

        // infix-------------------------------------------------
        val myObject = MyObject()
        myObject.add("a")
        myObject add "my string"

        // Djenerics-------------------------------------------------
        singletonList(myObject)

        // tailrec-------------------------------------------------
        printIt("text", Int.MAX_VALUE / 1000)

        // Extension fun-------------------------------------------------
        val exList = mutableListOf<String>()
        exList.add("one")
        exList.add("two")
        exList.addItem("one")
        print(exList.size)
    }

    private fun sum(a : Int, b : Int): Int{
        return a + b
    }

    //private fun sum(a: Int, b: Int): Int = a + b
    //private fun sum(a: Int, b: Int) = a + b

    fun log(header: String, body: String = "", footer: String) {
        if (header.isNotEmpty()) {
            print(header)
        }
        if (body.isNotEmpty()) {
            print(body)
        }
        if (footer.isNotEmpty()) {
            print(footer)
        }
    }

    private fun print(vararg args: String) {
        for (string in args) {
            println(string)
        }
    }

    fun <T> singletonList(`object`: T): List<T> {
        val list = ArrayList<T>(1)
        list.add(`object`)
        return list
    }

    private tailrec fun printIt(str: String, times: Int) {
        if (times == 0) {
            println("done")
        } else {
            println(str + times)
            printIt(str, times - 1)
        }
    }

    private fun <T> MutableList<T>.addItem(item: T) {
        if (!contains(item)) {
            add(item)
        }
    }
}

class MyObject {

    private val list = ArrayList<String>()
    infix fun add(str: String) {
        list.add(str)
    }
}