package kw.base.part12

class Player {
    var name = "xx";
    var addr:String? = null;
    var componyAddr:String? = null
        get() {
            if (field == null){
                return ""
            }else{
                return field
            }
        }
        set(value) {
            field = value + "xxxx"
        }

    var age:Int
        get() {
            return (1..6).shuffled().first()
        }
        set(value) {

        }

//    var agex: Int
//        get() = (1..6).shuffled().first()
}

fun main(args:Array<String>){
    var p = Player()
    p.name = "fjj"
}