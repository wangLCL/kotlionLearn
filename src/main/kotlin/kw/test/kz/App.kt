package kw.test.kz

fun main() {
    var userInfo = UserInfo()
    userInfo.eat()
    userInfo.run()
}

fun UserInfo.eat(){
    println("eat food!!!"+this.name)
}

fun UserInfo.run()= println("run "+this.name)