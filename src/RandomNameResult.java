import org.json.JSONObject;

public class RandomNameResult {

    private String name;

    public RandomNameResult(JSONObject jsonObject){
        this.name = jsonObject.get("name").toString();
    }

    public String getName() {
        return this.name;
    }
}