package structuralDP.proxyDP;

public class ReelClass implements ImageGenerator{
    private String fullPath;

    public ReelClass(String fullPath) {
        this.fullPath = fullPath;
    }

    @Override
    public void showImage() {
        System.out.println("Image show "+fullPath);
    }
    public void changeImage(){

    }
    public void changeFormatOfImage(){

    }
}
