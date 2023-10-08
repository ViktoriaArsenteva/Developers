import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    
        // FullStackDeveloper FSDev = new FullStackDeveloper();
        // BackendDeveloper BackDev = new BackendDeveloper();
        
        // FSDev.CreateFront();
        // FSDev.CreateServer();
        // BackDev.CreateServer();

        ArrayList<Developer> devs = new ArrayList<Developer>();
        devs.add(new FrontendDeveloper());
        devs.add(new BackendDeveloper());
        devs.add(new FullStackDeveloper());

        for (Developer dev : devs) {
            if (dev instanceof FullStack) {
                ((FullStack) dev).CreateFront();
                ((FullStack) dev).CreateServer();
            } else if (dev instanceof Backender) {
                ((Backender) dev).CreateServer();
            } else if  (dev instanceof Frontender) {
                ((Frontender) dev).CreateFront();
                
            }
            
        }

        
    }
}
