package kw.base.part25

import java.io.File

fun main(arg:Array<String>){
    println("读取文件")
//    readFile();
    writeFile();
}

fun writeFile() {
//    TODO("Not yet implemented")
//    {
//        val filePath = "test/text.txt"
//        val file = File("test/text.txt")
//        file.parentFile?.mkdirs()
//        file.appendText("file text")
//    }

    //覆盖写
    val filePath = "test/text1.txt"
    File(filePath).writeText("file text")

}

fun readFile() {
    val filePath = "doc/0.简介.md"
//    TODO("Not yet implemented")
    var readText = File(filePath).readText()
    println(readText)

    println("=============")
    File(filePath).forEachLine {
        line: String -> println(line)
    }
}

