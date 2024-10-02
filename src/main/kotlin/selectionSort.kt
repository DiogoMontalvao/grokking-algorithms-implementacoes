fun List<Int>.selectionSort(): List<Int> {
    val oldList = this.toMutableList()
    val newList = MutableList(this.size) { 0 }

    newList.forEachIndexed { index, _ ->
        val smallestIndex = oldList.findSmallest()

        newList[index] = oldList.removeAt(smallestIndex)
    }

    return newList.toList()
}

fun List<Int>.findSmallest(): Int {
    var smallest = this.first()
    var smallestIndex = 0

    this.forEachIndexed { index, number ->
        if (number < smallest) {
            smallest = number
            smallestIndex = index
        }
    }

    return smallestIndex
}