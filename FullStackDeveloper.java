public class FullStackDeveloper extends Developer implements FullStack {

    @Override
    public void CreateServer() {
        System.out.println("CreateServer");
    }

    @Override
    public void CreateFront() {
        System.out.println("CreateFront");
    }
    
}
