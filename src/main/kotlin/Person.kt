import jdk.javadoc.internal.doclint.HtmlTag.get

data class Person(
    val name: String,
    val surname: String,
    var age: Int
)

fun main() {
    val person = mutableListOf<Person>(Person("Tony", "Hawk", 80),
        Person("Tony", "Braxton", 90),
        Person("Roberto", "Carlos", 70),
        Person("Pit", "Davis", 100)
    )
    println(person.sortByAge())
}
fun <Person> MutableList<Person>.sortByAge(mutableList: MutableList<Person>){
    this.sortByDescending{it.age}
}