import java.util.*

class Deck{
    private var count = 52
    private var deck = Array(4) {BooleanArray(13)}
    fun remove(card: Int, c: Char){
        deck[c - 'a'][card] = true
        count--
    }
    fun probability(num: Int): Int{
        var indeck = 0
        for (i in 0..3){
            if(!deck[i][num])
            indeck++
        }
        val ans = indeck* 1000/ count.toDouble()
        return ans.toInt()
    }
}
fun main(){
    val read = Scanner(System.`in`)
    val deck = Deck()
    var x: Int = read.nextInt()
    while(x!=-1){
        when(x){
            1-> {
                val card: Int = read.nextInt()
                val suite: Char = read.next()[0]
                deck.remove(card, suite)
            }
            2-> {
                val card: Int = read.nextInt()
                println(deck.probability(card))
            }
        }
        x = read.nextInt()
    }
}