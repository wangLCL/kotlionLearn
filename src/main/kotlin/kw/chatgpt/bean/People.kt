package kw.chatgpt.bean

class People(val name:String,val age:Int) {

    /**
     * 等价：
     *
     * class People{
     *  private val name:String
     *  private val age:Int
     *  public People(name:String,age:Int){
     *      this.name = name
     *      this.age = age
     *  }
     * }
     * */

    init {
        println("People init")
    }
}