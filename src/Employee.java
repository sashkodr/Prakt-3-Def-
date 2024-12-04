
    abstract class Employee implements Workable {
        protected String firstName;
        protected String lastName;
        protected int id;
        protected String department;

        public Employee(String firstName, String lastName, int id, String department) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.id = id;
            this.department = department;
        }

        public abstract double calculateSalary();
    }

