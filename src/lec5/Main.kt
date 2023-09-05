package lec5

object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        val list = mutableListOf(MyItem(1, "1"))
        list.addItem(MyItem(1, "1"))
        print(list)

        println()
        val item = MyItem(1, "1")
        val listItems = mutableListOf(item)
        listItems.addItem(item)
        print(listItems)
    }

    private fun <T> MutableList<T>.addItem(item: T) {
        if (!contains(item))
            add(item)
    }
}