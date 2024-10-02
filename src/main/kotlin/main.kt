fun main() {
    val list = List(10) { (1..100).random() }
    println(list)

    println(list.selectionSortDescending())
}

