fun main (){

    val a = (getGameChoice(arrayOf("govno","Xui")))
    val b = (getGameChoice(arrayOf("govno","Xui")))
    if (a=="govno"&& b=="Xui") {
        println("You Win")
    } else {
        println("you fkng suck")
    }
}
fun getGameChoice(optionsParam: Array<String>) =
    optionsParam[(Math.random()*optionsParam.size).toInt()]

