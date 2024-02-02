package Class;

import Interface.Int1;

public abstract class Function implements Int1 {
    Function(){

    }

    public boolean illegalUserTextInput(String text){
        if(text.equals("")){
            return true;
        }

        return false;
    }

}
