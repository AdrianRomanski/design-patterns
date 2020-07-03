package adrianromanski.pluralsight.bryan_hansen.creational.abstract_factory.credit_card.american_express;

import adrianromanski.pluralsight.bryan_hansen.creational.abstract_factory.credit_card.CreditCard;
import adrianromanski.pluralsight.bryan_hansen.creational.abstract_factory.credit_card.Validator;

public class AmexGoldValidator implements Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        // Logic for validation
        return false;
    }
}
