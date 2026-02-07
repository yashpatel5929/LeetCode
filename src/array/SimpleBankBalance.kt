package array

class SimpleBankBalance(val balance : LongArray) {

    fun transfer(account1: Int, account2: Int, money: Long): Boolean {
        if(account1 > balance.size || account2 > balance.size)
            return false
        if(balance[account1-1] >= balance[account2-1]){
            balance[account1-1] = balance[account1-1] - money
            balance[account2-1] = balance[account2-1] + money
            return true

        }
        return false
    }

    fun deposit(account: Int, money: Long): Boolean {
        if(account > balance.size)
            return false

        balance[account-1] = balance[account-1] + money
        return true
    }

    fun withdraw(account: Int, money: Long): Boolean {

        if(account < balance.size && balance[account-1] >= money ) {
            balance[account-1] = balance[account-1] - money
            return true
        }
        return false
    }
}

fun main() {
    val bankObject = SimpleBankBalance(longArrayOf(10,100,20,50,30))
    var withdra = bankObject.withdraw(3 , 10)
    var transfer = bankObject.transfer(5,1,20)
    var deposit = bankObject.deposit(5,20)


}
