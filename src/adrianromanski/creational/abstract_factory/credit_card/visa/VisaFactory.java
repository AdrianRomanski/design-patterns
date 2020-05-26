package adrianromanski.creational.abstract_factory.credit_card.visa;


import adrianromanski.creational.abstract_factory.credit_card.CardType;
import adrianromanski.creational.abstract_factory.credit_card.CreditCard;
import adrianromanski.creational.abstract_factory.credit_card.CreditCardFactory;
import adrianromanski.creational.abstract_factory.credit_card.Validator;

public class VisaFactory extends CreditCardFactory {


    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch(cardType) {
            case GOLD:

                return new VisaGoldCreditCard();

            case PLATINUM:

                return new VisaBlackCreditCard();
        }
        return null;
    }

    @Override
    public Validator getValidator(CardType cardType) {
        return new VisaValidator();
    }
}
