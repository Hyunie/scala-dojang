package jerry

object Chapter8 {

  class BankAccount(initialBalance: Double) {
    private var balance = initialBalance

    def deposit(amount: Double) = {
      balance += amount; balance
    }

    def withdraw(amount: Double) = {
      balance -= amount; balance
    }
    override def toString = balance.toString
  }

  class CheckingAccount(initialBalance: Double)
    extends BankAccount(initialBalance) {

    val option = 1.0
    override def deposit(amount: Double) = {
      super.deposit(amount - option)
    }

    override def withdraw(amount: Double) = {
      super.withdraw(amount + option)
    }
  }

  def main(args: Array[String]) {
    val account = new CheckingAccount(500.0)
    println("Initial Account:"+account)
    account.deposit(100)
    println("Deposit $100:"+account)
    account.withdraw(50)
    println("Withdraw $50:"+account)

  }
}