package mx.iteso;

/**
 * Created by Arturo Hernandez on 17/11/2016.
 */
public class State_11 implements State {

    public void take(BranchesContext wrapper ,boolean bit) {

        if(bit)
            wrapper.setState(this);
        else
            wrapper.setState(new State_10());
    }
}
