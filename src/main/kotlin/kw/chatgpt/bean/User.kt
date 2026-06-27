package kw.chatgpt.bean

data class User(val name: String, val age: Int) {
    init {
        println("User init")
    }
}

fun main() {
    var user = User("Alice", 30)
    var user1 = User("Bob", 25)

    user.copy(name = "Charlie")

    //解构
    val (id) = user

}

class Book(val name: String, val price: Double){

}

data class Product(val id:Int,val title:String)

fun xx(){
    val product = Product(1,"Kotlin Book")
    var copy = product.copy(title = "Java Book")
}