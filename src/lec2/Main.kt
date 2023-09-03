package lec2

object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        SingletonKotlin.increment()
        SingletonKotlin.increment()
        SingletonKotlin.print()

        //
        // val simpleClass2 = SimpleClass2()    // Error
        val other = SimpleClass2(2)
        val new  = SimpleClass2("new")

        // init
        val inter = SimpleClass4WithInit()

        // nested
        val nested = KotlinClass.NestedKotlin(4)
        nested.print()

        // override and anonim
        Thread(object : Runnable {
            override fun run() {

            }
        })

        Thread(Runnable {})
    }
}

object SingletonKotlin {

    private var x = 0

    fun increment() {
        x++
    }

    fun print() {
        println(x)
    }
}

//class SimpleClass {
//    private val data: Int
//}

//class SimpleClass(private val data: Int) {
//}

class SimpleClass1(private val data: Int = 0) {
}

class SimpleClass2 {

    private val data: Int

    constructor(text: String) {
        data = text.length
    }

    constructor(number: Int) {
        data = number
    }
}

class SimpleClass3 {

    private val data: Int

    constructor(text: String) : this(text.length)

    constructor(number: Int) {
        data = number
    }
}

class SimpleClass4WithInit {
    constructor() {
        println("constructed call")
    }

    init {
        println("some code done init Kotlin")
    }
}

class KotlinClass {

    class NestedKotlin(private val i: Int) {
        fun print() {
            println()
            println("hello from nested")
            println(i)
        }
    }
}