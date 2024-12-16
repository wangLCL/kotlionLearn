package kw.base.part16

sealed class MfDmeo
class Success(val message:String): MfDmeo()
class Failed(val message:String): MfDmeo()

fun onResult(result: MfDmeo){
    when(result){
       is Success ->""
       is Failed ->""
    }
}