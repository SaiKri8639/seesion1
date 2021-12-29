package persistent.session.BankCardConfig;

public class ShoppingCard
{
	private String cardName;
	 private long cardNumber;
 public ShoppingCard(String cardName, long cardNumber) {
		super();
		this.cardName = cardName;
		this.cardNumber = cardNumber;
	}
public String getCardName() {
	return cardName;
}
public void setCardName(String cardName) {
	this.cardName = cardName;
}
public long getCardNumber() {
	return cardNumber;
}
public void setCardNumber(long cardNumber) {
	this.cardNumber = cardNumber;
}
@Override
public String toString() {
	return "ShoppingCard [cardName=" + cardName + ", cardNumber=" + cardNumber + "]";
}

 
}
