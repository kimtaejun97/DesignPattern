package TemplateMethodPattern;

public class DefaultGameConnection  extends AbstGameConnection {

    @Override
    protected String Security(String encodedStr) {
        String decodedStr = encodedStr; //decode 처
        System.out.println("보안 확인");
        return decodedStr;
    }
    @Override
    protected boolean authentication(String id, String password) {
        System.out.println("회원 확인");
        return true;
    }
    @Override
    protected int authorization(String userName) {
        System.out.println("권한 확인");
        return 0;
    }
    @Override
    protected String connection(String info) {
        System.out.println("연결");
        return info;
    }
}
