package devices;

public class Scanner extends Device{

    public Scanner(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processsDoc(String doc){
        System.out.println("Scanner processing: "+ doc);
    }

    public String scan(){
        return "Scanned content: ";
    }
}