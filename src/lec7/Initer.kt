package lec7

//object Main {

    //@JvmStatic
    fun main(args: Array<String>) {
        val a = A()
        //a.doAny() // Exception in thread "main" kotlin.UninitializedPropertyAccessException: lateinit property b has not been initialized

        // Инициализация по трепобанию.
        val aLazy = ALazy()
        aLazy.doAny(true)
        aLazy.doAny(true)
    }
//}

class A {

    private lateinit var b : B

    fun doAny() {
        b.doSome()
    }
}

class B {

    fun doSome() {
        println("call B class")
    }
}

class AA {

    private var b : B? = null

    fun doAny() {
        b?.doSome()
    }
}

class AAA {

    private var b: B = B()

    fun doAny(flag: Boolean = false) {
        if (flag)
            b.doSome()
    }
}

class ALazy {

    private val b by lazy {
        B()
    }

    fun doAny(flag: Boolean = false) {
        if (flag) {
            b.doSome()
        }
    }
}