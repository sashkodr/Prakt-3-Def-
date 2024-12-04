
    class Administrator extends Employee {
        private int hoursWorked;
        private double hourlyRate;

        public Administrator(String firstName, String lastName, int id, String department, int hoursWorked, double hourlyRate) {
            super(firstName, lastName, id, department);
            this.hoursWorked = hoursWorked;
            this.hourlyRate = hourlyRate;
        }

        @Override
        public double calculateSalary() {
            return hoursWorked * hourlyRate;
        }

        @Override
        public void performDuties() {
            System.out.println(firstName + " " + lastName + " займається адміністративними справами університету.");
        }
    }

