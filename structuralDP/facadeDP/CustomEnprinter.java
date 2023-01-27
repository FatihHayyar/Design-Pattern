package structuralDP.facadeDP;

public class CustomEnprinter {
    public static void main(String[] args) {
        String text="Context";
        AESEncryptor encryptor = new AESEncryptor();
        encryptor.encrypt(text);

        MD5Encryptor md5Encryptor=new MD5Encryptor();
        md5Encryptor.encrypt(text,"secret");

        SHAEncryptor shaEncryptor=new SHAEncryptor();
        shaEncryptor.encrypt(text,"secret",true);


        EncryptorFacede encryptorFacede=new EncryptorFacede();
        encryptorFacede.encrypt(text, EncryptorFacede.EncType.MD5);
    }
}
