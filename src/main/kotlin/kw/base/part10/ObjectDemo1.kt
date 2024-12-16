package kw.base.part10

/**
 * 继承的时候父类需要加上open
 */
open class ObjectDemo1 {
    fun handler(listener: OnClickListener){
        listener.onClick()
    }
}

interface OnClickListener{
    fun onClick()
}

fun main() {
    var v = ObjectDemo1()
    v.handler(object : OnClickListener {
        override fun onClick() {

        }
    })

    var persion = object : ObjectDemo1(), OnClickListener {
        override fun onClick() {
        }
    }
    persion.handler(object : OnClickListener {
        override fun onClick() {
            TODO("Not yet implemented")
        }
    })
}