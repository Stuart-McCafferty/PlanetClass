import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Planet {

    private String name;
    private int size;

    public Planet(String name, int size){
        this.name = name;
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public void printExplode(){
        System.out.println("Boom! " + this.name + " has exploded");
     }
}
