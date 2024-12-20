package kw.base.part24

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() {
    //您可以调用协程库中提供的 runBlocking() 函数来封装现有代码。
    // runBlocking() 用于运行一个事件循环，该事件循环可在每项任务
    // 准备好恢复时从中断处继续执行任务，因此可以同时处理多项任务。
//    runnBlicking同步函数，在函数未完成之前不会返回

//    1.同步代码
    runBlocking {
        println("Weather fr")
        extracted()
    }
}

private suspend fun extracted() {
    delay(1000)
    println("x")
}

//使用协程库中的 launch() 函数启动一个新协程

//使用 launch() 函数将每个对 printForecast()
// 和 printTemperature() 的调用分别移到其各自的协程中。