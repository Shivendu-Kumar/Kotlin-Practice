import java.util.Scanner

class Account(var balance:Int, val rate:Float){
    fun deposit(amt:Int){balance+=amt}
    fun withdraw(amt:Int){balance-=amt}
    fun addInterest(){balance+=(balance*rate).toInt()}
}
fun main(){
    val read = Scanner(System.`in`)
    print("Enter a number: ")
    val balance = read.nextInt()
    val rate = read.nextFloat()
    val account = Account(balance, rate)
    var input = read.nextInt()
    while(input!=-1){
        when(input){
            1->{var amt = read.nextInt()
                account.deposit(amt)}
            2->{var amt = read.nextInt()
                account.withdraw(amt)}
            3->account.addInterest()        
        }
       input = read.nextInt()
    }
    print(account.balance)
}