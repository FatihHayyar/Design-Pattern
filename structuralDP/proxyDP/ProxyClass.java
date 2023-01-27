package structuralDP.proxyDP;

public class ProxyClass implements ImageGenerator{

    private ReelClass reelClass;
    private String fullPath;

    public ProxyClass(String fullPath) {
        this.fullPath = fullPath;
    }

    @Override
    public void showImage() {
    if(reelClass==null){
        reelClass=new ReelClass(fullPath);
        reelClass.showImage();
    }
    }
}
