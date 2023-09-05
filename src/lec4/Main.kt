package lec4

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        // for (int i=0;i<10;i++)
        for (i in 0..10) {
            print(i)
        }
        println()
        // for (int i=10;i>0;i-=2)
        for (i in 10 downTo 0 step 2) {
            print(i)
        }

        println()
        val array = arrayOf("a", "b", "c")
        for (i in array.indices) {
            print(array[i])
        }

        println()
        val array1 = arrayOf("a", "b", "c")
        for (i in 0 until array1.size) {
            print(array1[i])
        }

        println()
        val array2 = arrayOf("a", "b", "c")
        for (item in array2){
            print(item)
        }

        println("\n")
        val array3 = arrayOf("a", "b", "c")
        for ((index, value) in array3.withIndex()) {
            println("индекс $index значение $value")
        }

        println("")
        loop@ for (i in 0..2) {
            println("i: $i")
            for (j in 0..2) {
                println("j: $j")
                if(j == 1) {
                    break@loop
                }
            }
        }

        println("\n")
        doSome(4)

        println("\n")
        doSomeForeach(2, arrayOf(1, 2, 3, 4, 5, 6))

        println("\n")
        var x = 0
        loop@ while (true) {
            println("main")
            while (true) {
                println("Inner")
                if (x == 2)
                    break@loop
                x++
            }
        } // main Inner Inner Inner


        // Arrays ---------------------------------
        println("\n")
        val array4 =Array(5) { i -> i + 1 }
        array4.forEach { print(it) } // 12345

        println("\n")
        val array5 = Array(5) { 0 }
        array5.forEach { print(it) } // 00000

        println("\n")
        val array6 = arrayOf(1, "2", 3, "4")
        array6.forEach {
            if (it is String) {
                print(it)
            }
        }

        println("\n")
        val array7 = arrayOf(1, "2", 3, "4")
        array7.plus("new").forEach {
            if (it is String) {
                print(it)
            }
        }

        println("\n")
        val array8 = arrayOf(1, "2", 3, "4")
        array8.forEachIndexed { index, data ->
            if (data is String) {
                print(index)
            }
        }
    }

    fun doSome(max: Int) {
        for (i in 0..max) {
            if (i == 3)
                return
        }
        print("done")
    }

    fun doSomeForeach(max: Int, array: Array<Int>) {
        array.forEach {
            if (it == max)
                return@forEach
        }
        print("done")
    }

}

