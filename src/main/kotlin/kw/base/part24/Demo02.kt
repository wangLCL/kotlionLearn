package kw.base.part24

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

//使用 launch() 函数将每个对printForecast() 和 printTemperature()
// 的调用分别移到其各自的协程中。

fun main() {
    val time = measureTimeMillis {
        runBlocking {
            println("dddddddddddddd")

            launch {
                for (i in 0..10) {
                    println("xxxxxxxxxxxxxxxxx")
                }
            }

            launch {
                for (i in 0..10) {
                    println("uuuuuuuuuuuuuu")
                }
            }
            println("-=======================")
        }
    }

    println(time)
}