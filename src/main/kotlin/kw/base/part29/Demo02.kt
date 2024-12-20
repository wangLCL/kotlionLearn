package kw.base.part29

fun <T> T.printDog(){
    print(this)
}

fun main() {
    var sx = "x"
    sx.add().printDog()
}
