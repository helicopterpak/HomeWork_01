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
    println("~~~")
    println(person.sortByNameAndSurname())
}
fun List<Person>.sortByAge(): List<Person> = sortedByDescending{it.age}
fun List<Person>.sortByNameAndSurname(): List<Person> = sortedBy {it.surname}.sortedBy { it.name }
