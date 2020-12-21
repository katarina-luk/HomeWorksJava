package С3;

public abstract class AbstractCardAction {
    private int id;
    public AbstractCardAction(){ }

    public boolean checkLimit(){
        return true;
    }
    public abstract void doPayment(double amountPayment);


}
