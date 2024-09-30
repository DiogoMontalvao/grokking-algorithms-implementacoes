fun binarySearch(num: Int, sortedList: List<Int>): Int {
    var bottom = 0
    var top = sortedList.lastIndex

    while (bottom <= top) {
        val middle = (bottom + top) / 2
        val guess = sortedList[middle]

        if (guess == num) return middle

        if (guess < num) bottom = middle + 1

        if (guess > num) top = middle - 1
    }

    return -1
}