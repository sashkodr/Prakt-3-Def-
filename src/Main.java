public class Main {
    public static void main(String[] args) {

        Professor professor = new Professor("Андрій", "Білик", 1, "Кафедра фізики", 5, 185.0);
        Administrator administrator = new Administrator("Катерина", "Велика", 2, "Адміністрація", 40, 22.0);

        System.out.println(professor.calculateSalary());
        System.out.println(administrator.calculateSalary());
        professor.performDuties();
        administrator.performDuties();
    }
}
