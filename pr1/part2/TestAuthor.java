package pr1.part2;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Tan Ah Teck", "ahTeck@somewhere.com", 'M');
        System.out.println(a1);
        System.out.println("Имя: " + a1.getName() + ", пол: " + a1.getGender());

        a1.setEmail("teck@new.com");
        System.out.println("После setEmail: " + a1.getEmail());
        System.out.println(a1);

        Author a2 = new Author("Sue Grant", "suGrant@somewhere.com", 'F');
        System.out.println(a2);
    }
}
