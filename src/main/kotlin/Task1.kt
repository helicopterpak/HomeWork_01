fun main() {
    val n = 99
    val list = MutableList(n) { it + 1 }
    list.add(0,0)
    println(list)

    list.removeAll {it % 2 != 0}
    println(list)

    val sliceList = list.slice(10..20)
    println(sliceList)

    println((sliceList.map {it + 1}).sum())

}




