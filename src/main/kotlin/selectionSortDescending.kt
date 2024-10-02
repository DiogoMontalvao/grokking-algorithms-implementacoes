fun List<Int>.selectionSortDescending(): List<Int> {
    val oldList = this.toMutableList()
    val newList = MutableList(this.size) { 0 }

    newList.forEachIndexed { index, _ ->
        val highestIndex = oldList.findHighest()

        newList[index] = oldList.removeAt(highestIndex)
    }

    return newList.toList()
}

fun List<Int>.findHighest(): Int {
    var highest = this.first()
    var highestIndex = 0

    this.forEachIndexed { index, number ->
        if (number > highest) {
            highest = number
            highestIndex = index
        }
    }

    return highestIndex
}