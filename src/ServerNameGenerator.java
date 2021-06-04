
public class ServerNameGenerator {

    private static String[] adjectives = {"spiritual", "assorted", "precious", "flagrant", "environmental", "deserted", "toothsome", "subdued", "sturdy", "consistent"};
    private static String[] nouns = {"suggestion", "permission", "quantity", "direction", "solution", "insurance", "revenue", "industry", "sympathy", "inspector"};

    private static String randomElement(String[] strings){
        int randomNum = (int) (Math.random() * strings.length);
        return strings[randomNum];
    }
    public static String makeServerName (String[] arr1, String[] arr2){
        String adj = randomElement(arr1);
        String noun = randomElement(arr2);
        return adj + "-" + noun;
    }

    public static void main(String[] args) {
        System.out.print("Your new server name is: ");
        System.out.println(makeServerName(adjectives, nouns));
    }
}
