package net.thumbtack.denisenko.trainee.enums;

public enum TraineeErrorCodes {
    ERROR_STRING_IS_NULL_OR_EMTRY("The string is null or empty "), ERROR_NUMBER_IS_NOT_CORRECT("Number is not correct");

    public String getPrivateMessage() {
        return privateMessage;
    }

    private String privateMessage;

    TraineeErrorCodes(String privateMes){
    	// REVU fix
        this.privateMessage = privateMessage;
    }
}
