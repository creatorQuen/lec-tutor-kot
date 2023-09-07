package lec6

interface AA {

    fun doOne()
}

interface BB {

    fun doOne()
}

open class AAImpl(private val i: Int) : AA {

    override fun doOne() {
        print("oneAA $i")
    }
}

class BBImpl(private val i: Int) : BB {

    override fun doOne() {
        print("oneBB $i")
    }
}

class CC(private val i: Int) : AAImpl(i), BB {

    override fun doOne() {
        super.doOne()
        println("hello from c $i")
    }

}