package lab_06;

public class lab06_04 {
    public static void main(String[] args) {
        String url = "https://google.com";
        System.out.println(url);

        int iProtocol = url.indexOf(":");
        String myProtocol = url.substring(0, iProtocol);
        System.out.println(myProtocol);

        int iDomainName = iProtocol + 3;
        int iDot = url.indexOf(".");
        String myDomainName = url.substring(iDomainName, iDot);
        System.out.println(myDomainName);

        String myDot = url.substring(iDot);
        System.out.println(myDot);
    }
}
