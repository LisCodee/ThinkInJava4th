package 访问权限控制.practice;
class Connection{
    private Connection(){
    }
    private static Connection c = new Connection();
    public static Connection access(){
        return c;
    }
}
public class ConnectionManager {
    Connection[] cs = new Connection[10];
    public boolean addConnection(){
        for(Connection c: cs){
            if(c == null){
                c = Connection.access();
                return true;
            }
        }
        return false;
    }
    public Connection isEmpty(){
        for(Connection c : cs){
            if(c != null)
                return c;
        }
        return null;
    }
}
