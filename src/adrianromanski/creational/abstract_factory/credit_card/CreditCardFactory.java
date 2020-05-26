package adrianromanski.creational.abstract_factory.credit_card;

import adrianromanski.creational.abstract_factory.credit_card.american_express.AmexFactory;
import adrianromanski.creational.abstract_factory.credit_card.visa.VisaFactory;

public abstract class CreditCardFactory {

    public static CreditCardFactory getCreditCardFactory(int creditScore) {

        if(creditScore > 650) {
            return new AmexFactory();
        }
        else {
            return new VisaFactory();
        }
    }

    public abstract CreditCard getCreditCard(CardType cardType);

    public abstract Validator getValidator(CardType cardType);
}
