package Db;

public class DbIntegretyException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public DbIntegretyException(String message){
        super(message);
    }
}
