import java.sql.*;

public class DB {
    
    Connection c;
    Statement s;
    ResultSet rS;
    String cS= "jdbc:sqlite://C:/Users/sahin/Desktop/sahin/test.db";
    String hallOfFame = "CREATE TABLE IF NOT EXISTS Players(\n"
            +"ID integer primary key autoincrement not null,\n"
            +"Name text not null,\n"
            +"GameMode text not null,\n"
            +"Time int not null,\n"
            +"Guess int not null\n"
            +");";

    public DB() throws Exception {
        
        Class.forName("org.sqlite.JDBC");
        c = DriverManager.getConnection(cS);
        s = c.createStatement();
        s.execute(hallOfFame);
        
        System.out.println("Veritabanı Bağlantısı");
    }
    
    public void kayitEkleme(int id, String name, String gameMode, int time, int guess) throws Exception
    {
        s = c.createStatement();
        String sql = "";
        sql = String.format("insert into Pplayers (Name, GameMode, Time, Guess) values ('%s','%s','%s','%s');", id, gameMode, time, guess);
        System.out.println("SQL : "+sql);
        s.execute(sql);
    }
    
    public ResultSet listeleme() throws Exception
    {
    s = c.createStatement();
    rS = s.executeQuery("select * from Players");
    return rS;
    }
    
    
    public static void main(String[] args)throws Exception{
        DB db = new DB();
    }
    }
