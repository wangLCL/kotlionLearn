package kw.base.part23

import kotlin.concurrent.thread

fun main() {
    var currentThread = Thread.currentThread()
    println(currentThread.name)

    var thread = thread {
        run()
    }
    thread.stop()
}

fun run(){
    print("xxxx")
}