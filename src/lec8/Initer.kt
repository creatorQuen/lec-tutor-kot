package lec8

object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        val d = Data()
        d.i = 5
        d.show()

        //
        println()
        val d1 = Data1()
        d1.add("1")
        d1.add("2")
        //d1.copy[0] = "new" // No set method providing array access
        d1.show()

        //
        println()
        val source = listOf(-4,3,-9,1,-8)
        print(getNewList(source))

        //
        println()
        print(getNewList1(source, "num"))

        //
        println()
        print(getNewList2(source, "num"))

        //
        println()
        print(listOf(1,2,3,4,5).subList(1,2))
    }

    fun getNewList(source: List<Int>) = source.filter { it > 0}

    fun getNewList1(source: List<Int>, prefix: String) = source.map {prefix + it}

    fun getNewList2(source: List<Int>, prefix: String) = source.filter { it > 0}.map {prefix + it}
}

class Data {
    var i: Int = 0
        // or private set
        set(value) {
            if (value > 100)
                field = value
        }
        get() = Int.MAX_VALUE

    fun show() {
        print(i)
    }
}

class Data1 {

    private val list = mutableListOf<String>()

    val copy
        get() = listOf(list)

    fun add(x: String) = list.add(x)

    fun show() {
        print(list)
    }
}