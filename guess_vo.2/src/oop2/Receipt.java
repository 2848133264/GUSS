package oop2;

public class Receipt {

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	/**
	 * fees 一张小票是有多条记录的
	 */
	private double fees;
	public Receipt(double fees) {
		// TODO Auto-generated constructor stub
		this.fees = fees;
	}
}
