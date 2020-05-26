package adrianromanski.creational.abstract_factory.credit_card.american_express;


import adrianromanski.creational.abstract_factory.credit_card.CreditCard;
import adrianromanski.creational.abstract_factory.credit_card.Validator;

public class AmexPlatinumValidator implements Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        // Logic for validation
        return false;
    }
}
