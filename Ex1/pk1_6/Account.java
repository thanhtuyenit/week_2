package Ex1.pk1_6;

public class Account {
	String id;
	String name;
	int balance = 0;

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Account(String id, String name, int balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}

	public int credit(int amount) {
		balance += amount;
		return balance;
	}

	public int debit(int amount) {
		if (amount <= balance)
			balance -= amount;
		else
			System.out.print("Amount exceeded balance");
		return balance;
	}

	public int transferTo(Account another, int amount) {
		if (amount <= this.balance) {
			another.balance += amount;
			this.balance -= amount;
		} else
			System.out.print("Amount exceeded balance");
		return this.balance;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}

}
