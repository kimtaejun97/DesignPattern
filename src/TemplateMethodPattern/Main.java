package TemplateMethodPattern;

public class Main {
    public static void main(String[] args) {
        AbstGameConnection gameConnection = new DefaultGameConnection();
        gameConnection.requestConnection("디코드 정보");
    }
}
