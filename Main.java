
public class Main {
    public static void main(String[] args) {
    
        FullStackDeveloper FSDev = new FullStackDeveloper();
        BackendDeveloper BackDev = new BackendDeveloper();
        
        FSDev.CreateFront();
        FSDev.CreateServer();
        BackDev.CreateServer();


        Developer dev = new FrontendDeveloper();
        if (dev instanceof Frontender) {
            ((Frontender) dev).CreateFront();
        }

        
    }
}
