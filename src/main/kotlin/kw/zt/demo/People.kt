package kw.zt.demo

//class People {
//    private var name:String? = null
//
//}

class People(private var name:String,private var age:Int){
    fun constructor() {

    }

    var publicName:String = this.name
        set(value){
            field = value
        }
        get()= field

    public fun setName(name:String){
        this.name = name;
    }

    public fun getName():String{
        return name
    }

    public fun eat(){
        println("eat mi fan")
    }

    private fun run(){
        println("run run run")
    }
}