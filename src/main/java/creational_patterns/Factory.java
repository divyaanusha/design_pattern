package creational_patterns;
class CurrencyFactory {

       public static Currency createCurrency (String country) {
       if (country. equalsIgnoreCase ("India")){
              return new Rupee();
       }else if(country. equalsIgnoreCase ("Singapore")){
              return new SGDDollar();
       }else if(country. equalsIgnoreCase ("US")){
              return new USDollar();
        }
       throw new IllegalArgumentException("No such currency");
       }
}

//factory design pattern
public class Factory {
       public static void main(String args[]) {
              String country = args[0];
              Currency rupee = CurrencyFactory.createCurrency(country);
              System.out.println(rupee.getSymbol());
       }
}
