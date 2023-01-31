class Story{
    static class EndOfStory {
        void End() {
            System.out.print("...Конец истории...");
        }
    }
}

class NamingException extends RuntimeException{ //обработчик исключения наименования

    NamingException(String s){
        super(s);
    }
}
class PermissionException extends RuntimeException{  //обработчик исключения доступа
    PermissionException(String message){
        super((message.length()!=0) ? message : "Undefined");
    }
}
