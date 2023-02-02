import kotlin.system.measureTimeMillis

fun main() {
    val _argumentFunction = {
        var a = 10
        val b = 20
        val c = 500
        for (i in 1..1000) {
            var rez = ((b - a) * c)
            a += 1
            println(rez)
        }
    }
    performanceTime(_argumentFunction)
}

fun performanceTime(argumentFunction: () -> Unit){
    val neededTime = measureTimeMillis {
        argumentFunction()
    }
    println("Performance time of argument function $neededTime ms")
}