package kw.base.part18

//函数类型是 (Double,Double)->返回值类型
fun rectangleArea(width:Double,height:Double) : Double{
    return width * height
}

fun triangleArea(bottom:Double,height: Double) = 0.5 * bottom * height

fun sayHello(){
    println("xxxxxxxxxx")
}

fun main() {
    var getArea : (Double,Double)->Double = ::rectangleArea


}