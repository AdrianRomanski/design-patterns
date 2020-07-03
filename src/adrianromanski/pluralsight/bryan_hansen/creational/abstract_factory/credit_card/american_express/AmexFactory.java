package adrianromanski.pluralsight.bryan_hansen.creational.abstract_factory.credit_card.american_express;

import adrianromanski.pluralsight.bryan_hansen.creational.abstract_factory.credit_card.CardType;
import adrianromanski.pluralsight.bryan_hansen.creational.abstract_factory.credit_card.CreditCard;
import adrianromanski.pluralsight.bryan_hansen.creational.abstract_factory.credit_card.CreditCardFactory;
import adrianromanski.pluralsight.bryan_hansen.creational.abstract_factory.credit_card.Validator;

public class AmexFactory extends CreditCardFactory {


    @Override
    public CreditCard getCreditCard(CardType cardType) {

        switch (cardType) {
            case GOLD:
                return new AmexGoldCreditCard();

            case PLATINUM:
                return new AmexPlatinumCreditCard();

            default:
                break;
        }
        return null;
    }


    @Override
    public Validator getValidator(CardType cardType) {

        switch (cardType) {
            case GOLD:
                return new AmexGoldValidator();

            case PLATINUM:
                return new AmexPlatinumValidator();
        }
        return null;
    }
}
