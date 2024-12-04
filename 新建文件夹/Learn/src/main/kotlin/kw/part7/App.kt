package kw.part7

fun formatString(str:String){
    var temp = """
       ${str} 
   """
    println(temp)
}


fun main() {
    formatString("kw")
}