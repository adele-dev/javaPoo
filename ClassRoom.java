public class ClassRoom {
    public static void main(String[] args) {
        Wilder jeanC = new Wilder("Jean-Claude", true);
        Wilder henri = new Wilder("Henri", false);
        Wilder loulou = new Wilder("Loulou", false);
        System.out.println(jeanC.whoAmI());
        System.out.println(henri.whoAmI());
        System.out.println(loulou.whoAmI());
    }
}
