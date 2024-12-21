package kw.base.part31

open class Animal {
    open fun run(){

    }
}

fun main() {
    /**
     * 类似于java中的复写父类方法
     */
    object : Animal() {
        override fun run() {
            super.run()
            println("xxxxxxxxxx")
        }
    };

}