
    class Professor extends Employee {
        private int numberOfLectures;
        private double ratePerLecture;

        public Professor(String firstName, String lastName, int id, String department, int numberOfLectures, double ratePerLecture) {
            super(firstName, lastName, id, department);
            this.numberOfLectures = numberOfLectures;
            this.ratePerLecture = ratePerLecture;
        }

        @Override
        public double calculateSalary() {
            return numberOfLectures * ratePerLecture;
        }

        @Override
        public void performDuties() {
            System.out.println(firstName + " " + lastName + " читає " + numberOfLectures + " лекцій.");
        }
    }

