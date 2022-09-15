public class EmployeeLinkedList {
    /*
    The class for creating the employee with name and supervisor
     */
    public class Employee {
        String name;
        Employee supervisor;

        public Employee(String name, Employee supervisor) {
            this.name = name;
            this.supervisor = supervisor;
        }
    }

    /*
    Print the supervisor of one employee
     */
    public void printSupervisor(Employee emp) {
        // If the employee do not have supervisor => He/She is a boss
        if(emp.supervisor == null) {
            System.out.println(emp.name + " is the boss and has no supervisor!");
        }
        else {
            Employee runner;
            runner = emp.supervisor;

            // If the supervisor of the employee has no supervisor => his/her supervisor is the boss
            if(runner.supervisor == null) {
                System.out.println( emp.name  + " reports directly to the boss." );
            }
            else {
                int count = 0; // counting for the supervisor level from the employee to the boss
                while (runner.supervisor != null) {
                    count++;
                    runner = runner.supervisor; // Move up to the next level
                }
            }
        }
    }
}
