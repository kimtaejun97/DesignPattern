package TemplateMethodPattern;


public abstract class AbstGameConnection {
    protected abstract String Security(String String);
    protected abstract boolean authentication(String id, String password);
    protected abstract int authorization(String userName);
    protected abstract String connection(String info);

    public String requestConnection(String encodedInfo){
        String decodedInfo = Security(encodedInfo);
        String id = "id";
        String password = "pass";
        String userName = "kim";
        boolean isExist =  authentication(id, password);
        if(! isExist)
           throw new Error("존재하지 않는 회원.");

        int i = authorization(userName);
        switch (i){
            case 0:
                //매니저
                break;
            case 1:
                //정회원
                break;
            case 2:
                //준회원
                break;
        }
        return connection(decodedInfo);
    }
}
