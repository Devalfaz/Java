public class demorganslaw {
    public static void main(String[] args) {
        byte a = 0, b = 0;
        int rhs = ~a & ~b;
        int lhs = ~(a | b);
        if (lhs == rhs) {
            System.out.println("First law is proved : ");
            rhs = ~a | ~b;
            lhs = ~(a & b);
            if (lhs == rhs)
                System.out.println("Second Law is proved : ");
            else
                System.out.println("Can't prove");

        }
    }
}
