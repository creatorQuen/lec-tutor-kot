package lec6

interface A {

    fun doOne()

    fun doTwo()
}

interface B {

    fun doThree()
}

class AImpl : A {

    override fun doOne() {
        print("one")
    }

    override fun doTwo() {
        print("two")
    }
}

class BImpl : B {
    override fun doThree() {
        print("three")
    }
}