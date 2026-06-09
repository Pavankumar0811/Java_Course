package Functions_full;

public class Pass_value_string {
    public static void main() {
        String name = messange("pavan","kumar");
        String name2 = messange("bhavana","kumar");

        System.out.println(name);
        System.out.println(name2);
    }

    static String messange(String name,String father){
        String ar = name + father;
        return ar;
    }
}
