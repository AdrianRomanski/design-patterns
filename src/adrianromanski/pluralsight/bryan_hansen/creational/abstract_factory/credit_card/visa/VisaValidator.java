package adrianromanski.pluralsight.bryan_hansen.creational.abstract_factory.credit_card.visa;

import adrianromanski.pluralsight.bryan_hansen.creational.abstract_factory.credit_card.Validator;
import adrianromanski.pluralsight.bryan_hansen.creational.abstract_factory.credit_card.CreditCard;

public class VisaValidator implements Validator {

    @Override
    public boolean isValid(CreditCard creditCard) {
        // Logic for checking is it valid or not
        return false;
    }
}
