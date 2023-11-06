package kw.test

fun main() {
    val name = "kw"
    val health = 100;

    if (health == 100){
        println("xxxxxxx"+health);
    }else{

    }

    val xx = when(health){
        100->""
        in  88..100->""
        else -> {}
    }

    println("$name  $health")
}

