package Connect;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

public class MakeConnection {
    public static void main(String[] args) {
        try (MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017")) {
            MongoDatabase db = mongoClient.getDatabase("T3BATCH");
            MongoCollection<Document> collection = db.getCollection("Abhinav");

            Document doc = new Document("name", "AMRUTVAHINI");
            collection.insertOne(doc);

            System.out.println("Document inserted successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
