package lec3

object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        // null-safety
        var x : String? = "a"
        //x = null

//        print(x.length) // Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?
        if (x != null) {
            print(x.length)
        }

        print(x?.length) // val length = if (x == null) null else x.length
        // print(x!!.length) - ошибка такая же как и в джава

        //-----------------------------------------------
        val y: Int? = null
        (y as String).length
        (y as String?)?.length // безопасно

        (y as? String)?.length

        //------------------------------------------------
        val repositoryMy = object : RepositoryMy {
            override fun getData(): ResultMy {
                TODO("Not yet implemented")
            }
        }
        when (val result = repositoryMy.getData()) {
            is ResultMy.Success -> print(result.data)
            is ResultMy.Error -> throw java.lang.IllegalArgumentException(result.message)
        }

    }

    fun max(a: Int, b: Int): Int {
        var result: Int
        if (a > b) {
            result = a
        } else {
            result = b
        }

        return result
    }

    fun max1(a: Int, b: Int): Int {
        val result: Int
        result = if (a > b) {
            a
        } else {
            b
        }

        return result
    }

    fun max2(a: Int, b: Int) = if (a > b) a else b

    //---------------------------------------------------
    fun checkNumber(x: Int) {
        if (x > 0) {
            println("positive")
        } else if (x < 0) {
            println("negative")
        } else {
            println("zero")
        }
    }

    fun checkNumber1(x: Int) {
        when {
            x > 0 -> println("positive")
            x < 0 -> println("negative")
            else -> println("zero")
        }
    }

    fun convertGrade(grade: Int) {
        when(grade) {
            5 -> print("A")
            4 -> print("B")
            3 -> print("C")
            2 -> print("D")
            1 -> print("E")
            else -> throw IllegalArgumentException("unknown grade")
        }
    }

    fun convertGrade1(grade: Int) {
        when(grade) {
            5 -> print("A")
            4 -> print("B")
            3 -> print("C")
            2, 1 -> print("D")
            else -> throw IllegalArgumentException("unknown grade")
        }
    }

    fun checkNumber2(x: Int) {
        when(x) {
            in 1..100 -> print("positive")
            in -100..-1 -> print("negative")
            else -> print("out of range")
        }
    }

    //---------------------------------------------------------
    fun check(x: Any) {
        print((x as String).isEmpty())
    }

    // ------------------------------------------------------------
    fun check1(x: Any?) = when (x) {
        is String -> print("it's string")
        is String? -> print("it's string, maybe null")
        else -> print("unknow")
    }
    // OR
    fun check2(x: Any?) = when {
        x is String -> print("it's string")
        x == null -> print("it's null")
        else -> print("unknow")
    }
}