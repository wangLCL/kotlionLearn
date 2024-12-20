package kw.test.method

fun main() {
//    xx(){
//        println("")
//    }
    xx({
            x->
        println(x)
    })
}

fun xx(a:(x:Int)->Unit){
    a(10)
}