package persistent.session.BankCardConfig;

import org.springframework.context.annotation.*;

@Configuration
public class ShoppingCardConfig 
{
 @Bean
  public ShoppingCard shoppingCard()
  {
	 return new ShoppingCard("HDFC",12345); 
  }
  @Bean
  public Item item()
  {
	 return new Item("IceCream",100); 
  }
}
