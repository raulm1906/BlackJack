package model.cards;

/**
 *
 * @author Raúl Marrero Marichal
 */
public class Ace extends Card {
    private static final Integer VALUE = 11;

    public Ace() {
        super(VALUE);
    }

    @Override
    public Boolean isAce(){
        return true;
    }
}
