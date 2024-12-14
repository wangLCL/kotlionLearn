package kw.base.part19

val <T> ArrayList<T>.frist:T? get() =
    if(this.size>1) this[0] else null