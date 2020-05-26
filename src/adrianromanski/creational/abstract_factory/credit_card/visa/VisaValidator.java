package adrianromanski.creational.abstract_factory.credit_card.visa;

import adrianromanski.creational.abstract_factory.credit_card.CreditCard;
import adrianromanski.creational.abstract_factory.credit_card.Validator;

public class VisaValidator implements Validator {

    @Override
    public boolean isValid(CreditCard creditCard) {
        // Logic for checking is it valid or not
        return false;
    }
}
