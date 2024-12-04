package kw.test

class TenList {
    fun test(){
        var list:List<String> = listOf("a","")
        var s = list[8]
        println(s)

        //list安全索引取值
//        如果越界，  就返回默认的值
        list.getOrElse(10){"vla"}


        //getOrNull是另一个安全索引取值函数   会返回null  而不是抛出异常
//        使用该函数的时候，   需要处理null值的情况

        var fif = list.getOrNull(4)?:"unknown"

        var dxx = null?:"xx"

        println(dxx)

//        检查列表内容
//        包含 contains("")

//        containsAll(listOf("",""))

//        遍历
        for (s1 in list) {
            println(s1)
        }

        list.forEach{
            name ->{

        }
        }
    }
}

fun main() {
    var list = TenList();
    list.test()
}