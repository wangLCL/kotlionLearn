package kw.base.part12.App.jicheng

open class ObClass2 {
    open fun dosomthing(){}
}

fun main(){
    val p = object : ObClass2(){
        override fun dosomthing() {
            super.dosomthing()
            println("------------------")
        }
    }
}