package adrianromanski.pluralsight.bryan_hansen.creational.abstract_factory.credit_card.visa;


import adrianromanski.pluralsight.bryan_hansen.creational.abstract_factory.credit_card.CardType;
import adrianromanski.pluralsight.bryan_hansen.creational.abstract_factory.credit_card.Validator;
import adrianromanski.pluralsight.bryan_hansen.creational.abstract_factory.credit_card.CreditCard;
import adrianromanski.pluralsight.bryan_hansen.creational.abstract_factory.credit_card.CreditCardFactory;

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
