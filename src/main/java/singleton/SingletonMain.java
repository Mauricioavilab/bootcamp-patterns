package singleton;

public class SingletonMain {

    public static void main(String[]arg){
//        MongoDBClient mongoDBClient = MongoDBClient.getClient();
//        System.out.println(mongoDBClient.getData());
//        MongoDBClient mongoDBClient2 = MongoDBClient.getClient();
//        System.out.println(mongoDBClient2.getData());
//        MongoDBClient mongoDBClient3 = MongoDBClient.getClient();
//        System.out.println(mongoDBClient3.getData());

        MySqlDBClient mysqlDBClient = MySqlDBClient.getClient();
        System.out.println(mysqlDBClient.getData());
        System.out.println("tester");

    }
}
