package maps;

public class Student {

        private String firstname;
        private String lastname;
        private double gpa;

        public Student(String firstname, String lastname, double gpa) {
            this.firstname = firstname;
            this.lastname = lastname;
            this.gpa = gpa;
        }

        public String getFirstname() {
            return firstname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public double getGpa() {
            return gpa;
        }

        public void setGpa(double gpa) {
            this.gpa = gpa;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "firstname='" + firstname + '\'' +
                    ", lastname='" + lastname + '\'' +
                    ", gpa=" + gpa +
                    '}';
        }
    }


