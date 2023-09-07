package lec7.three

object Main {

    @JvmStatic
    fun main() {
        // with
        with(AImpl()) {
            do1()
            do2()
        }

        // let то же самое что и with но можно передать ссылку на обьект
        AImpl().let {
            it.do2()
            B().doSome(it)
        }

        // по другому
        AImpl().let { a ->
            a.do2()
            B().doSome(a)
        }

        // run такой же как и with, но можно если не уверены что обхект не нул
        val a: A? = null
        with(a) {
            a?.do1()
            a?.do2()
        }

        val a1: A? = null
        a1?.run {
            do1()
            do2()
        }

    }

    // такое же как и let, но не возвращает обьект
    fun getA() : A = AImpl().also {
        it.do2()
        B().doSome(it)
    }

    fun getList() = ArrayList<String>().apply {
        add("1")
        add("2")
    }
}


class AImpl : A
interface A {
    fun do1() {print("1")}
    fun do2() {print("2")}
}

class B {

    fun doSome(a: A) {
        print("some")
        a.do1()
    }
}