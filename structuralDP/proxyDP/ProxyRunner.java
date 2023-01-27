package structuralDP.proxyDP;

public class ProxyRunner {
    public static void main(String[] args) {

        ProxyClass proxyClass=new ProxyClass("/c/resim1");
        ProxyClass proxyClass2=new ProxyClass("/c/resim2");

        proxyClass.showImage();
    }
}
